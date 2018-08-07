package oracleuse;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.sql.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class ContactView extends JFrame {
	// �ʿ��� UI ���� ����

	// ���̺� ����
	JLabel lblName, lblPhone, lblEmail, lblBirthday;
	// �Է¹��� �ؽ�Ʈ �ʵ� ����
	JTextField tfName, tfPhone, tfEmail, tfBirthday;
	// ��ư ����
	JButton btnFirst, btnLast, btnPrev, btnNext;
	JButton btnInsert, btnUpdate, btnDelete, btnSearch, btnClear;

	// ���� ��� ���� �������� �ε����� ǥ���� ���̺�
	JLabel lblIndex;

	// �����ͺ��̽� �۾��� ���� Dao ����
	ContactDao dao = new ContactDaoImpl();
	// �����ͺ��̽����� ������ ����� �����ϱ� ���� List
	List<Contact> list;
	// ���� ��� ���� �������� �ε����� ������ ����
	int idx;

	// idx ��° �����͸� ȭ�鿡 ������ִ� �޼ҵ�
	// �� ó�� �ѹ� ȣ���ϰ� �����Ϳ� �۾��� �߻��ϸ� ȣ���ϴ� �޼ҵ�
	private void printData() {
		// ���� �����Ͱ� ���ٸ� �޽��� �ڽ��� ����ϰ� return
		if (list.size() == 0) {
			JOptionPane.showMessageDialog(null, "���� �����Ͱ� �����ϴ�.", "������ ����", JOptionPane.ERROR_MESSAGE);
			return;
		}
		// List���� idx ��° �����͸� �����ɴϴ�.
		Contact contact = list.get(idx);
		tfName.setText(contact.getName());
		tfPhone.setText(contact.getPhone());
		tfEmail.setText(contact.getEmail());
		// ������ Data Ÿ���̹Ƿ� toString�� ȣ���ؼ� String���� ��ȯ�ؼ�
		// ����մϴ�.
		tfBirthday.setText(contact.getBirthday().toString());
		// ���̺� ���� �ε����� ���
		// lblIndaex.setText(String.fromat("%d", idx+1));
		lblIndex.setText((idx + 1) + "");
	}

	// ������
	// ��ü�� ���� �� �ʱ�ȭ�� ���ؼ� ����
	public ContactView() {
		// �߾ӿ� ��ġ�� �г� ����
		JPanel centerPanel = new JPanel();

		// ���̺��� ����
		lblName = new JLabel("�̸�", JLabel.RIGHT);
		lblPhone = new JLabel("��ȭ��ȣ", JLabel.RIGHT);
		lblEmail = new JLabel("�̸���", JLabel.RIGHT);
		lblBirthday = new JLabel("�������", JLabel.RIGHT);

		// �ؽ�Ʈ �ʵ� ����
		tfName = new JTextField();
		tfPhone = new JTextField();
		tfEmail = new JTextField();
		tfBirthday = new JTextField();

		// ȭ�鿡 ��ġ
		centerPanel.setLayout(new GridLayout(4, 2, 3, 3));
		centerPanel.add(lblName);
		centerPanel.add(tfName);

		centerPanel.add(lblPhone);
		centerPanel.add(tfPhone);

		centerPanel.add(lblEmail);
		centerPanel.add(tfEmail);

		centerPanel.add(lblBirthday);
		centerPanel.add(tfBirthday);

		// ��ο� �ø���
		add("Center", centerPanel);

		// �ڵ尡 �ʹ� ��� �������� �ڵ带 �߶� �ۿ��ٰ� �޼ҵ带 ����� �޼ҵ带 ȣ��
		display();

		// �����ͺ��̽����� �����͸� �����ɴϴ�.
		list = dao.allContact();
		printData();

		setBounds(100, 100, 800, 700);
		setTitle("����ó");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	private void display() {
		
		//��ư ����
		btnFirst = new JButton("ó������");
		btnPrev = new JButton("��������");
		btnPrev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(idx == 0) {
					JOptionPane.showMessageDialog(null, "ù��° ������ �Դϴ�.", "��ȸ����",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				idx = idx -1;
				printData();
			}
		});
		btnNext = new JButton("��������");
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				idx = idx +1;
				if(idx == list.size()) {
					idx = 0;
				}
				printData();
			}
		});
		btnLast = new JButton("����������");
		btnLast.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		btnInsert = new JButton("����");
		
		btnInsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//lblIndex�� �ؽ�Ʈ�� ������ �ƴϸ� �޽��� �ڽ���
				//����ϰ� �Լ��� ������ ����
				//���ڿ��� ���ϼ� ���δ� == �� �ƴϰ� equals�� �ؾ� �մϴ�.
				
				if(lblIndex.getText().equals("����") == false) {
					JOptionPane.showMessageDialog(null,  "����� ������", "���Կ���",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				//�Է��� �����͸� ��������
				String name = tfName.getText();
				String phone = tfPhone.getText();
				String email = tfEmail.getText();
				String birthday = tfBirthday.getText();
				
				//name�� �ʼ� �Է��̰� 3�� �̻� �Է��ߴ��� �˻�
				if(name.trim().length() < 3) {
					JOptionPane.showMessageDialog(null,  "�̸��� 3�� �̻�", "�̸�����", 
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				//phone�� ���� �����̰� 11�ڸ����� �˻�
				if(phone.trim().length() != 11) {
					JOptionPane.showMessageDialog(null, "��ȭ��ȣ�� 11�ڸ�", "��ȭ��ȣ ����",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				int i = 0;
				while(i<phone.trim().length()) {
					char ch = phone.trim().charAt(i);
					if(ch < '0' || ch > '9') {
						JOptionPane.showMessageDialog(null, "��ȭ��ȣ�� ���ڸ�", "��ȭ��ȣ ����" ,
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					i = i +1;
				}
				//Dao�� �޼ҵ忡 �°� �����͸� ����
				Contact contact = new Contact();
				contact.setName(name);
				contact.setEmail(email);
				contact.setPhone(phone);
				//birthday�� yyymmdd �������� �ԷµǾ��ٰ� �����ϰ�
				//Date Ÿ������ �����ϱ�
				System.out.println(birthday);
				int year = Integer.parseInt(birthday.substring(0, 4));
				System.out.println(birthday.substring(0,4));
				System.out.println(birthday.substring(4,6));
				System.out.println(birthday.substring(6));
				int month = Integer.parseInt(birthday.substring(4, 6));
				
		int day = Integer.parseInt(birthday.substring(6));
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH,  month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		Date date = new Date(cal.getTimeInMillis());
		contact.setBirthday(date);
		
		dao.insertContact(contact);
		
		list = dao.allContact();
		idx = list.size() - 1;
		printData();
		//��ȭ���� ����ϱ�
		JOptionPane.showMessageDialog(null,  "���Լ���", "������ ����", 
				JOptionPane.INFORMATION_MESSAGE);
			
		}
		});
		
		
		btnUpdate= new JButton("����");

		btnUpdate.addActionListener(new ActionListener() {

	@Override
			public void actionPerformed(ActionEvent e) {
			String name = tfName.getText();
			String phone = tfPhone.getText();
			String email = tfEmail.getText();
			String birthday = tfBirthday.getText();
				
			//name�� �����Ͱ� ��������� �޽��� �ڽ� ����ϰ� �����ϱ�
			if(name.trim().length() < 1) {
				JOptionPane.showMessageDialog(null, "�̸��� �ʼ� �Է��Դϴ�." ,
						"�Է¿���", JOptionPane.ERROR_MESSAGE);
				return;
			}
			//phone�� �����Ͱ� ��� ������ �޽��� �ڽ��� ����ϰ�
			//�����ϰ� ����ϱ�
			if(phone.trim().length() <1) {
				JOptionPane.showMessageDialog(null, "��ȭ��ȣ�� �ʼ� �Է��Դϴ�.",
						"�Է� ����", JOptionPane.ERROR_MESSAGE);
				return;
			}
			//��¥ �����Ͱ� �⵵ 4�ڸ�-��2�ڸ�-�� ���ڸ� �������� ����
			int i = 0;
			if(birthday.length() !=10) {
				JOptionPane.showMessageDialog(null, "������ 10�ڸ��� ������ּ���",
						"�Է¿���", JOptionPane.ERROR_MESSAGE);
				return;
			}
			while(i<birthday.length()) {
				char ch = birthday.charAt(i);
				//ù��°���� �׹�°���� ���ڰ� �ƴϸ� �ݺ��� ����
				
				if(i>=0 && i<=3) {
					if(ch < '0' || ch > '9') {
						break;
					}
				}
				if(i == 4 || i == 7) {
					if(ch != '-') {
						break;
					}
				}
				if(i==5) {
					if(ch !='0' && ch != '1') {
						break;
						
					}
				}
				if( i == 6) {
					if (ch < '0' || ch > '9') {
						break;
					}
				}
				i = i + 1;
			}
			//��ȿ�� �˻翡 �����ϸ� �޽��� �ڽ��� ����ϰ� ����
			if(i != birthday.length()) {
				JOptionPane.showMessageDialog(null,  "������ YYYY-MM-DD ����",
						"�Է� ����", JOptionPane.ERROR_MESSAGE);
				return;
			}
			Contact contact = new Contact();
			contact.setNum(list.get(idx).getNum());
			contact.setName(name);
			contact.setEmail(email);
			contact.setPhone(phone);
			//yyyy-mm-dd ������ ���ڿ��� ������ Date �����
			int year = Integer.parseInt(birthday.substring(0, 4));
					int month = Integer.parseInt(birthday.substring(5,7));
					int day = Integer.parseInt(birthday.substring(8));
					Calendar cal = Calendar.getInstance();
					cal.set(Calendar.YEAR, year);
					cal.set(Calendar.MONTH, month-1);
					cal.set(Calendar.DAY_OF_MONTH, day);
					//Calendar ��ü�� �̿��ؼ� Date ��ü �����
					Date date = new Date(cal.getTimeInMillis());
					contact.setBirthday(date);
					
					dao.updateContact(contact);
					JOptionPane.showMessageDialog(null, "��������",
							"������ ����", JOptionPane.INFORMATION_MESSAGE);
					list = dao.allContact();
					printData();
	
			}
		});
		
		btnDelete = new JButton("����");
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			int r=	JOptionPane.showConfirmDialog(null,
						"������ ����?", "����",
						JOptionPane.YES_NO_OPTION);
				System.out.println(r);
				if(r == 0) {
					JOptionPane.showMessageDialog(null,  "��������", "����",
							JOptionPane.ERROR_MESSAGE);
					dao.deleteContact(list.get(idx).getNum());
					list = dao.allContact();
					idx = 0;
					printData();
				}
				
			}
		});
		
		btnSearch= new JButton("��ȸ");
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(
						null, "��ȸ�� �̸��� �Ϻκ��� �Է��ϼ���!",
						"�̸����� ��ȸ", JOptionPane.QUESTION_MESSAGE);
				tfName.setText("");
				tfPhone.setText("");
				tfEmail.setText("");
				tfBirthday.setText("");
				if(name != null) {
					list = dao.nameContact(name.trim().toUpperCase());
					idx = 0;
					printData();
					
				}
			}
		});
		
		
		
		btnClear = new JButton("����");

		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�ؽ�Ʈ �ʵ���� �ؽ�Ʈ�� ���� ����
				
				//lblIndex�� Ÿ��Ʋ�� �������� ����
				tfName.setText("");
				tfEmail.setText("");
				tfPhone.setText("");
				tfBirthday.setText("");
				//lblIndex�� Ÿ��Ʋ�� �������� ����
				lblIndex.setText("����");
				
			}
		});
		
		lblIndex = new JLabel("�ε���", JLabel.CENTER);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,  5, 7, 7));
		panel1.setBorder(new TitledBorder("��ȸ"));
		panel1.add(btnFirst);
		panel1.add(btnPrev);
		panel1.add(lblIndex);
		panel1.add(btnNext);
		panel1.add(btnLast);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,  5, 7, 7));
		panel2.setBorder(new TitledBorder("�۾�"));
		panel2.add(btnInsert);
		panel2.add(btnUpdate);
		panel2.add(btnDelete);
		panel2.add(btnSearch);
		panel2.add(btnClear);
		
		JPanel p = new JPanel(new BorderLayout());
		p.add("Center", panel1);
		p.add("South", panel2);
		
		add("South", p);
	}
}
