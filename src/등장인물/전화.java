package �����ι�;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ��ȭ extends Thread {


	public int �ޱ�;
	public int ��ȭ�ð� = 10000;
	public int ����[] = new int [100000];
	public int �������� = ����.length;
	public int üũ;
	
	public int getüũ() {
		return üũ;
	}



	public void setüũ(int üũ) {
		this.üũ = üũ;
	}



	public int get�ޱ�() {
		return �ޱ�;
	}



	public void set�ޱ�(int �ޱ�) {
		this.�ޱ� = �ޱ�;
	}



	public int get��ȭ�ð�() {
		return ��ȭ�ð�;
	}



	public void set��ȭ�ð�(int ��ȭ�ð�) {
		this.��ȭ�ð� = ��ȭ�ð�;
	}



 	public void run() {
 		
 	while(true) {
 		
 		for(int ����=0; ����<��������; ����++) {  

 			����[����] = (int)(Math.random()*100000)+1; 
 			
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
				 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\phone2.wav"));
		Clip clip14 = AudioSystem.getClip();
		clip14.stop();
		clip14.open(ais14);
		clip14.start();
		 }
		 catch (Exception ex) {
			 
		 }
 		üũ = 1;
 		System.out.println("***********************************");
 		System.out.println("��ȭ���Ҹ��� �︳�ϴ�.");
 		System.out.println("***********************************");
 		
		 try {
			Thread.sleep(��ȭ�ð�);
			üũ =0;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

 		
		 if(�ޱ�>=1) {
			 break;
		 }
		
 	}
 	}
 	
	
	
}
