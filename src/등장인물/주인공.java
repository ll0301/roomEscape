package �����ι�;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ���ΰ� extends �����ι�{
		
		String ��ì��;
		public int ��Ʈ����Ʈ = 0;
		public int ��������Ʈ = 0;
		public int ������;
		public int �ð�;
		public int ����;
		public int ��Ʈ����;
		public String ���������̸�;
		public String �����̸�;
		
		public void ����������(String �̸�) {
			this.�̸� = �̸�;
			
			 try
			 {
			 AudioInputStream ais4 = 
			AudioSystem.getAudioInputStream
			(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\item_set_1.wav"));
			Clip clip4 = AudioSystem.getClip();
			clip4.stop();
			clip4.open(ais4);
			clip4.start();
			 }
			 catch (Exception ex)
			 {
			  } 
		}
		
		
		public void ��������������(String ���������̸�) {
			this.���������̸� = ���������̸�;
			
			 try
			 {
			 AudioInputStream ais10 = 
			AudioSystem.getAudioInputStream
			(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\door-open-7.wav"));
			Clip clip10 = AudioSystem.getClip();
			clip10.stop();
			clip10.open(ais10);
			clip10.start();
			 }
			 catch (Exception ex)
			 {
			  } 
		
		}
		
		
		public void ��������Ż��(String ���������̸�) {
			this.���������̸� = ���������̸�;
			
			 try
			 {
			 AudioInputStream ais11 = 
			AudioSystem.getAudioInputStream
			(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\Door7.wav"));
			Clip clip11 = AudioSystem.getClip();
			clip11.stop();
			clip11.open(ais11);
			clip11.start();
			 }
			 catch (Exception ex)
			 {
			  } 
		
		}
		
		public void ���Ըӽ�(String �����̸�) {
			this.�����̸� = �����̸�;
			
			 try
			 {
			 AudioInputStream ais12 = 
			AudioSystem.getAudioInputStream
			(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\slot-machine-daniel_simon.wav"));
			Clip clip12 = AudioSystem.getClip();
			clip12.stop();
			clip12.open(ais12);
			clip12.start();
			 }
			 catch (Exception ex)
			 {
			  } 
		
		}

		public String ����ִ¾�����() {

			return �̸�;
		}
		
		public void ��Ʈ���(int ��Ʈ����) {
			this.��Ʈ���� = ��Ʈ����;
		}




		public void ���ݹ޴´�(int sum) {
			
			if(���� >= sum)
				ü�� = ü�� -0;
			else
				ü�� = ü�� + ���� - sum;
		}
		
		
		

}
