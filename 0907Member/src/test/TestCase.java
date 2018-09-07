package test;

import org.junit.Test;

import dao.UserDao;
import dao.UserDaoImpl;
import vo.TMember;


public class TestCase {

	@Test
	public void sample() {
		UserDao userDao = UserDaoImpl.sharedInstance();
//		TMember member = new TMember();
//		member.setEmail("kevin12345@gmail.com");
//		member.setPw("8");
//		member.setName("케빈");
//		member.setPhone("01087654321");
//		member.setAddr("서울시 서초구 양재2");
//		boolean r = userDao.registerMember(member);
//		System.out.println(r);
		
		//없을 경우 false 있을 경우 true 출
		System.out.println(userDao.emailCheck(
				"kevin15@gmail.com"));
	}
}
