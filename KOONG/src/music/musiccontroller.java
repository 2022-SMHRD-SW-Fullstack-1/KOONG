package music;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class musiccontroller {

	// Controller 역할을 할 수 있는 클래스!
	// Model과 view를 연결하는 목적!

	// 4개의 곡을 담을 수 있는 ArrayList 생성!
	ArrayList<musicmodel> musiclist = new ArrayList<>();

	// 노래를 재생하거나 정지할 수 있는 기능 불러오기!
	MP3Player mp3 = new MP3Player();

	// musiclist에 있는 노래 순서를 관리할 수 있는 변수 생성
	int index = 0;

	// Controller가 호출 되자마자 세팅되어있는 mp3를 사용할 수 있도록
	// Controller용 생성자 메소드를 만들어 노래정보 저장하기!

	public musiccontroller() {
		
			musiclist.add(new musicmodel("main","music/main.mp3"));
			musiclist.add(new musicmodel("ingame","music/ingame.mp3"));
			musiclist.add(new musicmodel("outsound","music/out.mp3"));
			musiclist.add(new musicmodel("strikesound","music/strike.mp3"));
			musiclist.add(new musicmodel("homerunsound","music/homerun.mp3"));
		}

	public void mainplay() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}

		
		mp3.play(musiclist.get(0).getMusicPath());
		
	}
	public void ingameplay() {
		// 노래가 현재 플레이 되고있는지 아닌지 boolean타입으로 알려주는 메소드 => isPlaying()
		if (mp3.isPlaying()) {
			mp3.stop();
		}

		// 노래 재생을 위한 메소드
		// 호출시 musiclist에 있는 노래를 play!
		mp3.play(musiclist.get(1).getMusicPath());
		// == mp3.play("music/lilac.mp3");
	}
	public void outsound() {
		mp3.play(musiclist.get(2).getMusicPath());
	}
	public void strikesound() {
		mp3.play(musiclist.get(3).getMusicPath());
	}
	public void homerunsound() {
		mp3.play(musiclist.get(4).getMusicPath());
	}

	
	public void stop() {

		// 노래 정지를 위한 메소드
		mp3.stop();
	}

	public void next() {
		// 다음 곡으로 넘어갈 때도 이전 노래는 멈추고 실행해야함
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		// 다음 곡으로 넘어가기 위한 메소드
		index++;
		// 마지막 곡을 실행한후 다음곡으로 첫번째 곡을 실행
		if (index == musiclist.size()) {
			index = 0;
		}
		mp3.play(musiclist.get(index).getMusicPath());
	}


	
}
