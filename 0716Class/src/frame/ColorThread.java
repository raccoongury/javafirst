package frame;

import java.awt.Button;
import java.awt.Color;

public class ColorThread extends Thread {
	private Button button;
	
	public ColorThread(Button button) {
		this.button = button;
	}
	
	public void run() {
		//���� �迭�� ����
		Color [] colors = {
				Color.red, Color.blue,
				Color.green
		};
		
		int idx = 0;
		while(true) {
			try {
				//colors �迭 ���� ���� �����ϱ�
				idx = idx + 1;
				button.setBackground(
					colors[idx % colors.length]);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}






