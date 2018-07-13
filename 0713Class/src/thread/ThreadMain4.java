package thread;

public class ThreadMain4 {

	public static void main(String[] args) {
		//Runnable �������̽��� implements �� Ŭ������ �ν��Ͻ�
		ThreadEx4 obj1 = new ThreadEx4("������ 1");
		ThreadEx4 obj2 = new ThreadEx4("������ 2");
		
		//������ ����
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		
		//�������� �켱 ���� ����
		//���� ���� �켱 ������ ����
		th1.setPriority(Thread.MIN_PRIORITY);
		//���� ���� �켱 ������ ����
		th2.setPriority(Thread.MAX_PRIORITY);
		
		//������ ����
		th1.start();
		th2.start();
		
		
		try {
			Thread.sleep(3000);
			th1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}





