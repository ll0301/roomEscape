package �����ι�;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ���� extends Thread {

	
	public int Ÿ�̹�;
	public int �����ð� = 5000;
	public int ����[] = new int[90000];
	public int �������� = ����.length;
	public int üũ;
	
	public int getüũ() {
		return üũ;
	}



	public void setüũ(int üũ) {
		this.üũ = üũ;
	}



	public int getŸ�̹�() {
		return Ÿ�̹�;
	}



	public void setŸ�̹�(int Ÿ�̹�) {
		this.Ÿ�̹� = Ÿ�̹�;
	}



	public int get�����ð�() {
		return �����ð�;
	}



	public void set�����ð�(int �����ð�) {
		this.�����ð� = �����ð�;
	}



 	public void run() {
 		
 	while(true) {
 		
 		for(int ����=0; ����<��������; ����++) {  

 			����[����] = (int)(Math.random()*90000)+1; 
 			
 			for(int ������ =0; ������<����; ������ ++) {  
 				if(����[����]==����[������]) {
 					����--; 
 			break; 
 				}	
 			}		  
 		}
 		
 		try
		 {
		 AudioInputStream ais14 = AudioSystem.getAudioInputStream
				 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\walking.wav"));
		Clip clip14 = AudioSystem.getClip();
		clip14.stop();
		clip14.open(ais14);
		clip14.start();
		 }
		 catch (Exception ex) {
			 
		 }
 		üũ = 1;
 		System.out.println("***********************************");
 		System.out.println("���ڱ��Ҹ��� �鸳�ϴ�!!");
 		System.out.println("�����̰� ��ٸ�����......");
 		System.out.println("***********************************");
 		
		 try {
			 
			Thread.sleep(�����ð�);
			while(true) {
			if(Ÿ�̹�<2) {
				üũ = 0;
				System.out.println("***********************************");
		 		System.out.println("�������ϴ�......");
		 		System.out.println("***********************************");
		 		break;
			}
			if(Ÿ�̹�>=2) {
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
				System.out.println("          �������� ���׽��ϴ�.");
				System.out.println("***********************************");
		 		System.out.println("             GAME OVER");
		 		System.out.println("***********************************");
			break;}
			
			
			 }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

 		
		 if(Ÿ�̹�>=2) {
			 break;
		 }
		
 	}
 	}
 	
 	
 	
}
