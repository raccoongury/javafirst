package thread;

public class ThreadEx1 extends Thread {
	@Override
	public void run() {
		//������� ������ ����
		//1�ʾ� ���鼭 0-9������ ������� ���
		for (int i = 0; i < 10; i = i +1) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
