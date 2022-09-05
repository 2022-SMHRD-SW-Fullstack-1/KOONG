package view;

import java.util.Scanner;

import controller.koong_login;

public class koong_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		koong_login log = new koong_login();

		int result = 0;

		while (true) { // 메인화면

			System.out.print("[1]로그인 [2]회원가입");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("로그인 아이디 : ");
				String id = sc.next();
				System.out.println("로그인 패스워드 : ");
				String pw = sc.next();

				String nick = log.conLogin(id, pw);

				if (nick != null) {
					System.out.println("환영합니다!" + nick + "님");
					break; //로그인 성공시 반복문 나감
				} else {
					System.out.println("로그인 실패");
				}
			} else if (select == 2) {
				System.out.println("====회원가입 기능====");
				System.out.println("아이디 : ");
				String id = sc.next();
				System.out.println("패스워드 : ");
				String pw = sc.next();

				result = log.conInsert(id, pw);
				if (result > 0) {
					System.out.println("가입 성공");
				} else {
					System.out.println("가입 실패");
				}
			}
		}
		
		

	}

}
