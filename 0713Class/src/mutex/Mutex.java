package mutex;

public class Mutex implements Runnable {
	private int result;
	private int idx;

	// synchronize�� ���� �޼ҵ��
	// ���� ���� �����尡 ���ÿ� ȣ���ϴ��� �ϳ��� ������ ������ ����� �Ŀ�
	// �޼ҵ尡 ȣ��˴ϴ�.
	private synchronized  void sum() {
		for (int i = 0; i < 10000; i = i + 1) {
			//�ڽ��� ������ �ִ� �ڿ��� ��� �� ����
			//�� �ڵ� ������ ���������� �����ϵ��� ���ִ� ����
			synchronized (this) {
				idx = idx + 1;
				//System.out.println("idx:" + idx);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				result = result + idx;
				//System.out.println("result:" + result);
			}
		}
	}

	@Override
	public void run() {
		sum();
	}

	// result ���� �������ִ� �޼ҵ�
	public int getResult() {
		return result;
	}
}
