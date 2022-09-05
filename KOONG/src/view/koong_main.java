package view;

import java.util.Scanner;



public class koong_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		UserCon con = new UserCon();

		while(true) {
			
		System.out.print("[1]로그인 [2]회원가입");
		int log = sc.nextInt();
		
		if(log==1) {
			
			
		}else{
			System.out.println("====회원가입 기능====");
			System.out.println("아이디 : ");
			String id = sc.next();
			System.out.println("패스워드 : ");
			String pw = sc.next();
			
		}
		
		}
		
	}

}
