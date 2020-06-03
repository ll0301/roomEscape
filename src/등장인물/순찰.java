package 등장인물;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class 순찰 extends Thread {

	
	public int 타이밍;
	public int 순찰시간 = 5000;
	public int 순찰[] = new int[90000];
	public int 순찰길이 = 순찰.length;
	public int 체크;
	
	public int get체크() {
		return 체크;
	}



	public void set체크(int 체크) {
		this.체크 = 체크;
	}



	public int get타이밍() {
		return 타이밍;
	}



	public void set타이밍(int 타이밍) {
		this.타이밍 = 타이밍;
	}



	public int get순찰시간() {
		return 순찰시간;
	}



	public void set순찰시간(int 순찰시간) {
		this.순찰시간 = 순찰시간;
	}



 	public void run() {
 		
 	while(true) {
 		
 		for(int 랜덤=0; 랜덤<순찰길이; 랜덤++) {  

 			순찰[랜덤] = (int)(Math.random()*90000)+1; 
 			
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
				 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\walking.wav"));
		Clip clip14 = AudioSystem.getClip();
		clip14.stop();
		clip14.open(ais14);
		clip14.start();
		 }
		 catch (Exception ex) {
			 
		 }
 		체크 = 1;
 		System.out.println("***********************************");
 		System.out.println("발자국소리가 들립니다!!");
 		System.out.println("숨죽이고 기다리세요......");
 		System.out.println("***********************************");
 		
		 try {
			 
			Thread.sleep(순찰시간);
			while(true) {
			if(타이밍<2) {
				체크 = 0;
				System.out.println("***********************************");
		 		System.out.println("지나갑니다......");
		 		System.out.println("***********************************");
		 		break;
			}
			if(타이밍>=2) {
				try
				 {
				 AudioInputStream ais14 = AudioSystem.getAudioInputStream
						 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\knock.wav"));
				Clip clip14 = AudioSystem.getClip();
				clip14.stop();
				clip14.open(ais14);
				clip14.start();
				 }
				 catch (Exception ex) {
					 
				 }
				System.out.println("***********************************");
				System.out.println("          직원에게 들켰습니다.");
				System.out.println("***********************************");
		 		System.out.println("             GAME OVER");
		 		System.out.println("***********************************");
			break;}
			
			
			 }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

 		
		 if(타이밍>=2) {
			 break;
		 }
		
 	}
 	}
 	
 	
 	
}
