package ��������;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import �������.����;

public class Ÿ�̸� extends Thread {
	
	
	
	public int ���ѽð� = 1000;
 	public int get���ѽð�() {
		return ���ѽð�;
	}

	public void set���ѽð�(int ���ѽð�) {
		this.���ѽð� = ���ѽð�;
		
	}

	public int getŸ�̸�() {
		
		return Ÿ�̸�;
		
	}
	
	
	public int get����() {
		try
		 {
		 AudioInputStream ais8 = AudioSystem.getAudioInputStream
				 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\click.wav"));
		Clip clip8 = AudioSystem.getClip();
		clip8.stop();
		clip8.open(ais8);
		clip8.start();
		 }
		 catch (Exception ex)
		 {
		 } 
		
		return Ÿ�̸�;
		
	}


	public void setŸ�̸�(int Ÿ�̸�) {
		this.Ÿ�̸� = Ÿ�̸�;
		try
		 {
		 AudioInputStream ais8 = AudioSystem.getAudioInputStream
				 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\coins_5.wav"));
		Clip clip8 = AudioSystem.getClip();
		clip8.stop();
		clip8.open(ais8);
		clip8.start();
		 }
		 catch (Exception ex)
		 {
		 } 
		  
	}

	public int Ÿ�̸� = 60;
	
 	
 	
 	public void run() {
		
		while(true) {
			Ÿ�̸� -= 1;
			
			if (this.Ÿ�̸�==59) {
				System.out.println("***********************************");
				System.out.println("���ѽð� : 60�� ���ҽ��ϴ�.");
				System.out.println("***********************************");
				
			}

			else if (this.Ÿ�̸�==50) {
				System.out.println("***********************************");
				System.out.println("���ѽð� : 50�� ���ҽ��ϴ�.");
				System.out.println("***********************************");
				
			}
			
			else if (this.Ÿ�̸�==40) {
				System.out.println("***********************************");
				System.out.println("���ѽð� : 40�� ���ҽ��ϴ�.");
				System.out.println("***********************************");
				
			}
			
			else if (this.Ÿ�̸�==30) {
				System.out.println("***********************************");
				System.out.println("���ѽð� : 30�� ���ҽ��ϴ�.");
				System.out.println("***********************************");
				
			}
			
			
			else if (this.Ÿ�̸�==20) {
				System.out.println("***********************************");
				System.out.println("20�� ... �ð��� �� ���� �ʾҽ��ϴ�.");
				System.out.println("***********************************");
				  try
					 {
					 AudioInputStream ais13 = AudioSystem.getAudioInputStream
							 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\Heart_Beat.wav"));
					Clip clip13 = AudioSystem.getClip();
					clip13.stop();
					clip13.open(ais13);
					clip13.start();
					 }
					 catch (Exception ex)
					 {
					 } 
			}else if(this.Ÿ�̸�==10) {
				System.out.println("***********************************");
				System.out.println("10��...������ �ٰ����� �ֽ��ϴ�!");
				System.out.println("***********************************");
				try
				 {
				 AudioInputStream ais14 = AudioSystem.getAudioInputStream
						 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\knocking_6.wav"));
				Clip clip14 = AudioSystem.getClip();
				clip14.stop();
				clip14.open(ais14);
				clip14.start();
				 }
				 catch (Exception ex) {
					 
				 }
					
			}
			
		 try {
	
			Thread.sleep(���ѽð�);
			
			while(true) {
				if(Ÿ�̸�>0) {
			 		break;
				}
				if(Ÿ�̸�==0) {
					try
					 {
					 AudioInputStream ais14 = AudioSystem.getAudioInputStream
							 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\knock.wav"));
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
			 		System.out.println("               ������ ����˴ϴ�.");
			 		System.out.println("***********************************");

				break;}
				
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		 if(this.Ÿ�̸�==0) {
				 break;
			} 
		}
	}
	
	
}
