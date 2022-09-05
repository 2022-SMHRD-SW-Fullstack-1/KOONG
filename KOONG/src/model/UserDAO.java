package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import controller.koong_login;

public class UserDAO {
	// DAO : data Access Object
		// 데이터베이스의 data에 접근을 위한 객체
		Connection conn = null;
		PreparedStatement psmt = null;
		PreparedStatement psmt2 = null; //쿠폰 담아줄 객체 
		PreparedStatement psmt3 = null;
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
		
		
		
		public int coupon_cnt(String nick) {
			
			
			getCon();
			
			String sql = "select coupon from user_info where user_id = ?";
			
			
			try {
				psmt = conn.prepareStatement(sql);
				
				psmt.setString(1, nick);
				
				rs = psmt.executeQuery();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return 0;
		}
		
		public String browse_koong(String nick) {
			koong_login log = new koong_login();
			UserDTO con = new UserDTO(null);
			
			String koong_name = "";
			String koong_rate = "";
			int koong_power = 0;
			
			
			getCon();
			
			
			try {
				String sql = "select koong_name, koong_rate from koong_info where koong_num = ? ";
				psmt = conn.prepareStatement(sql);
				
				Random rd = new Random();
				int koong_num = rd.nextInt(12)+1;
				
				psmt.setInt(1,koong_num);
			
				rs = psmt.executeQuery();
				
				if(rs.next()) {
					
					koong_name = rs.getString(1);
					koong_rate = rs.getString(2);
					
					if(koong_rate.equals("S")) {
						koong_power = rd.nextInt(40)+61;
					}else if(koong_rate.equals("A")) {
						koong_power = rd.nextInt(60)+21;
					}else if(koong_rate.equals("F")) {
						koong_power = rd.nextInt(40)+1;
					}
					
				}
				String sql2 = "insert into my_koong(koong_num,koong_name,koong_power,id) values(?,?,?,?)";
				psmt2 = conn.prepareStatement(sql2);
				psmt2.setInt(1, koong_num);
				psmt2.setString(2, koong_name );
				psmt2.setInt(3, koong_power);
				psmt2.setString(4, nick);
				
				cnt = psmt2.executeUpdate();
	
			
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close();
			} return koong_name + "\t"+ koong_rate +"\n능력치 : "+koong_power;			
		
			
		}
		public ArrayList<koongDTO> select() {
			ArrayList<koongDTO> al = new ArrayList<>();
			// 쿵야의 정보를 담을 수 있는 arraylist 만들기.
			getCon();

			String sql = "select ID, KOONG_NUM, KOONG_NAME, KOONG_POWER from MY_KOONG ORDER BY KOONG_POWER";

			try {
				psmt = conn.prepareStatement(sql);

				rs = psmt.executeQuery();

				while (rs.next()) {
					String idd = rs.getString("id");
					int num = rs.getInt("");
					String name = rs.getString(" ");
					int power = rs.getInt("");

					koongDTO dto = new koongDTO(idd, num, name, power);
					al.add(dto);

				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close();
			}
			return al;
		}
		
		
		public ArrayList<UserDTO> main_koong() {
			
			ArrayList<UserDTO> al = new ArrayList<>();
			
			getCon();
			
			String sql = "select id, koong_cnt from user_info order by koong_cnt desc";
			
			try {
				psmt = conn.prepareStatement(sql);
				
				rs = psmt.executeQuery();
				
				while(rs.next()) {
					String id = rs.getString("id");
					int cnt = rs.getInt("koong_cnt");
					
					UserDTO dto = new UserDTO(id,cnt);
					al.add(dto);
				}
			}catch (Exception e){
				e.printStackTrace();
			}finally {
				close();
			}
			
			
			return al;
		}
		public ArrayList<UserDTO> myMainChar() {
			
			ArrayList<UserDTO> al = new ArrayList<>();
			
			getCon();
			
			String sql = "select main_char from user_info order by koong_cnt desc";
			
			try {
				psmt = conn.prepareStatement(sql);
				
				rs = psmt.executeQuery();
				
				while(rs.next()) {
					int main_char = rs.getInt("main_char");
					
					UserDTO dto = new UserDTO(main_char);
					al.add(dto);
				}
			}catch (Exception e){
				e.printStackTrace();
			}finally {
				close();
			}
			
			
			return al;
		}
		
		
}