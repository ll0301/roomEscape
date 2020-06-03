package 아이템;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class 힌트 extends 아이템{
	

public void 번호증가(힌트 힌트) {
	힌트.번호 = +1;
} 


public int 최대힌트 = 100;
힌트[] 힌트정보 = new 힌트[최대힌트];

public int 순서;


public 힌트(){
	순서 = 0;
}

public 힌트(String 이름, int 번호){
    this.이름 = 이름;
    this.번호 = 번호;
 
}

public void 힌트아이디증가(){    
	순서 = 순서 + 1;
}

public void 힌트아이디초기화() {
	순서 = 0;
}

public void set힌트아이디(){
    힌트정보[순서].순서 = 순서;
}

public void 힌트만들기(String 이름, int 번호){
   if (순서 < 최대힌트){        
        	힌트정보[순서] = new 힌트(이름, 번호);
        set힌트아이디();
        힌트아이디증가();
        
        try
		 {
		 AudioInputStream ais5 = 
	AudioSystem.getAudioInputStream
	(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\hint.wav"));
		Clip clip5 = AudioSystem.getClip();
		clip5.stop();
		clip5.open(ais5);
		clip5.start();
		 }
		 catch (Exception ex)
		 {
		 } 
        
   } else {
       System.out.println("아이템이 꽉 찾습니다.");
   } 
}

public void 힌트지우기(String 이름, int 번호){
	   if (순서 < 최대힌트){        
	        힌트정보[순서] = new 힌트(이름, 번호);
	        set힌트아이디();
	        힌트아이디초기화();
	   } 
	}



public void 힌트질문(int id){
    System.out.println(힌트정보[순서].순서 + " " + 힌트정보[순서].이름 + " " + 
            힌트정보[순서].번호 );
}

public void 힌트리스트보기(){
	
	try
	 {
	 AudioInputStream ais7 = 
AudioSystem.getAudioInputStream
(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\Tearing Paper.wav"));
	Clip clip7 = AudioSystem.getClip();
	clip7.stop();
	clip7.open(ais7);
	clip7.start();
	 }
	 catch (Exception ex)
	 {
	 } 
    System.out.println("**획득한단서**");
    for (int i = 0; i < 순서; i++){
    	System.out.println(힌트정보[i].이름 );
    	
    	
    	
    }

}
}