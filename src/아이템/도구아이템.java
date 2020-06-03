package 아이템;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class 도구아이템 extends 아이템 {

	
	public void 번호증가(도구아이템 도구아이템) {
		도구아이템.번호 = +1;
	} 

	
	public int 최대도구아이템 = 100;
	도구아이템[] 도구아이템정보 = new 도구아이템[최대도구아이템];

	public int 순서;
	

	public 도구아이템(){
		순서 = 0;
	}

	public 도구아이템(String 이름, int 번호){
	    this.이름 = 이름;
	    this.번호 = 번호;
	 
	}

	public void 도구아이템아이디증가(){    
		순서 = 순서 + 1;
	}
	public void 도구아이템초기화(){    
		순서 = 0;
	}

	public void set도구아이템아이디(){
	    도구아이템정보[순서].순서 = 순서;
	}

	public void 도구아이템만들기(String 이름, int 번호){
	   if (순서 < 최대도구아이템){        
	        도구아이템정보[순서] = new 도구아이템(이름, 번호);
	        set도구아이템아이디();
	        도구아이템아이디증가();
	        try
			 {
			 AudioInputStream ais1 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\Finger Breaking.wav"));
			Clip clip1 = AudioSystem.getClip();
			clip1.stop();
			clip1.open(ais1);
			clip1.start();
			 }
			 catch (Exception ex)
			 {
			 }  
	        
	   } else {
	       System.out.println("아이템이 꽉 찾습니다.");
	   } 
	}

	public void 도구아이템지우기(String 이름, int 번호){
		   if (순서 < 최대도구아이템){        
		        도구아이템정보[순서] = new 도구아이템(이름, 번호);
		        set도구아이템아이디();
		        도구아이템초기화();
		   } 
		}
	
	public void 도구아이템질문(int id){
	    System.out.println(도구아이템정보[순서].순서 + " " + 도구아이템정보[순서].이름 + " " + 
	            도구아이템정보[순서].번호 );
	}

	public void 도구아이템리스트보기(){
	    System.out.println("****");
	    for (int i = 0; i < 순서; i++){
	    		System.out.println(도구아이템정보[i].순서+1 + "   " + 도구아이템정보[i].이름 );  				
	    }
	    
	}
	
}
