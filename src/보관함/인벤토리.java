package ������;

import java.io.File;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class �κ��丮 {
	
	private ArrayList<�κ�������> �����۸�� = new ArrayList<�κ�������>();
	
	
	
	
	
	public �κ��丮() {

		
	}
	
	public void �������� (String �������̸�) {
		for(�κ������� �κ������� : this.�����۸��) {
			if(�������̸�.equals(�κ�������.�̸����())) {
				�κ�������.�߰��ϱ�();

				 try

				 {

				 AudioInputStream ais2 = AudioSystem.getAudioInputStream
		 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\get_item.wav"));

				Clip clip2 = AudioSystem.getClip();

				clip2.stop();

				clip2.open(ais2);

				clip2.start();

				 }

				 catch (Exception ex)

				 {

				  } 
				return;
			}
			}
		}
		
		public void �������� (String �������̸�) {
			for(�κ������� �κ������� : this.�����۸��) {
				if(�������̸�.equals(�κ�������.�̸����())) {
					if(�κ�������.�������() >=0) {
						�κ�������.�����();
						
					}
					return;
				}
			}
		}
			public void �����۸���� (String �̸�, String �����۾��̵�) {
				this.�����۸��.add(new �κ�������(�̸�,�����۾��̵�));
			}
			public void ����������� (String �̸�, String �����۾��̵�) {
				this.�����۸��.remove(new �κ�������(�̸�,�����۾��̵�));
			}

			
			public String toString() {

				String s="";
				s+="**ȹ�������**";
				for (�κ������� �κ������� : this.�����۸��) {
				if(�κ�������.�������()>0) {	
				s+= '\n' +�κ�������.toString();
				}
				
				
				}
				return s;
				}
			
			
			public void �κ��丮���() {
				System.out.println(this.toString());

					 try
					 {
					 AudioInputStream ais3 = 
					AudioSystem.getAudioInputStream
					(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\Belt Buckle.wav"));
					Clip clip3 = AudioSystem.getClip();
					clip3.stop();
					clip3.open(ais3);
					clip3.start();
					 }
					 catch (Exception ex)
					 {
					  } 
				
				
			}
		
	}

	

