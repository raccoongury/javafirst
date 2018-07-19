package swing;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AddressBook extends JFrame {
	//�÷� �̸� �迭
	String [ ] colums = {
			"�̸�", "��ȭ��ȣ", "�ּ�"
	};
	
	//������ �迭
	String [ ] [ ] data = {
			{"ȫ�浿", "01037901997",
				"����� ��õ�� ȫ�浿"},
			{"�ڱ浿", "01012345678",
					"����� ���ʱ� �ڱ浿"},
			{"�̱浿", "01098765431",
					"����� ���ϱ� �̱浿"},
			{"�ұ浿", "01067895431",
			"����� ���ϱ� �ұ浿"}
	};
	
	public AddressBook() {
		setBounds(100, 100, 1000, 400);
		setTitle("����ó");
		setDefaultCloseOperation(
				EXIT_ON_CLOSE);
		
		//���̺� �� �����
		DefaultTableModel model = 
			new DefaultTableModel(data, colums);
		//���̺� ���� �̿��ؼ� ���̺��� �����
		JTable table = new JTable(model);
		//table.setModel(model);
		//��� ������ ũ�⺸�� table�� Ŀ������
		//��ũ�� �ٸ� �̿��� �� �ֵ��� Scroll�� ����
		JScrollPane scrollPane = 
			new JScrollPane(table);
		//��ũ�� ������ �����ӿ� ����
		add(scrollPane);
		
		/*
		//�޴� �ٸ� ����
		JMenuBar menuBar = new JMenuBar();
		
		JMenu file = new JMenu("����(a)");
		//����Ű ����
		file.setMnemonic('a');
		
		JMenuItem item1 = new JMenuItem("����");
		file.add(item1);
	
		JCheckBoxMenuItem item2 = 
			new JCheckBoxMenuItem("����");
		file.add(item2);
	
		JRadioButtonMenuItem item3 = 
				new JRadioButtonMenuItem("����");
		file.add(item3);
	
		
		menuBar.add(file);
		
		//�޴� �ٸ� �����쿡 ����
		setJMenuBar(menuBar);
		
		*/
		
		JLabel lblName = new JLabel("�̸�");
		JTextField tfName = new JTextField(10);
		JLabel lblPhone = new JLabel("��ȭ��ȣ");
		JTextField tfPhone = new JTextField(15);
		JLabel lblAddress = new JLabel("�ּ�");
		JTextField tfAddress = new JTextField(30);
		
		JButton btnInsert = new JButton("����");
		JButton btnDelete = new JButton("����");
		
		JPanel southPanel = new JPanel();
		southPanel.add(lblName);
		southPanel.add(tfName);
		southPanel.add(lblPhone);
		southPanel.add(tfPhone);
		southPanel.add(lblAddress);
		southPanel.add(tfAddress);
		southPanel.add(btnInsert);
		southPanel.add(btnDelete);
		
		add("South", southPanel);
		
		setVisible(true);
		
		//���� ��ư�� Ŭ�� �̺�Ʈ ó��(ActionListener) ó��
		ActionListener insertListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					//�ؽ�Ʈ �ʵ忡 �Էµ� ���� ��������
				String name = tfName.getText();
				String phone = tfPhone.getText();
				String address = tfAddress.getText();
				
				//�¿� ���� �����ϱ�
				name = name.trim();
				phone = phone.trim();
				address = address.trim();
				
				//name�� �ʼ� �Է�
				if(name.length() == 0) {
					JOptionPane.showMessageDialog(null, "�̸��� �ʼ� �Է�", "�̸�", 
							JOptionPane.WARNING_MESSAGE);
				//�Ʒ����� ���̻� �������� �ʵ��� ����
					return;
				}
				
				//���̺��� �����͸� �����ϱ� ���ؼ� ���̺��� 
				//������ ���� �����ɴϴ�.
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				//�����͸� �߰��ϱ� ���ؼ� �߰��� ������ �迭�� ����
				String [ ] row = {name, phone, address};
				//�𵨿� �߰�
				model.addRow(row);
				//���̺��� ����
				table.updateUI();
				
				//�ؽ�Ʈ �ʵ� Ŭ����
				tfName.setText("");
				tfPhone.setText("");
				tfAddress.setText("");
				
				//�޽��� �ڽ� ���
				JOptionPane.showMessageDialog(null, 
					"������ ���� ����", "�����۾�", 
					JOptionPane.PLAIN_MESSAGE);
				
			}
	};
	btnInsert.addActionListener( insertListener);
	
	
	ActionListener deleteListener = 
		new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//������ �� ��ȣ ã��
				int idx = table.getSelectedRow();
				//���̺��� ���� �������� �ʾҴٸ�
				if(idx<0 || idx >=table.getRowCount()) {
					JOptionPane.showMessageDialog( null, "���� �����ϼ���!!", "���� ����", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				//���̺��� �� ��������
				DefaultTableModel model = 
					(DefaultTableModel)table.getModel();
				//������ �࿡ �ش��ϴ� ������ �����
				model.removeRow(idx);
				table.updateUI();
				JOptionPane.showMessageDialog(
					null, "������ ���� ����", 
					"����", JOptionPane.WARNING_MESSAGE);
				
			}
	};
	btnDelete.addActionListener(deleteListener);
		
		//�޽��� ���̾�α� ���
		/*
		JOptionPane.showMessageDialog(
			null, "�޽��� ���̾�α�", "��ȭ����",
			JOptionPane.QUESTION_MESSAGE);
		*/
		
		//���� ���̾�α� ���
		/*
		int r = JOptionPane.showConfirmDialog(
			null, "�޽��� ���̾�α�", "��ȭ����",
			JOptionPane.YES_NO_OPTION);
		System.out.println(r);
		*/
		//���� �Է¹޴� ���̾�α� ���
		/*
		String r = JOptionPane.showInputDialog(
				null, "�޽��� ���̾�α�", "��ȭ����",
				JOptionPane.YES_NO_OPTION);
		System.out.println(r);
		*/
		
	}
}









