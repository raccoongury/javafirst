package oracleuse;

import java.util.List;

public interface ContactDao {
		//�����͸� �����ϴ� �޼ҵ�
	public boolean insertContact (Contact contact);
	
		//�����͸� �����ϴ� �޼ҵ�
	public boolean updateContact (Contact contact);
	
	//�����͸� �����ϴ� �޼ҵ�
	public boolean deleteContact (int num);
	
	//������ ��ü�� �о���� �޼ҵ�
	//=�����Ͱ� 0�� �̻��̹Ƿ� List�� �����ϰ� �о�� �÷����� ������
	//DTOŬ������ Map���� ���ʸ��� �����ϸ� �˴ϴ�.
	public  List<Contact> allContact();
	//�̸��� ������ ��ȸ�ϴ� �޼ҵ�
	public List<Contact> nameContact(String name);
}
