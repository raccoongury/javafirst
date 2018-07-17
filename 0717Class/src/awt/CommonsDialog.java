package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog extends Frame {
	//������ - �ν��Ͻ��� ���� �� �� ȣ���ϴ� �޼ҵ�
	public CommonsDialog() {
		//��ġ�� ũ�⸦ ����
		setBounds (200, 200, 600, 600);
		//������
		setTitle("���� ��ȭ ����");
		//FileDialog ��ü�� �����ؼ� ȭ�鿡 ����ϰ�
		//������ ���� ��θ� ���̺� ���
		//FileDialog�� ������ �� ù��° �Ű�������
		//Dialog �� Frame�� �ּ��ε�
		//������ ���� this�� �����ϸ� �˴ϴ�
		
		//���� ��ȭ���� ����� �ν��Ͻ� ����
		FileDialog fileDialog = new FileDialog(this, "���� ��ȭ����");
		
		//�� �丮 ����
		fileDialog.setDirectory("C:\\Users\\503-17\\Downloads");
		
		//���� ��ȭ���ڸ� ȭ�鿡 ���
		fileDialog.setVisible(true);
		
		//������ ���丮�� ���� ��� ��������
		String filePath = fileDialog.getDirectory() + fileDialog.getFile();
		
		Label label = new Label(filePath);
		add(label);
		
		setVisible(true);
		
	}

}
