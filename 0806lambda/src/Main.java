
public class Main {

	public static void main(String[] args) {
		//������ Ŭ������ ���� �̿�
		/*
		RunnableImpl r = 
				new RunnableImpl();
		Thread th = new Thread(r);
		th.start();
		
		RunnableImpl r1 = 
				new RunnableImpl();
		Thread th1 = new Thread(r1);
		th1.start();
		*/
		
		//�͸� Ŭ���� �̿��ϱ�
		Runnable r = () -> {
				//1�ʸ��� ���鼭 1���� 10���� ���
				int i=1;
				while(i<=10) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("i:" + i);
					i = i + 1;
				}
		};
		
		Thread th = new Thread(r);
		th.start();
		

	}
}








