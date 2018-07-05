package abstracttest;

public class Main {

	public static void main(String[] args) {
		SmartPhone smartPhone = new Iphone();// Iphone iphone = new Iphone();
		smartPhone.call();// iphone.call();
		// call에 오류나면 SmartPhone 클래스에 가서 public void call() {}추가
		smartPhone = new Android();// Android android = new Android();
		smartPhone.call();// android.call();

		// SmartPhone의 인스턴스 생성
		// smartPhone = new SmartPhone();//SmartPhone 클래스에 abstract를 추가한 추상메소드가 되면

		smartPhone = new WinPhone();
		smartPhone.call();

		// final 변수 - 값을 변경할 수 없습니다.
		// 지역변수지만 전역변수처럼 메모리에서 소멸되지 않습니다.
		final int ZERO = 0;
		// ZERO = 1;

		int command = 1;
		final int LBUTTONDOWN = 1;
		final int RBUTTONDOWN = 2;
		if (command == LBUTTONDOWN) {

		} else if (command == RBUTTONDOWN) {

		}

	}
}
