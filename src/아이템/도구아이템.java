package ������;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ���������� extends ������ {

	
	public void ��ȣ����(���������� ����������) {
		����������.��ȣ = +1;
	} 

	
	public int �ִ뵵�������� = 100;
	����������[] �������������� = new ����������[�ִ뵵��������];

	public int ����;
	

	public ����������(){
		���� = 0;
	}

	public ����������(String �̸�, int ��ȣ){
	    this.�̸� = �̸�;
	    this.��ȣ = ��ȣ;
	 
	}

	public void ���������۾��̵�����(){    
		���� = ���� + 1;
	}
	public void �����������ʱ�ȭ(){    
		���� = 0;
	}

	public void set���������۾��̵�(){
	    ��������������[����].���� = ����;
	}

	public void ���������۸����(String �̸�, int ��ȣ){
	   if (���� < �ִ뵵��������){        
	        ��������������[����] = new ����������(�̸�, ��ȣ);
	        set���������۾��̵�();
	        ���������۾��̵�����();
	        try
			 {
			 AudioInputStream ais1 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\Finger Breaking.wav"));
			Clip clip1 = AudioSystem.getClip();
			clip1.stop();
			clip1.open(ais1);
			clip1.start();
			 }
			 catch (Exception ex)
			 {
			 }  
	        
	   } else {
	       System.out.println("�������� �� ã���ϴ�.");
	   } 
	}

	public void ���������������(String �̸�, int ��ȣ){
		   if (���� < �ִ뵵��������){        
		        ��������������[����] = new ����������(�̸�, ��ȣ);
		        set���������۾��̵�();
		        �����������ʱ�ȭ();
		   } 
		}
	
	public void ��������������(int id){
	    System.out.println(��������������[����].���� + " " + ��������������[����].�̸� + " " + 
	            ��������������[����].��ȣ );
	}

	public void ���������۸���Ʈ����(){
	    System.out.println("****");
	    for (int i = 0; i < ����; i++){
	    		System.out.println(��������������[i].����+1 + "   " + ��������������[i].�̸� );  				
	    }
	    
	}
	
}
