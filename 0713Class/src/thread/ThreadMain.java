package thread;

public class ThreadMain {

	public static void main(String[] args) {
		//�տ��� ���� Ŭ������ �ν��Ͻ��� ����� run �޼ҵ带 ȣ��
		/*
		ThreadEx1 th1 = new ThreadEx1();
		th1.run();
		ThreadEx1 th2 = new ThreadEx1();
		th2.run();
	*/
		
		//������� ����
		ThreadEx1 th1 = new ThreadEx1();
		th1.start();
		ThreadEx1 th2 = new ThreadEx1();
		th2.start();
		
	}

}
