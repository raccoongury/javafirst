package frame;

import java.awt.Button;

public class TextThread extends Thread {
	private Button button;
	
	public TextThread(Button button) {
		this.button = button;
	}
	
	public void run() {
		String [] ar = {"Java", "Oracle", "FrontEnd", "BackEnd", "Android", "iOS"};
		int idx = 0;
		while(true) {
			try {
				Thread.sleep(1000);
				idx = idx + 1;
				button.setLabel(ar[idx%ar.length]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}






