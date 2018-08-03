package oracleuse;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class ContactMain {

	public static void main(String[] args) {
		// 인터페이스나 클래스를 상속한 경우에는
		// 상위 인터페이스나 클래스 이름으로 변수를 만들고
		// 하위 클래스의 인스턴스를 생성해서 대입합니다.

		/*
		 * ContactDao dao = new ContactDaoImpl(); Contact contact = new Contact();
		 * contact.setNum(1); contact.setName("박문석"); contact.setPhone("01037901997");
		 * contact.setEmail("ggangpae1@gmail.com"); //현재 시간을 저장한 캘린더 생성 Calendar cal =
		 * Calendar.getInstance(); cal.set(Calendar.YEAR, 1970); cal.set(Calendar.MONTH,
		 * 5); cal.set(Calendar.DAY_OF_MONTH,30); Date birthDay = new
		 * Date(cal.getTimeInMillis()); contact.setBirthday(birthDay);
		 */

		/*
		 * 
		 * //데이터를 삽입하는 메소드 호출 boolean result = dao.insertContact(contact); if( == true)
		 * { System.out.println("수정 성공"); }else { System.out.println("수정 실패");
		 * System.out.println("예외를 확인");
		 * 
		 */
		/*
		 * ContactDao dao = new ContactDaoImpl(); boolean r = dao.deleteContact(2); if(r
		 * == true) { System.out.println("삭제 성공"); }else { System.out.println("삭제 실패");
		 * System.out.println("예외를 확인");
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
		List<Contact> list = dao.nameContact("박");
		// System.out.println(list);
		for (Contact contact : list) {
			System.out.println(contact);
			*/
		new ContactView();
		}

	}

