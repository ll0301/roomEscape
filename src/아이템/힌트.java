package ������;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ��Ʈ extends ������{
	

public void ��ȣ����(��Ʈ ��Ʈ) {
	��Ʈ.��ȣ = +1;
} 


public int �ִ���Ʈ = 100;
��Ʈ[] ��Ʈ���� = new ��Ʈ[�ִ���Ʈ];

public int ����;


public ��Ʈ(){
	���� = 0;
}

public ��Ʈ(String �̸�, int ��ȣ){
    this.�̸� = �̸�;
    this.��ȣ = ��ȣ;
 
}

public void ��Ʈ���̵�����(){    
	���� = ���� + 1;
}

public void ��Ʈ���̵��ʱ�ȭ() {
	���� = 0;
}

public void set��Ʈ���̵�(){
    ��Ʈ����[����].���� = ����;
}

public void ��Ʈ�����(String �̸�, int ��ȣ){
   if (���� < �ִ���Ʈ){        
        	��Ʈ����[����] = new ��Ʈ(�̸�, ��ȣ);
        set��Ʈ���̵�();
        ��Ʈ���̵�����();
        
        try
		 {
		 AudioInputStream ais5 = 
	AudioSystem.getAudioInputStream
	(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\hint.wav"));
		Clip clip5 = AudioSystem.getClip();
		clip5.stop();
		clip5.open(ais5);
		clip5.start();
		 }
		 catch (Exception ex)
		 {
		 } 
        
   } else {
       System.out.println("�������� �� ã���ϴ�.");
   } 
}

public void ��Ʈ�����(String �̸�, int ��ȣ){
	   if (���� < �ִ���Ʈ){        
	        ��Ʈ����[����] = new ��Ʈ(�̸�, ��ȣ);
	        set��Ʈ���̵�();
	        ��Ʈ���̵��ʱ�ȭ();
	   } 
	}



public void ��Ʈ����(int id){
    System.out.println(��Ʈ����[����].���� + " " + ��Ʈ����[����].�̸� + " " + 
            ��Ʈ����[����].��ȣ );
}

public void ��Ʈ����Ʈ����(){
	
	try
	 {
	 AudioInputStream ais7 = 
AudioSystem.getAudioInputStream
(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\Tearing Paper.wav"));
	Clip clip7 = AudioSystem.getClip();
	clip7.stop();
	clip7.open(ais7);
	clip7.start();
	 }
	 catch (Exception ex)
	 {
	 } 
    System.out.println("**ȹ���Ѵܼ�**");
    for (int i = 0; i < ����; i++){
    	System.out.println(��Ʈ����[i].�̸� );
    	
    	
    	
    }

}
}