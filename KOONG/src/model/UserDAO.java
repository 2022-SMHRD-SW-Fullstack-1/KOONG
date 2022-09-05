package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jdbc_model.MemberDTO;

public class UserDAO {
	// DAO : data Access Object
		// 데이터베이스의 data에 접근을 위한 객체
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		int cnt = 0;

		// (메소드로 로직 정리하기)
		public void getCon() {

			try {
				// 1. Class.forName()
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// 2. 데이터 베이스 url, id, pw연결
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String id = "hr";
				String pw = "hr";

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

			String sql = "insert into user_info values(?, ?)";

			try {
				psmt = conn.prepareStatement(sql);

				psmt.setString(1, id);
				psmt.setString(2, pw);
				
				cnt = psmt.executeUpdate();

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
			String id = ""; //결과값 리턴을 위한 변수
			
			getCon();

			String sql = "select id from user_info where id = ? and password = ?";

			try {
				psmt = conn.prepareStatement(sql);

				psmt.setString(1, id);
				psmt.setString(2, pw);

				rs = psmt.executeQuery();

				if (rs.next()) {
					id = rs.getString(1);
				}else {
					id = null;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close();
			}
			return id;
		}