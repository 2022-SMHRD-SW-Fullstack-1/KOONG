package model;

public class UserDTO {

	private String id;
	private String pw;
	private String koong_name;
	private String koong_rate;
	private int koong_stat;
	
	// select 기능 사용시 arraylist에 담을 id,nick을 하나의 생성자로 만들기
	
	public String getId() {
		return id;
	}

	public UserDTO(String id) {
		this.id = id;
	}
	
	public void addKoong(String koong_name, String koong_rate, int koong_stat) {
		this.koong_name = koong_name;
		this.koong_rate = koong_rate;
		this.koong_stat = koong_stat;
		
	}
	
}
//