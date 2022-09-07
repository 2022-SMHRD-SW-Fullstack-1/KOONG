package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Ascii;
import model.UserDAO;
import model.koongDTO;
import music.musiccontroller;

public class koong_play {

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	Ascii ac = new Ascii();
	musiccontroller mc = new musiccontroller();

	UserDAO dao = new UserDAO();

	public void play(String nick) {

		int cnt = 0; // 회수를 나타내는 변수
		int oct = 0; // 아웃카운트 3이되면 반복문을 빠져나가 게임패배
		int sct = 0; // 스트라이크 카운트 3이 쌓이면 아웃카운트 하나가 쌓임.
		int score = 0; // 스코어 초기값
		int run_cnt = 0; // 주자 카운트

		// 내가 보유한 선수들을 모두 출력(번호, 이름, 능력치)
		ArrayList<koongDTO> player = new ArrayList<>();
		player = dao.select(nick);
		System.out.println("=====================================================================================");
		System.out.println();
		System.out.println("┌─────────────────────────────────┐\r\n"
				+ "     "+player.get(0).getId() + "님의 보유 선수 목록    \r\n"
				+ "└─────────────────────────────────┘\r\n");
		
		//System.out.println(player.get(0).getId() + "님의 보유 선수 목록");
		//System.out.println("=====================================================================================");
		for (int i = 0; i < player.size(); i++) {
			System.out.print("< 선택" + (i + 1) + " >\n[등번호]    [쿵야명]    [타격력]"+ "\n   " + player.get(i).getNum() + "       " + player.get(i).getName());
			System.out.println("     \t"+player.get(i).getPower() + "\n");
		}

		// 5명을 선발하는 과정
		ArrayList<koongDTO> list = new ArrayList<>();
		System.out.println("1번부터 6번 타석까지 선택해주세요.(선택번호를 입력)");
		for (int i = 0; i < 6; i++) {
			System.out.print(i + 1 + "번째 타자 선발 : ");
			int select = sc.nextInt();
			list.add(player.get(select - 1));
			System.out.println(i + 1 + "번째 타자 : " + player.get(select - 1).getName() + "\n");
		}
		mc.playballsound();

		// 적 투수의 이름과 능력치, 아스키코드 ( 랜덤 생성 )
		int enemy_status = rd.nextInt(61) + 39;

		while (true) {

			if (cnt >= 6) { //
				cnt = 0;
			}

			// 첫번째 선수 등장 배열 0번째부터 띄워줌.
			System.out.println("===========================");
			ac.ascii(list.get(cnt).getNum());
			System.out.println((cnt + 1) + "번 타자!!\t" + list.get(cnt).getName() + "선수 ~ !");

			System.out.println("     _  _    ___ \r\n"
					+ "    ( \\/ )  / __)\r\n"
					+ "     \\  /   \\__ \\\r\n"
					+ "      \\/    (___/");

			// 적투수의 정체를 밝히기
			System.out.print("     악당투수! 등장!\n");
			ac.ascii(13); // 적 투수의 아스키코드
			System.out.print("    <<투 구 력 : " + enemy_status + ">>\n");
			System.out.println("===========================");
			
			// 내선수와 적투수의 능력치 차이 계산 후(스트라이크, 안타, 홈런 계산)
			int enemy_win_dif = 0; // 적이 능력치가 우세할 때
			int my_win_dif = 0; // 아군이 능력치가 우세할 떄
			char res = 0;// 주자를 진행시키기 위한 변수

			if (enemy_status > list.get(cnt).getPower()) {
				enemy_win_dif = enemy_status - list.get(cnt).getPower();
			} else if (list.get(cnt).getPower() > enemy_status) {
				my_win_dif = list.get(cnt).getPower() - enemy_status;
			}

			for (int i = 1; i <= 3; i++) {

				System.out.println("strike count : "); // 스트라이크 카운트 표시
				for (int j = 0; j < sct; j++) {
					System.out.print("●  ");
				}
				for (int k = 3; k > sct; k--) {
					System.out.print("○  ");
				}

				System.out.println("\nout count : "); // 아웃 카운트 표시
				for (int j = 0; j < oct; j++) {
					System.out.print("●  ");
				}
				for (int k = 3; k > oct; k--) {
					System.out.print("○  ");
				}

				System.out.println("\n======================================================");
				System.out.print("현재 점수는 " + score + "점! ");
				System.out.println("\n======================================================");
				if (run_cnt == 1) {
					System.out.println("주자 1루!");
				} else if (run_cnt == 2) {
					System.out.println("주자 1,2루!");
				} else if (run_cnt == 3) {
					System.out.println("주자 만루!");
				}

				System.out.println("\n9번을 눌러 타격하세요!");// 타격음 효과 추가
				int hit = sc.nextInt();
				time();

				if (my_win_dif == 0 && enemy_win_dif <= 20) {
					int rate = rd.nextInt(10) + 1; // 적이 우세임에도 안타를 칠 수도 있는 확률
					if (rate < 8) {
						mc.strikesound();
						System.out.println("Strike!\n");// 스트라이크
						sct++;
					} else if (rate <= 10) {// 8,9,10이 나올 경우.
						mc.hitsound();
						System.out.println("이 투구를 쳐내네요!!!\n");// 안타
						res = 'a';
						time();
						sct = 0;
						break;
					}
				} else if (my_win_dif == 0 && enemy_win_dif > 15) {// 20보다 더 차이나면 90확률로 스트라이크
					int rate = rd.nextInt(10) + 1;
					if (rate <= 9) {
						mc.strikesound();
						System.out.println("Strike!\n");// 스트라이크
						sct++;
					} else if (rate <= 10) {
						mc.hitsound();
						System.out.println("이 투구를 쳐내네요!!!\n");// 안타
						res = 'a';
						time();
						sct = 0;
						break;
					}
				}

				if (enemy_win_dif == 0 && my_win_dif <= 15) {
					int rate = rd.nextInt(10) + 1; // 내가 우세임에도 스트라이크를 당할 확률
					if (rate < 8) {
						mc.hitsound();
						System.out.println(list.get(cnt).getName() + "! 공을 쳐냅니다! 안타!\n");// 안타
						res = 'a';
						time();
						sct = 0;
						break;
					} else if (rate <= 10) {// 8,9,10이 나올 경우.
						mc.strikesound();
						System.out.println("Strike!\n");// 스트라이크
						sct++;
					}
				} else if (enemy_win_dif == 0 && my_win_dif <= 50) {
					mc.hitsound();
					System.out.println("안타를~ 쳤습니다!\n");// 안타
					res = 'a';
					time();
					sct = 0;
					break;
				} else if (enemy_win_dif == 0 && my_win_dif > 50) {
					mc.hitsound();
					time();
					time();
					mc.homerunsound();
					System.out.println("담장을 넘어갑니다!! 홈런~!\n");// 홈런
					time();
					res = 'h';
					sct = 0;
					break;
				}

				if (enemy_win_dif == my_win_dif) { // 두 선수가 능력치가 같을때 6:4확률로 설정.
					System.out.println("라이벌 간의 대결 승자는?!");
					int rate = rd.nextInt(10) + 1;
					if (rate <= 4) {
						mc.strikesound();
						System.out.println("Strike!\n");// 스트라이크
						sct++;
					} else if (rate <= 10) {
						mc.hitsound();
						System.out.println("라이벌간의 뜨거운 싸움!" + list.get(cnt).getName() + "선수가 안타를 쳐냅니다~!\n");// 안타
						res = 'a';
						sct = 0;
						time();
						break;
					}
				}
			} // 타격 for문

			if (sct == 3) {// 스트라이크 3번 맞았을 때 아웃카운트 증가
				time();
				time();
				mc.outsound();
				System.out.println("삼진 아웃!");
				time();
				time();
				
				sct = 0;
				oct++;
			}

			if (oct == 3) {// 3아웃시 게임종료
				System.out.println();
				System.out.println("======================================================");
				System.out.println("\\t ·°( ˃_˂ )°· \\t  3아웃으로 패배했어요  \\t\\t ·°( ˃_˂ )°· ");
				System.out.println("(^ _ ^)b  걱정마세요 출전한 선수들의 능력치가 1 상승했어요!!  d(^ _ ^)");
				System.out.println("======================================================");
				dao.Training(nick, list.get(0).getNum(), list.get(1).getNum(), list.get(2).getNum(),
						list.get(3).getNum(), list.get(4).getNum(), list.get(5).getNum());
				break;
			}
			cnt++;
			// 주자 표시
			// 카운트 두개 생성 후 res 값에 따라 증가,
			// 조건문으로 문자열을 받아 주자 표시

			if (res == 'a') {
				run_cnt++;// 주자 추가.
			} else if (res == 'h') {
				score++;// 홈런을 친 본인 증가.
				for (int i = 0; i < run_cnt; i++) {// 주자수만큼 스코어 증가.
					score++;
				}
				run_cnt = 0;
			}

			if (run_cnt >= 4) {// 안타를 쳐서 주자가 4명이 될때 3명으로 줄이고 점수 1점 추가.
				run_cnt = 3;
				score++;
			}

			// 점수를 10점 이상 냈을때 쿠폰 1개발급 -> 종료
			if (score >= 10) {
				dao.PlusCoupon(nick);
				System.out.println("게임에서 승리하였습니다.");
				dao.Training(nick, list.get(0).getNum(), list.get(1).getNum(), list.get(2).getNum(),
						list.get(3).getNum(), list.get(4).getNum(), list.get(5).getNum());
				break;
			}
		} // while문 끝 중괄호

	}// play 메서드 종료 중괄호

	public void time() { // 지연시키는 타임메서드 추가.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
