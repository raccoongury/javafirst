package thread;

public class Bank {
	// �ܾ��� ������ ����
	private int balance = 1000;

	// �ܾ��� �����ϴ� �޼ҵ�
	public void job(String msg) {
		// this - �� �ڽ��� �ڿ��� ����ϴ� ���
		// �� �ڵ�� �� ���� ����ǵ��� ����

		synchronized (this) {
			System.out.println("���� �ܾ�:" + balance);
			balance = balance - 100;
			// 1�� ���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(msg + "�۾� �� ���� �ܾ�:" + balance);
		}
	}
}
