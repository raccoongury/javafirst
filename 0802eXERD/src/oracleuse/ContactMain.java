package oracleuse;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class ContactMain {

	public static void main(String[] args) {
		// �������̽��� Ŭ������ ����� ��쿡��
		// ���� �������̽��� Ŭ���� �̸����� ������ �����
		// ���� Ŭ������ �ν��Ͻ��� �����ؼ� �����մϴ�.

		/*
		 * ContactDao dao = new ContactDaoImpl(); Contact contact = new Contact();
		 * contact.setNum(1); contact.setName("�ڹ���"); contact.setPhone("01037901997");
		 * contact.setEmail("ggangpae1@gmail.com"); //���� �ð��� ������ Ķ���� ���� Calendar cal =
		 * Calendar.getInstance(); cal.set(Calendar.YEAR, 1970); cal.set(Calendar.MONTH,
		 * 5); cal.set(Calendar.DAY_OF_MONTH,30); Date birthDay = new
		 * Date(cal.getTimeInMillis()); contact.setBirthday(birthDay);
		 */

		/*
		 * 
		 * //�����͸� �����ϴ� �޼ҵ� ȣ�� boolean result = dao.insertContact(contact); if( == true)
		 * { System.out.println("���� ����"); }else { System.out.println("���� ����");
		 * System.out.println("���ܸ� Ȯ��");
		 * 
		 */
		/*
		 * ContactDao dao = new ContactDaoImpl(); boolean r = dao.deleteContact(2); if(r
		 * == true) { System.out.println("���� ����"); }else { System.out.println("���� ����");
		 * System.out.println("���ܸ� Ȯ��");
		 */
		
		/*
		ContactDao dao = new ContactDaoImpl();
		List<Contact> list = dao.allContact();
		// System.out.println(list);
		for (Contact contact : list) {
			System.out.println(contact);
			*/
		/*
		ContactDao dao = new ContactDaoImpl();
		List<Contact> list = dao.nameContact("��");
		// System.out.println(list);
		for (Contact contact : list) {
			System.out.println(contact);
			*/
		new ContactView();
		}

	}

