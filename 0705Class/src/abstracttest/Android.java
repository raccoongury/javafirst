package abstracttest;

public class Android extends SmartPhone {
	public void call() {
		double x = 10.75;
		// �Ҽ� ù°�ڸ� �ݿø��ؼ� ����ϱ�
		System.out.println("x:" + (int) (x + 0.5));
		// �Ҽ� ��°�ڸ� �ݿø��ؼ� ����ϱ�
		System.out.println("x:" + ((int)(x*10+0.5))/10.0);
		//10.75 -> 107.5 ->108.0 -> 108 -> 10.8
	}
}
