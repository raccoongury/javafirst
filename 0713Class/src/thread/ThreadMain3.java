package thread;

public class ThreadMain3 {

	public static void main(String[] args) {
		//Runnable �������̽��� implements �� Ŭ������ �̿��ؼ� ���������
		ThreadEx3 obj = new ThreadEx3();
		Thread th = new Thread(obj);
		th.start();

	}

}
