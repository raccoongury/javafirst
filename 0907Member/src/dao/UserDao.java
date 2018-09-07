package dao;

import vo.TMember;

//데이터베이스 작업을 위한 메소드를 선언할 인터페이스
public interface UserDao {

	// 로그인 처리를 위한 메소드
	// 매개변수는 아이디와 비밀번호 -> 하나로 묶어서 받습니다.
	// 처리결과는 아이디와 기타 필요한 정보 -> 하나로 묶어서 리턴
	public TMember login(TMember tmember);
	
	//회원가입을 처리해주는 메소드
	 public boolean registerMember(TMember member);
	 
	 //이메일 중복검사를 위한 메소드
	 public boolean emailCheck(String email);
}
