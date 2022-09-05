package controller;

import model.UserDAO;
import model.UserDTO;

public class koong_login {

	//뷰와 모델(db의 로직 dao)을 이어주는 컨트롤러 역할
	UserDAO dao = new UserDAO();
	
	int cnt = 0;
	
	public int conInsert(String id, String pw) {
		//view가 넘겨준 회원가입에 대한 정보들을 DAO로 연결해주는 메소드
		cnt = dao.insert(id, pw);
		
		return cnt;
	}
	
	public String conLogin(String id, String pw) {
		String loginid = dao.login(id, pw);

		return loginid;
	}
}
//