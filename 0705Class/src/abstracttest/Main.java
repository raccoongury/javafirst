package abstracttest;

public class Main {

	public static void main(String[] args) {
		SmartPhone smartPhone = new Iphone();// Iphone iphone = new Iphone();
		smartPhone.call();// iphone.call();
		// call�� �������� SmartPhone Ŭ������ ���� public void call() {}�߰�
		smartPhone = new Android();// Android android = new Android();
		smartPhone.call();// android.call();

		// SmartPhone�� �ν��Ͻ� ����
		// smartPhone = new SmartPhone();//SmartPhone Ŭ������ abstract�� �߰��� �߻�޼ҵ尡 �Ǹ�

		smartPhone = new WinPhone();
		smartPhone.call();

		// final ���� - ���� ������ �� �����ϴ�.
		// ������������ ��������ó�� �޸𸮿��� �Ҹ���� �ʽ��ϴ�.
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
