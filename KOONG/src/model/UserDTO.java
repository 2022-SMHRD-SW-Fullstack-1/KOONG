package model;

public class UserDTO {

	private String id;
	private String pw;
	
	// select 기능 사용시 arraylist에 담을 id,nick을 하나의 생성자로 만들기
	
	public String getId() {
		return id;
	}



	public UserDTO(String id) {
		this.id = id;
	}
	
}
