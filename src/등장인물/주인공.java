package 등장인물;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class 주인공 extends 등장인물{
		
		String 잔챙이;
		public int 힌트포인트 = 0;
		public int 찬스포인트 = 0;
		public int 움직임;
		public int 시간;
		public int 순서;
		public int 힌트순서;
		public String 스테이지이름;
		public String 슬롯이름;
		
		public void 장착아이템(String 이름) {
			this.이름 = 이름;
			
			 try
			 {
			 AudioInputStream ais4 = 
			AudioSystem.getAudioInputStream
			(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\item_set_1.wav"));
			Clip clip4 = AudioSystem.getClip();
			clip4.stop();
			clip4.open(ais4);
			clip4.start();
			 }
			 catch (Exception ex)
			 {
			  } 
		}
		
		
		public void 스테이지못나감(String 스테이지이름) {
			this.스테이지이름 = 스테이지이름;
			
			 try
			 {
			 AudioInputStream ais10 = 
			AudioSystem.getAudioInputStream
			(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\door-open-7.wav"));
			Clip clip10 = AudioSystem.getClip();
			clip10.stop();
			clip10.open(ais10);
			clip10.start();
			 }
			 catch (Exception ex)
			 {
			  } 
		
		}
		
		
		public void 스테이지탈출(String 스테이지이름) {
			this.스테이지이름 = 스테이지이름;
			
			 try
			 {
			 AudioInputStream ais11 = 
			AudioSystem.getAudioInputStream
			(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\Door7.wav"));
			Clip clip11 = AudioSystem.getClip();
			clip11.stop();
			clip11.open(ais11);
			clip11.start();
			 }
			 catch (Exception ex)
			 {
			  } 
		
		}
		
		public void 슬롯머신(String 슬롯이름) {
			this.슬롯이름 = 슬롯이름;
			
			 try
			 {
			 AudioInputStream ais12 = 
			AudioSystem.getAudioInputStream
			(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\slot-machine-daniel_simon.wav"));
			Clip clip12 = AudioSystem.getClip();
			clip12.stop();
			clip12.open(ais12);
			clip12.start();
			 }
			 catch (Exception ex)
			 {
			  } 
		
		}

		public String 들고있는아이템() {

			return 이름;
		}
		
		public void 힌트얻기(int 힌트순서) {
			this.힌트순서 = 힌트순서;
		}




		public void 공격받는다(int sum) {
			
			if(방어력 >= sum)
				체력 = 체력 -0;
			else
				체력 = 체력 + 방어력 - sum;
		}
		
		
		

}
