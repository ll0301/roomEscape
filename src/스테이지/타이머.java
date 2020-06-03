package 스테이지;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import 배경음악.뮤직;

public class 타이머 extends Thread {
	
	
	
	public int 제한시간 = 1000;
 	public int get제한시간() {
		return 제한시간;
	}

	public void set제한시간(int 제한시간) {
		this.제한시간 = 제한시간;
		
	}

	public int get타이머() {
		
		return 타이머;
		
	}
	
	
	public int get제한() {
		try
		 {
		 AudioInputStream ais8 = AudioSystem.getAudioInputStream
				 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\click.wav"));
		Clip clip8 = AudioSystem.getClip();
		clip8.stop();
		clip8.open(ais8);
		clip8.start();
		 }
		 catch (Exception ex)
		 {
		 } 
		
		return 타이머;
		
	}


	public void set타이머(int 타이머) {
		this.타이머 = 타이머;
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
		  
	}

	public int 타이머 = 60;
	
 	
 	
 	public void run() {
		
		while(true) {
			타이머 -= 1;
			
			if (this.타이머==59) {
				System.out.println("***********************************");
				System.out.println("제한시간 : 60초 남았습니다.");
				System.out.println("***********************************");
				
			}

			else if (this.타이머==50) {
				System.out.println("***********************************");
				System.out.println("제한시간 : 50초 남았습니다.");
				System.out.println("***********************************");
				
			}
			
			else if (this.타이머==40) {
				System.out.println("***********************************");
				System.out.println("제한시간 : 40초 남았습니다.");
				System.out.println("***********************************");
				
			}
			
			else if (this.타이머==30) {
				System.out.println("***********************************");
				System.out.println("제한시간 : 30초 남았습니다.");
				System.out.println("***********************************");
				
			}
			
			
			else if (this.타이머==20) {
				System.out.println("***********************************");
				System.out.println("20초 ... 시간이 얼마 남지 않았습니다.");
				System.out.println("***********************************");
				  try
					 {
					 AudioInputStream ais13 = AudioSystem.getAudioInputStream
							 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\Heart_Beat.wav"));
					Clip clip13 = AudioSystem.getClip();
					clip13.stop();
					clip13.open(ais13);
					clip13.start();
					 }
					 catch (Exception ex)
					 {
					 } 
			}else if(this.타이머==10) {
				System.out.println("***********************************");
				System.out.println("10초...누군가 다가오고 있습니다!");
				System.out.println("***********************************");
				try
				 {
				 AudioInputStream ais14 = AudioSystem.getAudioInputStream
						 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\knocking_6.wav"));
				Clip clip14 = AudioSystem.getClip();
				clip14.stop();
				clip14.open(ais14);
				clip14.start();
				 }
				 catch (Exception ex) {
					 
				 }
					
			}
			
		 try {
	
			Thread.sleep(제한시간);
			
			while(true) {
				if(타이머>0) {
			 		break;
				}
				if(타이머==0) {
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
					System.out.println("             TIME OVER  ");
					System.out.println("***********************************");
			 		System.out.println("               게임이 종료됩니다.");
			 		System.out.println("***********************************");

				break;}
				
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		 if(this.타이머==0) {
				 break;
			} 
		}
	}
	
	
}
