package exceptionhandling;

public class Main3 {

	public static void main(String[] args) {
		//java.lang.Thread ��� Ŭ�������� sleep �̶�� �޼ҵ尡 �ִµ�
		//�� �޼ҵ�� �Ű������� ���Ե� �ð���ŭ ������ ���� ��Ű�� ������ �մϴ�.
		//�� �޼ҵ带 �̿��ؼ� 1-10������ 1�ʾ� ���鼭 ���
	/*	
		for(int i = 1; i <11; i=i+1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	*/
		/*
		//image0.png, image1.png, image2.png ������� �ݺ�
		int idx = 0;
		for(;;) {
			System.out.println("image" + (idx%3) + ".png");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			idx = idx + 1;
		}
		*/
		//�����, ������, ���Ⳳ, �̴����� �ݺ�(������ ���°� ������ �ְ� ������ִ� �迭)
		String [] ar = {"�����", "������", "���Ⳳ", "�̴���"};
		int size = ar.length;//size=4
		int idx = 0;
		while(true) {
			System.out.println(ar[idx%size]);
			idx = idx + 1;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

