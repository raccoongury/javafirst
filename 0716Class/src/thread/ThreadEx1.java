package thread;

public class ThreadEx1 extends Thread {
	//������� ������ �޼ҵ�
	public void run() {
		//1�ʸ��� Thread��� ���ڸ� 10�� ���
		/*
		for(int i = 0; i<10; i=i+1) {
			
		}
		*/
		int i = 0;
		while(i<10) {
			System.out.println("Thread");
			//1�ʾ� ���
			//Thread Ŭ������ static �޼ҵ���
			//sleep(�ð�)�� �̿�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
				//�����带 ���� ���� �� �� �ֵ���
				//���ܰ� �߻��ϸ� run �޼ҵ� ����
				return;
			}
			
			i = i + 1;
		}
	}
}







