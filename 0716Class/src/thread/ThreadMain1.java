package thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		// Ŭ������ run �޼ҵ� ���
		ThreadEx1 th1 = new ThreadEx1();
		//���� ������� ����
		//�ٸ� �����尡 �۾� ���� �ƴϸ� �ڵ� ����
		th1.setDaemon(true);
		// ������ ����
		th1.start();
		
		try {
			Thread.sleep(2000);
			//InterruptedException�� �߻���ŵ�ϴ�.
			th1.interrupt();
			
			Thread.sleep(3000);
			System.out.println("���� ����");
			//���α׷� ����
			//System.exit(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
