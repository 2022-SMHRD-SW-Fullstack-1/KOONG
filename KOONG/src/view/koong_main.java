package view;

import java.util.Scanner;

import controller.koong_login;
import controller.koong_play;
import controller.koong_status;
import model.UserDAO;
import music.musiccontroller;

public class koong_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		koong_login log = new koong_login();
		koong_status con = new koong_status();
		koong_play pl = new koong_play();
		UserDAO dao = new UserDAO();
		musiccontroller mc = new musiccontroller();
		
		int result = 0;
		String nick = "";
		while (true) { // 메인화면

			mc.mainplay();
			
			System.out.print("[1]로그인 \t [2]회원가입    >>   ");
			int select = sc.nextInt();

			if (select == 1) {
				
				System.out.println("==========================================");
				System.out.println("Ｏ(≧∇≦)Ｏ\t\t 로그인 \t\to(≧∇≦o)");
				System.out.println("==========================================");
				System.out.print("로그인 할 아이디 : ");
				String id = sc.next();
				System.out.print("로그인 할 패스워드 : ");
				String pw = sc.next();

				nick = log.conLogin(id, pw);

				if (nick != null) {
					System.out.println("=====================================================================================");
					System.out.println("\t\t\t환영합니다!\t\t" + nick + "님");
					System.out.println("=====================================================================================");
					break; //로그인 성공시 반복문 나감
				} else {
					System.out.println("로그인 실패");
				}
				
			} else if (select == 2) {
				System.out.println("==========================================");
				System.out.println("Ｏ(≧∇≦)Ｏ\t\t 회원가입 \t\to(≧∇≦o)");
				System.out.println("==========================================");
				System.out.print("가입 할 아이디 : ");
				String id = sc.next();
				System.out.print("가입 할 패스워드 : ");
				String pw = sc.next();

				result = log.conInsert(id, pw);
				if (result > 0) {
					System.out.println("✿˘◡˘✿\t\t 가입 완료!! 환영합니다 \t\t✿˘◡˘✿ ");
				} else {
				
					System.out.println("\t๐·°(৹˃ᗝ˂৹)°·๐\t\t  가입에 실패했어요  \t\t\t๐·°(৹˃ᗝ˂৹)°·๐");
					System.out.println("=====================================================================================");
				}
			}
		}
		System.out.println(
				  "#    #     ##       ##     #    #     ###       #    #     ##       ###    #    #  \n"
				+ "#   #     #  #     #  #    ##   #    #   #      #    #    #  #     #   #   #    #  \n"
				+ "#  #     #    #   #    #   # #  #   #           #    #   #    #   #        #    #  \n"
				+ "###      #    #   #    #   #  # #   #   ###      #  #    ######   #   ###  #    #  \n"
				+ "#  #     #    #   #    #   #   ##   #     #      ##      #    #   #     #  #    #  \n"
				+ "#   #     #  #     #  #    #    #    #   #       #       #    #    #   #   #    #  \n"
				+ "#    #     ##       ##     #    #     ###        #       #    #     ###     ####");
		System.out.println("=====================================================================================");
		
		while(true) {
			
			//
			System.out.print("[1]게임 시작 [2]선수 뽑기 [3]내 선수 확인 [4]랭킹 확인 [5]게임 종료  >>  ");
			int select = sc.nextInt();
			
			if(select==1) {
				mc.ingameplay();
				pl.play(nick);
				mc.stop();
				mc.mainplay();
			}else if(select==2) {
		
					con.draw(nick);
					System.out.print("남은 쿠폰 개수 :  ");
					System.out.println(dao.coupon_cnt(nick));
					System.out.println("=====================================================================================");
				
			}else if(select==3) {
				con.my_Koong(nick);
			}else if(select==4) {
				con.ranking();
			}else if(select==5) {
				System.out.println("=====================================================================================");
				System.out.println("\t\tෆ⸒⸒⸜( ˶'ᵕ'˶)⸝ \t\t  다음에 또 봐요! \t\t ෆ⸒⸒⸜( ˶'ᵕ'˶)⸝");
				System.out.println("=====================================================================================");
				break;
			}

		}
		
	}

}
