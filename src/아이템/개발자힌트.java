package 아이템;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class 개발자힌트 extends 아이템 {
	
	
	public int 힌트움직임 ;
	
	public int get힌트움직임() {
		return 힌트움직임;
	}

	public void set힌트움직임(int 힌트움직임) {
		this.힌트움직임 = 힌트움직임;
	}

	public void 개발자번호증가(개발자힌트 개발자힌트) {
		개발자힌트.번호 = +1;
	} 


	public int 개발자최대힌트 = 100;
	개발자힌트[] 개발자힌트정보 = new 개발자힌트[개발자최대힌트];

	public int 순서;


	public 개발자힌트(){
		순서 = 0;
	}

	public 개발자힌트(String 이름, int 번호){
	    this.이름 = 이름;
	    this.번호 = 번호;
	 
	}

	public void 개발자아이디증가(){    
		순서 = 순서 + 1;
		
	}

	public void 개발자아이디초기화() {
		순서 = 0;
	}

	public void set개발자힌트아이디(){
	    개발자힌트정보[순서].순서 = 순서;
	}

	public void 개발자힌트만들기(String 이름, int 번호){
		
	   if (순서 < 개발자최대힌트){    
		   
	        	개발자힌트정보[순서] = new 개발자힌트(이름, 번호);
	        set개발자힌트아이디();
	        개발자아이디증가();
	        
	        set힌트움직임(1);
	        
	        try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
	   } else {
	       System.out.println("아이템이 꽉 찾습니다.");
	   } 
	}

	public void 개발자힌트지우기(String 이름, int 번호){
		   if (순서 < 개발자최대힌트){        
		        개발자힌트정보[순서] = new 개발자힌트(이름, 번호);
		        set개발자힌트아이디();
		        개발자아이디초기화();
		   } 
		}



	public void 개발자힌트질문(int id){
	    System.out.println(개발자힌트정보[순서].순서 + " " + 개발자힌트정보[순서].이름 + " " + 
	            개발자힌트정보[순서].번호 );
	}

	public void 개발자힌트리스트보기(){
		 try
		 {
		 AudioInputStream ais9 = AudioSystem.getAudioInputStream
				 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\click.wav"));
		Clip clip9 = AudioSystem.getClip();
		clip9.stop();
		clip9.open(ais9);
		clip9.start();
		 }
		 catch (Exception ex)
		 {
		 } 
	    System.out.println("**개발자힌트**");
	    for (int i = 0; i < 순서; i++){
	    	System.out.println(개발자힌트정보[i].이름 );
	    	
	    }

	}
	}

