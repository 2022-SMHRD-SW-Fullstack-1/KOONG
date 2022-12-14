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
				System.out.print("쿠폰을 사용하고싶으면 아무키나 눌러주세요 >> ");
				String cpn_select = sc.next();
				
				dao.browse_koong(nick);
				
			}else {
				System.out.println("=====================================================================================");
				System.out.println("\t\t ·°( ˃_˂ )°· \t\t  쿠폰이 없어요  \t\t ·°( ˃_˂ )°· ");
				System.out.println("=====================================================================================");
			}
			
		
		
		
		
		
	}

	@Override
	public void my_Koong(String nick) {
		
		ArrayList<UserDTO> resultlist = new ArrayList<>();
		
		resultlist = dao.havekoong(nick);
		
		System.out.println("=====================================================================================");
		System.out.println("[쿵야이름]\t[쿵야등급]\t[쿵야파워]");
		for(int i =0; i<resultlist.size(); i++) {
			System.out.print(resultlist.get(i).getKoong_name()+"\t");
			System.out.print("   "+resultlist.get(i).getKoong_rate()+"\t\t");
			System.out.print("   "+resultlist.get(i).getKoong_power());
			System.out.println();
		}
		Ascii as = new Ascii();
		while(true) {
			System.out.println("===========================================");
			System.out.println(" [1]대표 쿵야 설정 [2]쿵야 자세히 보기 [3]창 닫기");
			System.out.println("===========================================");
			int choice = sc.nextInt();
			if(choice==1) {
				System.out.println("대표로 설정할 쿵야를 불러주세요!!");
				String ya = sc.next();
				dao.represent(ya,nick);
				System.out.println(ya+"는 이제부터 대표쿵야!!");
			
			}else if(choice == 2) {
				System.out.println("자세히 보고싶은 쿵야를 불러주세요!!");
				String ya = sc.next();
				dao.zoom(ya);
				
			}else if(choice == 3) {
				break;
			}
			
		}
		
	}

	@Override
	public void ranking() {
		ArrayList<UserDTO> resultlist = new ArrayList<>();
		ArrayList<UserDTO> resultlist2 = new ArrayList<>();
		
		resultlist = dao.main_koong();
		resultlist2 = dao.myMainChar();
		
		if(resultlist.size()>4) {
			for(int i = 0 ; i<=4 ; i++) {
				System.out.println("=====================================================================================\n");
				System.out.println(i+1+"위 [ "+resultlist.get(i).getId()+" ]\n");
				System.out.println("<<대표 캐릭터>>");
				asc.ascii(resultlist2.get(i).getMain_char());
				System.out.println("보유 캐릭터 수 [ "+resultlist.get(i).getKoong_cnt()+" ]");
			}
			
		}else {
			for(int i = 0 ; i<resultlist.size() ; i++) {
				System.out.println("=====================================================================================\n");
				System.out.println(i+1+"위 [ "+resultlist.get(i).getId()+" ]\n");
				System.out.println("<<대표 캐릭터>>");
				asc.ascii(resultlist2.get(i).getMain_char());		
				System.out.println("보유 캐릭터 수 [ "+resultlist.get(i).getKoong_cnt()+" ]");
			}
		}
	}

}
