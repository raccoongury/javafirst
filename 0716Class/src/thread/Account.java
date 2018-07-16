package thread;

public class Account {
	private int balance;

	// �ܾ��� �߰��ϴ� �޼ҵ�
	public synchronized void save() {
		System.out.println("�Ա� �� �ܾ�:" + balance);
		balance = balance + 1000;
		//wait() ���� �޼ҵ� �����
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�Ա� �� �ܾ�:" + balance);

	}

	// �ܾ��� ���ҽ�Ű�� �޼ҵ�
	public synchronized void depo() {
		if(balance < 1000) {
			try {
				//notify()�� ȣ���� �� ���� ���
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("��� �� �ܾ�:" + balance);
		balance = balance - 1000;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��� �� �ܾ�:" + balance);

	}
}


