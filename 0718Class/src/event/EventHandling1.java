package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventHandling1 extends Frame {
		//생성자
	public EventHandling1 ( ) {
		//위치와 크기 설정
		setBounds(300, 200, 350, 300);
		//제목 설정
		setTitle("이벤트 처리 연습");
		//여러 개를 배치하기 위해서 패널 배치
		Panel panel = new Panel();
		
		TextField tf1 = new TextField(5);
		panel.add(tf1);
		Label plus = new Label("+");
		panel.add(plus);
		
		TextField tf2 = new TextField(5);
		panel.add(tf2);
		Label assign = new Label("=");
		panel.add(assign);	
		
		TextField result = new TextField(6);
		panel.add(result);
		
		Button btn = new Button("계산");
		panel.add(btn);
		
		//ActionListener 인터페이스의 anonymous class생성
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//첫번째와 두번째 텍스트 필드의 내용 가져오기
					String n1 = tf1.getText();
					String n2 = tf2.getText();
					//문자열을 정수로 변환해서 더하기
					int r = Integer.parseInt(n1) + Integer.parseInt(n2);
					//정수를 문자열로 만들기
					result.setText(r+" ");
				
			}
		};
		//
		btn.addActionListener(listener);
		
		Label IblPw = new Label ("비밀번호");
		panel.add(IblPw);
		TextField pw = new TextField(15);
		panel.add(pw);
		Label pwResult = new Label();
		panel.add(pwResult);
		
		//텍스트 필드의 내용이 변경될 때를 처리 할 수 있는
		//인터페이스의 인스턴스를 생성
		TextListener tl = new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
					String password = pw.getText();
					//영문 대소문자와 숫자 그리고 특수문자의 개수 세기
					//개수를 저장할 변수 만들기
					int dae = 0;
					int so = 0;
					int su = 0;
					int etc = 0;
					//password의 모든 글자를 순회
					//각 글자를 순회
					for(int i =0; i <password.length(); i = i + 1) {
						//i번째 글자 가져오기
						char ch = password.charAt(i);
						//대문자 인지 확인: A -Z
						if(ch >= 'A' && ch <= 'Z') {
							dae = dae +1;
						}
						else if(ch>='a' && ch<= 'z') {
							so = so + 1;
						}
						else if(ch>='0' && ch<= '9') {
							su = su +1;
						}
						else {
							etc = etc +1;
						}
					}
					
					//4개 중에 한개도 0이 없으면
					if(dae*so*su*etc > 0) {
						pwResult.setBackground(Color.YELLOW);
						pwResult.setText("사용 가능한 비밀번호");
					}else {
						pwResult.setBackground(Color.RED);
						pwResult.setText("비밀번호가 너무 약해요");
					}
					pwResult.setText(dae + " ");
			}
		};
		pw.addTextListener(tl);
		
		add(panel);
		//화면 출력
		setVisible(true);
		
	}
}
