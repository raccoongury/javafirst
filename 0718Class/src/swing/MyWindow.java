package swing;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MyWindow extends JFrame {
public MyWindow() {
	//��ġ�� ũ�� ����
	setBounds(100, 100, 400, 400);
	//���� ����
	setTitle("������ �̿��� ������");
	//�����ư �̺�Ʈ ó��	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	//�г��� ����
	JPanel panel = new JPanel();
	ImageIcon icon = new ImageIcon ("C:\\Users\\503-17\\Documents\\������\\BTC.png");
	
	JLabel label = new JLabel(icon);
	label.setToolTipText("�ȳ��ϼ���");;
	/*
	TitledBorder border = new TitledBorder("��輱");
	*/
	EtchedBorder border = new EtchedBorder(Color.RED, Color.PINK);
			label.setBorder(border);
		panel.add(label);
	
	panel.add(label);
	
	//�г��� �����ӿ� ����
	add(panel);
	//ȭ�����
	setVisible(true);
	
	//�׸� ���� �̸��� �迭�� �����
	//�迭�� ����� ũ�� ������ �ȵ˴ϴ�.
	String [] images = {
		"XRP.png", "ADA.png", "EOS.png"
	};
	
	//����Ʈ�� ũ�� ������ ������ �迭�Դϴ�.
	ArrayList<String> list = new ArrayList<String>();
	list.add("XRP.png");
	list.add("ADA.png");
	list.add("EOS.png");
	
	//�̹����� ����Ǵ� ���ȿ��� �ٸ� �۾��� �� �� �־�� �ϹǷ�
	//�̹��� ������ ������� ����
	Thread th = new Thread() {
		public void run() {
			int idx = 0 ;
			while (true) {
				try {
					Thread.sleep(1000);
					/*
					ImageIcon icon = 
							new ImageIcon(
									"C:\\Users\\503-17\\Documents\\������\\BTC.png"
							+ images[idx%images.length]);
							*/
					ImageIcon icon = 
							new ImageIcon(
									"C:\\Users\\503-17\\Documents\\������\\BTC.png"
							+ list.get(idx%list.size()));
					
					label.setIcon(icon);
					
					idx = idx + 1;
				} catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	};
	th.start();
}
}











