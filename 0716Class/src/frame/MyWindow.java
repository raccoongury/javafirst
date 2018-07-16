package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

public class MyWindow extends Frame {
	//생성자
	public MyWindow() {
		setBackground(Color.BLUE);
		setSize(500, 500);
		setLocation(100, 100);
		setTitle("나의 첫번째 윈도우 프로그램");
		
		Panel panel = new Panel();
		
		Button btn1 = new Button("버튼1");
		//버튼의 배경색을 변경하는 스레드
		//ColorThread th1 = new ColorThread(btn1);
		Thread th1 = new Thread() {
			public void run() {
				Color [] colors = {
						Color.red, Color.green,
						Color.orange, Color.magenta
				};
				int idx = 0;
				while(true) {
					try {
						Thread.sleep(1000);
						idx = idx + 1;
						btn1.setBackground(
								colors[idx%colors.length]);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th1.start();
		panel.add(btn1);
		
		Button btn2 = new Button("버튼2");
		//버튼의 텍스트를 변경하는 스레드
		TextThread th2 = new TextThread(btn2);
		th2.start();
		
		panel.add(btn2);
		//패널을 프레임에 추가
		add(panel);
		
		
		setVisible(true);
	}
}






