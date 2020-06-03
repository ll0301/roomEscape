package 배경음악;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;
import 방탈출.게임플레이;

public class 뮤직 extends Thread {

		private Player player;
		private boolean isLoop;
		private File file;
		private FileInputStream fis;
		private BufferedInputStream bis;

		
		public 뮤직 (String name, boolean isLoop) {
			try {
			this.isLoop = isLoop;
			file = new File(게임플레이.class.getResource("../sound/"+name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public int getTime() {
			if(player == null)
				return 0;
			return player.getPosition();
		}
		
		public void close() {
			isLoop = false;
			player.close();
			this.interrupt();
		}

		
		@Override
		public void run() {
			try {
				do {
					player.play();
					fis = new FileInputStream(file);
					bis = new BufferedInputStream(fis);
					player = new Player(bis);
				}while(isLoop);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
}
