package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class UserDAO {
	// DAO : data Access Object
		// 데이터베이스의 data에 접근을 위한 객체
		Connection conn = null;
		PreparedStatement psmt = null;
		PreparedStatement psmt2 = null; //쿠폰 담아줄 객체 
		ResultSet rs = null;
		ResultSet rs2 = null;
		int cnt = 0;
		int cpn = 0;

		// (메소드로 로직 정리하기)
		public void getCon() {

			try {
				// 1. Class.forName()
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// 2. 데이터 베이스 url, id, pw연결
				String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
				String id = "campus_k_0830_6";
				String pw = "smhrd6";

				conn = DriverManager.getConnection(url, id, pw);

				/*
				 * if (conn != null) { System.out.println("연결완료"); } else {
				 * System.out.println("연결실패"); }
				 */

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		// 사용된 객체를 닫아주는 메소드
		public void close() {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// [1] 회원가입
		// -db접속 - sql문장 실행 - 연결종료
		public int insert(String id, String pw) {
			getCon();

			String sql = "insert into user_info(ID, PASSWORD) values(?, ?)";
			String sql2 = "update user_info set coupon = 5 where coupon is null";
			
			try {
				psmt = conn.prepareStatement(sql);
				psmt2 = conn.prepareStatement(sql2);

				psmt.setString(1, id);
				psmt.setString(2, pw);			
				
				
				cnt = psmt.executeUpdate();
				psmt2.executeUpdate();
	

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				close();
			}

			return cnt;
		}

		// [2] 로그인
		// -db접속 - sql문장 실행 - 연결종료
		public String login(String id, String pw) {
			String log = ""; //결과값 리턴을 위한 변수
			
			getCon();

			String sql = "select id from user_info where id = ? and password = ?";

			try {
				psmt = conn.prepareStatement(sql);

				psmt.setString(1, id);
				psmt.setString(2, pw);

				rs = psmt.executeQuery();
//
				
				if (rs.next()) {
					log = rs.getString(1);
				}else {
					log = null;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close();
			}
			return log;
		}
		
		public String browse_koong() {
			String koong_name = "";
			String koong_rate = "";
			int koong_stat = 0;
			//ArrayList<UserDTO> addList = new ArrayList<>();
			
			getCon();
			
			String sql = "select koong_name, koong_rate from koong_info where koong_num = ? ";
			
			
			try {
				psmt = conn.prepareStatement(sql);
			
				Random rd = new Random();
				int newKoong = rd.nextInt(12)+1;
				
				psmt.setInt(1,newKoong);
				
				rs = psmt.executeQuery();
				
				if(rs.next()) {
					
					koong_name = rs.getString(1);
					koong_rate = rs.getString(2);
					//koong_stat = rd.nextInt(100)+1;
					
					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close();
			} return koong_name + "\t"+ koong_rate +"\t";			
		
			
		}
		
		
		public void mainkoong(int 랭킹) {
			// 랭킹을 매개변수로 받아 매개변수에 적힌 랭킹과 같은 랭킹을 가진
			// 아이디의 대표쿵야를 출력
			
//			"select id from user name where "
//			.setString(1);		//해당 랭킹의 아이디
//			select main_char from user_id where id = ?//
//			.setString(1);		//해당 아이디의 대표쿵야 번호
//			ascii(해당 아이디의 대표쿵야 번호)
			
		}
		
		
}