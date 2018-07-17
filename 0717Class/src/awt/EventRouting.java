package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	public EventRouting() {
		// �������� ���� ��ǥ �� ũ�⸦ ����
		setBounds(200, 200, 200, 200);
		// �������� ������ ����
		setTitle("�̺�Ʈ �����");

		Button btn1 = new Button("�ѱ���");
		Button btn2 = new Button("����");
		Button btn3 = new Button("����");

		Label label = new Label();

		Panel centerPanel = new Panel();
		centerPanel.add(btn1);
		centerPanel.add(btn2);
		centerPanel.add(btn3);
		add("Center", centerPanel);

		add("South", label);

		/*
		// ActionEvent�� ó���� �� �ִ�
		// �ν��Ͻ� �����
		ActionListener listener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("�ȳ��ϼ���");
			}
		};
		// ������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
		btn1.addActionListener(listener1);

		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Hello");
			}
		};
		// ������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
		btn2.addActionListener(listener2);
		
		ActionListener listener3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		// ������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
		btn3.addActionListener(listener3);
		*/
		
		//�̺�Ʈ ����� - �ϳ��� �����ʰ� ���� ������Ʈ��
		//�̺�Ʈ�� ó���ϴ� ��
		ActionListener listener = 
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//�̺�Ʈ�� �߻��� ������Ʈ�� ���ڿ��� ������
					//�б�
					switch(e.getActionCommand()) {
					case "�ѱ���":
						label.setText("�ȳ��ϼ���");
						break;
					case "����":
						label.setText("HELLO");
						break;
					case "����":
						System.exit(0);
						break;
					}
					
				}
		};
		//3�� ��ư�� �׼� �̺�Ʈ�� listener�� ��� ó��
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		
		// �����츦 ȭ�鿡 ���
		setVisible(true);
	}
}








