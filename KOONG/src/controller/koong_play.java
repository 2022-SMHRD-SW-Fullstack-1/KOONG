package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Ascii;
import model.UserDAO;
import model.koongDTO;

public class koong_play {

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	Ascii ac = new Ascii();

	UserDAO dao = new UserDAO();

	public void play(String nick) {

		int cnt = 0; // 회수를 나타내는 변수
		int oct = 0; // 아웃카운트 3이되면 반복문을 빠져나가 게임패배
		int sct = 0; // 스트라이크 카운트 3이 쌓이면 아웃카운트 하나가 쌓임.
		int score = 0; // 스코어 초기값
		
		// 내가 보유한 선수들을 모두 출력(번호, 이름, 능력치)
		ArrayList<koongDTO> player = new ArrayList<>();
		player = dao.select(nick);

		System.out.println(player.get(0).getId() + "님의 보유 선수 목록");
		for (int i = 0; i < player.size(); i++) {
			System.out.print("선택" + (i + 1) + " " + player.get(i).getNum() + ". " + player.get(i).getName());
			System.out.println(" / 타 격 력 : " + player.get(i).getPower() + "\n");
		}

		// 5명을 선발하는 과정
		ArrayList<koongDTO> list = new ArrayList<>();
		System.out.println("1번부터 5번 타석까지 선택해주세요.(선택번호를 입력)");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번째 타자 선발 : ");
			int select = sc.nextInt();
			list.add(player.get(select - 1));
			System.out.println(i + 1 + "번째 타자 : " + player.get(select - 1).getName() + "\n");
		}

		// 적 투수의 이름과 능력치, 아스키코드 ( 랜덤 생성 )
		int enemy_num = rd.nextInt(11) + 1;
		int enemy_status = 0;

		if (enemy_num <= 3) {
			enemy_status = rd.nextInt(30) + 70;
		} else if (enemy_num <= 12) {
			enemy_status = rd.nextInt(49) + 20;
		}

		while (true) {
			// 첫번째 선수 등장 배열 0번째부터 띄워줌.
			System.out.println("======================================================");
			ac.ascii(list.get(cnt).getNum());
			System.out.println((cnt + 1) + "번째 타자!!\t" + list.get(cnt).getName() + "선수 ~ !");

			System.out.println("우리팀의 상대 투수느으은 ~ ?");

			// sleep이나 timer로 지연가능

			// 적투수의 정체를 밝히기
			ac.ascii(enemy_num); // 적 투수의 아스키코드
			System.out.print("상대팀 투수\n등번호 " + enemy_num + "번 " + dao.enemy(enemy_num) + " 선수\n");

			System.out.print("투 구 력 : " + enemy_status + "\n");

			// 내선수와 적투수의 능력치 차이 계산 후(스트라이크, 안타, 홈런 계산)
			int enemy_win_dif = 0; // 적이 능력치가 우세할 때
			int my_win_dif = 0; // 아군이 능력치가 우세할 떄
			char res;//주자를 진행시키기 위한 변수

			if (enemy_status > list.get(cnt).getPower()) {
				enemy_win_dif = enemy_status - list.get(cnt).getPower();
			} else {
				my_win_dif = list.get(cnt).getPower() - enemy_status;
			}

			for (int i = 1; i <= 3; i++) {
				
				System.out.println("strike count : "); //스트라이크 카운트 표시
				for(int j=0; j<sct; j++) {
					System.out.print("●");
				}
				for(int k = 3; k>sct; k--) {
					System.out.print("○");
				}
				
				System.out.println("\n1번을 눌러 타격하기.");//타격음 효과 추가
				int hit = sc.nextInt();

				if (my_win_dif==0&&enemy_win_dif <= 15) {
					int rate = rd.nextInt(9) + 1; // 적이 우세임에도 안타를 칠 수도 있는 확률
					if (rate < 9) {
						System.out.println("Strike!");// 스트라이크
						sct++;
					} else if (rate <= 10) {// 9나 10이 나올 경우.
						System.out.println("이 투구를 쳐내네요!!!");// 안타
						res = 'a';
						break;
					}
				} else if(my_win_dif==0&&enemy_win_dif > 15){// 15보다 더 차이나면 스트라이크
					System.out.println("Strike!");// 스트라이크
				}

				if (enemy_win_dif==0&&my_win_dif <= 15) {
					int rate = rd.nextInt(9) + 1; // 내가 우세임에도 스트라이크를 당할 확률
					if (rate < 8) {
						System.out.println("공을 쳐냅니다! 안타!");// 안타
						res = 'a';
						break;
					} else if (rate <= 10) {// 8,9,10이 나올 경우.
						System.out.println("Strike!");// 스트라이크
						sct++;
					}
				} else if (enemy_win_dif==0&&my_win_dif <= 50) {
					System.out.println("안타를~ 쳤습니다!");// 안타
					res = 'a';
					break;
				} else if(enemy_win_dif==0&&my_win_dif > 50){
					System.out.println("담장을 넘어갑니다!! 홈런~!");// 홈런
					res = 'h';
					break;
				}

			}
			if (sct == 3) {// 스트라이크 3번 맞았을 때 아웃카운트 증가
				System.out.println("삼진 아웃!");
				oct++;
				sct = 0;
			}
			if (oct == 3) {// 3아웃시 게임종료
				System.out.println("3아웃으로 패배하였습니다.");
				break;
			}
			cnt++;
			// 주자 표시	
			
			
			
			// 점수를 10점 이상 냈을때 쿠폰 1개발급 -> 종료
			if(score>=10) {
				dao.PlusCoupon(nick);
				System.out.println("게임에서 승리하였습니다.");
				break;
			}
		}
	}
}
