package innerclass;

public class Outer {
	//일반 inner class : 클래스 안에 존재하는 클래스
	/*
	class Inner{
		
	}
	*/
	//static inner class : 내부 클래스 안에 static 멤버가 있으면
	//일반 inner class는 에러를 발생시킵니다.
	//이 때는 class 앞에 static을 붙여 주어야 합니다.
	static class Inner {
		static int n;
	}
}




