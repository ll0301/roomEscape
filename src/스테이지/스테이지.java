package 스테이지;

import java.io.File;
import java.util.ArrayList;

import javax.sound.midi.Track;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import org.w3c.dom.events.MouseEvent;

import 배경음악.뮤직;


public class 스테이지 {
	
	String 이름;
	// 배경음악
	// 제한시간
	
	ArrayList<Track> 트랙리스트 = new ArrayList<Track>();
	
	private 뮤직 선택음악;
	private int 현재선택 = 0;  
	
	
	
	
	public 스테이지() {
		
		뮤직 배경음악 = new 뮤직("Day_of_Chaos.mp3", true);
		배경음악.start();

	}
	

	
	
		
	}
	


