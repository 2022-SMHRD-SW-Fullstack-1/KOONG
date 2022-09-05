package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Ascii;
import model.UserDAO;
import model.UserDTO;

public class koong_status implements koongstatus {
	Scanner sc = new Scanner(System.in);
	UserDAO dao = new UserDAO();
	Ascii asc = new Ascii();
	ArrayList<UserDTO> ar = new ArrayList<>();
		
	@Override
	public void draw(String nick) {
		
			if(dao.coupon_cnt(nick)>0) {
				System.out.print("쿠폰을 사용하시겠습니까? (y/n) >> ");
				String cpn_select = sc.next();
				
				dao.browse_koong(nick);
				
			}else {
				System.out.println("쿠폰이 없습니다");
			}
			
		
		
		
		
		
	}

	@Override
	public void my_Koong() {
		
		System.out.println("선수:");
		System.out.println("능력:");
		
		
	}

	@Override
	public void ranking() {
		ArrayList<UserDTO> resultlist = new ArrayList<>();
		ArrayList<UserDTO> resultlist2 = new ArrayList<>();
		
		resultlist = dao.main_koong();
		resultlist2 = dao.myMainChar();
		
		if(resultlist.size()>=4) {
			for(int i = 0 ; i<=4 ; i++) {
				System.out.println("==============================\n");
				System.out.println(i+1+"위 [ "+resultlist.get(i).getId()+" ]\n");
				System.out.print("<<대표 캐릭터>>");
				asc.ascii(resultlist2.get(i).getMain_char());
				System.out.println("보유 캐릭터 수 [ "+resultlist.get(i).getKoong_cnt()+" ]");
			}
			
		}else {
			for(int i = 0 ; i<=resultlist.size() ; i++) {
				System.out.println("==============================\n");
				System.out.println(i+1+"위 [ "+resultlist.get(i).getId()+" ]\n");
				System.out.print("<<대표 캐릭터>>");
				asc.ascii(resultlist2.get(i).getMain_char());		
				System.out.println("보유 캐릭터 수 [ "+resultlist.get(i).getKoong_cnt()+" ]");
			}
		}
	}

}
