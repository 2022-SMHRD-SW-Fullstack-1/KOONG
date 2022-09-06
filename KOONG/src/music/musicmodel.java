package music;

public class musicmodel {

	private String songName;
	
	
	// 음악 파일의 경로를 저장할 수 있는 필드!
	private String musicPath;
	
	// 생성자 메소드
	public musicmodel(String songName, String musicPath) {
		super();
		this.songName = songName;
		this.musicPath = musicPath;
	}
	public String getMusicPath() {
		return musicPath;
	}


}
