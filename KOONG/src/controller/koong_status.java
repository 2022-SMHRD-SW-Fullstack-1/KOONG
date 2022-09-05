package controller;

import java.util.Scanner;

import model.UserDAO;

public class koong_status implements koongstatus {
	Scanner sc = new Scanner(System.in);
	UserDAO dao = new UserDAO();
		
	@Override
	public void draw() {
		
		System.out.print("쿠폰을 사용하시겠습니까? (y/n) >> ");
		String cpn_select = sc.next();
		
		System.out.println("아스키코드");
		System.out.println(dao.browse_koong());
		System.out.print("능력치 : ");
		
		
		
		
		
		
	}

	@Override
	public void my_Koong() {
		
		
	}

	@Override
	public void ranking() {
		
	}

}
