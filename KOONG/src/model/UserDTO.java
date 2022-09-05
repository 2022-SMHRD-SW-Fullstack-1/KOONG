package model;

public class UserDTO {

	private String id;
	private String pw;
	private String koong_name;
	private String koong_rate;
	private int koong_cnt;
	private int koong_stat;
	private int main_char;
	
	
	// select 기능 사용시 arraylist에 담을 id,nick을 하나의 생성자로 만들기
	
	public String getId() {
		return id;
	}
	public int getKoong_cnt() {
		return koong_cnt;
	}
	public int getMain_char() {
		return main_char;
	}

	public UserDTO(String id) {
		this.id = id;
	}
	public UserDTO(int main_char) {
		this.main_char = main_char;
	}
	public UserDTO(String id,int koong_cnt) {
		this.id = id;
		this.koong_cnt = koong_cnt;
	}
	
	public void addKoong(String koong_name, String koong_rate, int koong_stat) {
		this.koong_name = koong_name;
		this.koong_rate = koong_rate;
		this.koong_stat = koong_stat;
		
	}
	
}
//