package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

public class MyWindow extends Frame {
	//������
	public MyWindow() {
		setBackground(Color.BLUE);
		setSize(500, 500);
		setLocation(100, 100);
		setTitle("���� ù��° ������ ���α׷�");
		
		Panel panel = new Panel();
		
		Button btn1 = new Button("��ư1");
		//��ư�� ������ �����ϴ� ������
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
		
		Button btn2 = new Button("��ư2");
		//��ư�� �ؽ�Ʈ�� �����ϴ� ������
		TextThread th2 = new TextThread(btn2);
		th2.start();
		
		panel.add(btn2);
		//�г��� �����ӿ� �߰�
		add(panel);
		
		
		setVisible(true);
	}
}






