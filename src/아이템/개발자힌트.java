package ������;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ��������Ʈ extends ������ {
	
	
	public int ��Ʈ������ ;
	
	public int get��Ʈ������() {
		return ��Ʈ������;
	}

	public void set��Ʈ������(int ��Ʈ������) {
		this.��Ʈ������ = ��Ʈ������;
	}

	public void �����ڹ�ȣ����(��������Ʈ ��������Ʈ) {
		��������Ʈ.��ȣ = +1;
	} 


	public int �������ִ���Ʈ = 100;
	��������Ʈ[] ��������Ʈ���� = new ��������Ʈ[�������ִ���Ʈ];

	public int ����;


	public ��������Ʈ(){
		���� = 0;
	}

	public ��������Ʈ(String �̸�, int ��ȣ){
	    this.�̸� = �̸�;
	    this.��ȣ = ��ȣ;
	 
	}

	public void �����ھ��̵�����(){    
		���� = ���� + 1;
		
	}

	public void �����ھ��̵��ʱ�ȭ() {
		���� = 0;
	}

	public void set��������Ʈ���̵�(){
	    ��������Ʈ����[����].���� = ����;
	}

	public void ��������Ʈ�����(String �̸�, int ��ȣ){
		
	   if (���� < �������ִ���Ʈ){    
		   
	        	��������Ʈ����[����] = new ��������Ʈ(�̸�, ��ȣ);
	        set��������Ʈ���̵�();
	        �����ھ��̵�����();
	        
	        set��Ʈ������(1);
	        
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
	   } else {
	       System.out.println("�������� �� ã���ϴ�.");
	   } 
	}

	public void ��������Ʈ�����(String �̸�, int ��ȣ){
		   if (���� < �������ִ���Ʈ){        
		        ��������Ʈ����[����] = new ��������Ʈ(�̸�, ��ȣ);
		        set��������Ʈ���̵�();
		        �����ھ��̵��ʱ�ȭ();
		   } 
		}



	public void ��������Ʈ����(int id){
	    System.out.println(��������Ʈ����[����].���� + " " + ��������Ʈ����[����].�̸� + " " + 
	            ��������Ʈ����[����].��ȣ );
	}

	public void ��������Ʈ����Ʈ����(){
		 try
		 {
		 AudioInputStream ais9 = AudioSystem.getAudioInputStream
				 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\click.wav"));
		Clip clip9 = AudioSystem.getClip();
		clip9.stop();
		clip9.open(ais9);
		clip9.start();
		 }
		 catch (Exception ex)
		 {
		 } 
	    System.out.println("**��������Ʈ**");
	    for (int i = 0; i < ����; i++){
	    	System.out.println(��������Ʈ����[i].�̸� );
	    	
	    }

	}
	}

