package thread;

import java.util.Random;

public class Horse extends Thread {
	private static int rank;
	public void run() {
		//������ �̸� ���
		System.out.println(getName() + " ���");
		
		//���� ��ġ�� ������ ����
		int pos = 0;
		//������ ���� �������� ���� ����
		Random r = new Random();
		while(true) {
			try {
				Thread.sleep(100);
				pos = pos + r.nextInt(10);
				if(pos > 100) {
					break;
				}
				System.out.println(getName() + ":  " + pos);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		rank = rank + 1;
		System.out.println(getName() + "���� ����");
		System.out.println(getName() +"����" + " " + rank + "��");
	}
}




