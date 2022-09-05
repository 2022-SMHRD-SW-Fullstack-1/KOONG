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
		int oct = 0; // 아웃카운트 1이되면 반복문을 빠져나가 종료

		// 내가 보유한 선수들을 모두 출력(번호, 이름, 능력치)
		ArrayList<koongDTO> player = new ArrayList<>();
		player = dao.select(nick);

		System.out.println(player.get(0).getId() + "님의 보유 선수 목록");
		for (int i = 0; i < player.size(); i++) {
			System.out.print("선택" + (i + 1) +" "+player.get(i).getNum() + ". " + player.get(i).getName());
			System.out.println(" / 타 격 력 : " + player.get(i).getPower() + "\n");
		}

		// 5명을 선발하는 과정
		ArrayList<koongDTO> list = new ArrayList<>();
		System.out.println("1번부터 5번 타석까지 선택해주세요.(선택번호를 입력)");
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1 + "번째 타자 선발 : ");
			int select = sc.nextInt();
			list.add(player.get(select - i));
			System.out.println(i+1 + "번째 타자 : " + player.get(select - 1).getName()+"\n");
		}

		while (true) {
			// 첫번째 선수 등장 배열 0번째부터 띄워줌.
			System.out.println("======================================================");
			ac.ascii(list.get(cnt).getNum());
			System.out.println((cnt + 1) + "번째 타자!!\t" + list.get(cnt).getName() + "선수 ~ !");

			System.out.println("우리팀의 상대 투수느으은 ~ ?");

			// 적 투수의 이름과 능력치, 아스키코드 ( 랜덤 생성 )
			int enemy_num = rd.nextInt(11) + 1;
			int enemy_status = 0;
			ac.ascii(enemy_num); // 적 투수의 아스키코드
			System.out.print("상대팀 투수\n등번호 " + enemy_num + "번 " + dao.enemy(enemy_num) + " 선수\n");

			if (enemy_num <= 3) {
				enemy_status = rd.nextInt(30) + 70;
			} else if (enemy_num <= 12) {
				enemy_status = rd.nextInt(49) + 20;
			}
			System.out.print("투 구 력 : " + enemy_status+"\n");

			// 내선수와 적투수의 능력치 차이 계산 후(스트라이크, 안타, 홈런 계산)
			int dif = 0;
			char res;
			if (enemy_status > list.get(cnt).getPower()) {
				dif = enemy_status - list.get(cnt).getPower();
			} else {
				dif = list.get(cnt).getPower() - enemy_status;
			}

			for (int i = 1; i <= 3; i++) {
				System.out.println("1번을 눌러 타격하기.");
				int hit = sc.nextInt();

				if (dif < 10) {
					System.out.println("Strike!");// 스트라이크
					res = 's';
				} else if (dif < 50) {
					System.out.println("안타를~ 쳤습니다!");// 안타
					res = 'a';
					break;
				} else if (dif >= 50) {
					System.out.println("담장을 넘어갑니다!! 홈런~!");// 홈런
					res = 'h';
					break;
				}
				oct = i;
			}
			if (oct == 3) {// 스트라이크 3번 맞았을 때 게임종료
				System.out.println("삼진 아웃!");
				break;
			}
			// 주자 표시

			// 점수를 10점 이상 냈을때 쿠폰 1개발급 -> 종료
		}
	}
}
