package test;

import dao.UserDao;
import dao.UserDaoImpl;
import vo.TMember;

public class Main {

	public static void main(String[] args) {
		UserDao userDao = UserDaoImpl.sharedInstance();
		TMember member = new TMember();
		member.setEmail("raccoongury@gmail.com");
		member.setPw("12345678");
		member.setName("이정원");
		member.setPhone("01092611523");
		member.setAddr("서울시 서초구 양재1");
		boolean r = userDao.registerMember(member);
		System.out.println(r);
	}
}
