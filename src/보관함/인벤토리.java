package 보관함;

import java.io.File;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class 인벤토리 {
	
	private ArrayList<인벤아이템> 아이템목록 = new ArrayList<인벤아이템>();
	
	
	
	
	
	public 인벤토리() {

		
	}
	
	public void 수량증가 (String 아이템이름) {
		for(인벤아이템 인벤아이템 : this.아이템목록) {
			if(아이템이름.equals(인벤아이템.이름얻기())) {
				인벤아이템.추가하기();

				 try

				 {

				 AudioInputStream ais2 = AudioSystem.getAudioInputStream
		 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\get_item.wav"));

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
		
		public void 수량감소 (String 아이템이름) {
			for(인벤아이템 인벤아이템 : this.아이템목록) {
				if(아이템이름.equals(인벤아이템.이름얻기())) {
					if(인벤아이템.수량얻기() >=0) {
						인벤아이템.지우기();
						
					}
					return;
				}
			}
		}
			public void 아이템만들기 (String 이름, String 아이템아이디) {
				this.아이템목록.add(new 인벤아이템(이름,아이템아이디));
			}
			public void 아이템지우기 (String 이름, String 아이템아이디) {
				this.아이템목록.remove(new 인벤아이템(이름,아이템아이디));
			}

			
			public String toString() {

				String s="";
				s+="**획득아이템**";
				for (인벤아이템 인벤아이템 : this.아이템목록) {
				if(인벤아이템.수량얻기()>0) {	
				s+= '\n' +인벤아이템.toString();
				}
				
				
				}
				return s;
				}
			
			
			public void 인벤토리출력() {
				System.out.println(this.toString());

					 try
					 {
					 AudioInputStream ais3 = 
					AudioSystem.getAudioInputStream
					(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\Belt Buckle.wav"));
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

	

