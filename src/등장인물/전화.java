package 등장인물;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class 전화 extends Thread {


	public int 받기;
	public int 전화시간 = 10000;
	public int 순찰[] = new int [100000];
	public int 순찰길이 = 순찰.length;
	public int 체크;
	
	public int get체크() {
		return 체크;
	}



	public void set체크(int 체크) {
		this.체크 = 체크;
	}



	public int get받기() {
		return 받기;
	}



	public void set받기(int 받기) {
		this.받기 = 받기;
	}



	public int get전화시간() {
		return 전화시간;
	}



	public void set전화시간(int 전화시간) {
		this.전화시간 = 전화시간;
	}



 	public void run() {
 		
 	while(true) {
 		
 		for(int 랜덤=0; 랜덤<순찰길이; 랜덤++) {  

 			순찰[랜덤] = (int)(Math.random()*100000)+1; 
 			
 			for(int 랜덤비교 =0; 랜덤비교<랜덤; 랜덤비교 ++) {  
 				if(순찰[랜덤]==순찰[랜덤비교]) {
 					랜덤--; 
 			break; 
 				}	
 			}		  
 		}
 		
 		try
		 {
		 AudioInputStream ais14 = AudioSystem.getAudioInputStream
				 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\phone2.wav"));
		Clip clip14 = AudioSystem.getClip();
		clip14.stop();
		clip14.open(ais14);
		clip14.start();
		 }
		 catch (Exception ex) {
			 
		 }
 		체크 = 1;
 		System.out.println("***********************************");
 		System.out.println("전화벨소리가 울립니다.");
 		System.out.println("***********************************");
 		
		 try {
			Thread.sleep(전화시간);
			체크 =0;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

 		
		 if(받기>=1) {
			 break;
		 }
		
 	}
 	}
 	
	
	
}
