package thread;

import java.util.Random;

public class ThreadEx2 extends Thread {
	//������� ������ ������ �ۼ��ϴ� �޼ҵ�
	public void run() {
		//���� �Ķ� ����� �����ϰ� 1�� ���� ����ϱ�
		String [] color = {"����", "�Ķ�", "���"};
		//������ ����� �ִ� Ŭ������ �ν��Ͻ� �����
		Random r = new Random();
		//���� �ݺ�
		while (true) {
			//color �迭�� �����͸� �����ϰ� ���
			System.out.println(color[r.nextInt(color.length)]);
			//1�ʾ� ���
			try {
				Thread.sleep(1000);;
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
