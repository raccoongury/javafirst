package thread;

public class ThreadEx4 implements Runnable {
	private String name;
	
	//������
	//�ν��Ͻ��� ������ �� ���ڿ��� 1�� �޾Ƽ� name�� �������ִ� ������
	public ThreadEx4(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		//������ �ֱ⸦ ������ �ݺ��ؼ� ������ ���� ����
		//1�ʸ��� name�� ����ϴ� �۾� 10�� ����
		for(int i=0; i<10; i=i+1) {
			System.out.println(name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



