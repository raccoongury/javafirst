package thread;

public class ThreadEx2 extends Thread {
	private Bank bank;
	private String name;
		//�����ڿ��� Bank�� ���ڿ�1���� ���Թޱ�
	public ThreadEx2(Bank bank, String name) {
		this.bank = bank;
		this.name = name;
	}
	
		//������� ������ �޼ҵ�
	public void run( ) {
		//bank�� �޼ҵ带 3�� ȣ��
		for(int i = 0; i<3; i=i +1) {
			bank.job(name);
		}
	}
}