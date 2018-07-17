package awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemWindow extends Frame {
	public ItemWindow() {
		setBounds(100,100, 500, 300);
		setTitle("�̺�Ʈ �ڵ鸵");
		
		Panel northPanel = new Panel();
		
		Checkbox cnboolean = new Checkbox("boolean");
		Checkbox cnbyte = new Checkbox("byte");
		Checkbox cnshort = new Checkbox("short");
		Checkbox cnchar = new Checkbox("char");
		Checkbox cnint = new Checkbox("int");
		Checkbox cnlong = new Checkbox("long");
		Checkbox cnfloat = new Checkbox("float");
		Checkbox cndouble = new Checkbox("double");
		
		northPanel.add(cnboolean);
		northPanel.add(cnbyte);
		northPanel.add(cnshort);
		northPanel.add(cnchar);
		northPanel.add(cnint);
		northPanel.add(cnlong);
		northPanel.add(cnfloat);
		northPanel.add(cndouble);
		
		add("North", northPanel);
		
		
		//�߾ӿ� TextArea ��ġ
		TextArea ta = new TextArea(10, 70);
		add("Center", ta);
		
		//�޺��ڽ� 2�� ��ġ
		//�޺��ڽ��� ��ġ�� ������ �����
		String [] category = {
				"Programming", "Database", 
				"IDE", "Framework"
		};
		String [][] content = {
				{"Java", "JavaScript", "Swift"},
				{"Oracle", "MySQL", "MongoDB"},
				{"Eclipse", "Android Studio", "XCode"},
				{"Spring", "MyBatis", "Hibernate"}
		};
		
		Choice cbcategory = 
			new Choice();
		for(String imsi : category) {
			cbcategory.add(imsi);
		}
		
		Choice cbcontent = new Choice();
		for(String imsi : content[0]) {
			cbcontent.add(imsi);
		}
		
		Button btnSelect = new Button("����");
		Button btnExit = new Button("����");
		
		Panel southPanel = new Panel();
		southPanel.add(cbcategory);
		southPanel.add(cbcontent);
		southPanel.add(btnSelect);
		southPanel.add(btnExit);
		
		add("South", southPanel);
		
		//üũ �ڽ��� ������ �� ȣ��� �޼ҵ�
		ItemListener itemHandler1 = 
			new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					//�̺�Ʈ�� �߻��� �ν��Ͻ��� ������ �ڷ�����
					//Checkbox�� ��ȯ
					//�̺�Ʈ ó�� �޼ҵ忡��
					//e.getSource()�� �̺�Ʈ�� �߻���
					//�ν��Ͻ��� �ּҸ� �����մϴ�.
					Checkbox cb = 
						(Checkbox)(e.getSource());
					//üũ �ڽ��� �Էµ� �ؽ�Ʈ ��������
					String label = cb.getLabel();
					//üũ �ڽ� ���� ���� ��������
					boolean b = cb.getState();
					ta.append(label + " " + b + "�� ����\n");
				}
		};
		
		//üũ�ڽ��� ������ �� ȣ��� �ν��Ͻ� ����
		cnboolean.addItemListener(itemHandler1);
		cnbyte.addItemListener(itemHandler1);
		cnshort.addItemListener(itemHandler1);
		cnchar.addItemListener(itemHandler1);
		cnint.addItemListener(itemHandler1);
		cnlong.addItemListener(itemHandler1);
		cnfloat.addItemListener(itemHandler1);
		cndouble.addItemListener(itemHandler1);
		
		//ī�װ� �޺� �ڽ��� ������ ����Ǿ��� ��
		//ȣ��� �޼ҵ带 ���� Listener
		//ItemListener�� ó��
		ItemListener itemHandler2 = 
			new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					//cbcategory�� ���õ� �� ��ȣ ��������
					int row = cbcategory.getSelectedIndex();
					//cbcontent�� ������ ���� ����
					cbcontent.removeAll();
					//���ȣ�� �ش��ϴ� ���� ������ cbcontent�� �߰�
					for(String temp : content[row]) {
						cbcontent.add(temp);
					}
					
				}
		};
		
		cbcategory.addItemListener(itemHandler2);
		
		ActionListener action1 = 
			new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					int caNum = cbcategory.getSelectedIndex();
					int coNum = cbcontent.getSelectedIndex();
					String categoryText = category[caNum];
					String contentText = content[caNum][coNum];
					ta.setText(categoryText + ":" + contentText);
					
				}
			
		};
		
		btnSelect.addActionListener(action1);
		
		setVisible(true);
	}
}






