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
	//위치와 크기 설정
	setBounds(100, 100, 400, 400);
	//제목 설정
	setTitle("스윙을 이용한 윈도우");
	//종료버튼 이벤트 처리	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	//패널을 생성
	JPanel panel = new JPanel();
	ImageIcon icon = new ImageIcon ("C:\\Users\\503-17\\Documents\\이정원\\BTC.png");
	
	JLabel label = new JLabel(icon);
	label.setToolTipText("안녕하세요");;
	/*
	TitledBorder border = new TitledBorder("경계선");
	*/
	EtchedBorder border = new EtchedBorder(Color.RED, Color.PINK);
			label.setBorder(border);
		panel.add(label);
	
	panel.add(label);
	
	//패널을 프레임에 부착
	add(panel);
	//화면출력
	setVisible(true);
	
	//그림 파일 이름을 배열로 만들기
	//배열은 만들면 크기 변경이 안됩니다.
	String [] images = {
		"XRP.png", "ADA.png", "EOS.png"
	};
	
	//리스트는 크기 변경이 가능한 배열입니다.
	ArrayList<String> list = new ArrayList<String>();
	list.add("XRP.png");
	list.add("ADA.png");
	list.add("EOS.png");
	
	//이미지가 변경되는 동안에도 다른 작업을 할 수 있어야 하므로
	//이미지 변경은 스레드로 생성
	Thread th = new Thread() {
		public void run() {
			int idx = 0 ;
			while (true) {
				try {
					Thread.sleep(1000);
					/*
					ImageIcon icon = 
							new ImageIcon(
									"C:\\Users\\503-17\\Documents\\이정원\\BTC.png"
							+ images[idx%images.length]);
							*/
					ImageIcon icon = 
							new ImageIcon(
									"C:\\Users\\503-17\\Documents\\이정원\\BTC.png"
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











