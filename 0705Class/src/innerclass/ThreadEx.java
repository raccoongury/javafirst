package innerclass;
//Thread�� ��ӹ��� Ŭ����
public class ThreadEx extends Thread {
	//�������̵� �� �޼ҵ��� ���� ��Ÿ���� ������̼�
	@Override
	public void run() {
			try {
				for(int i=0; i<10; i = i +1) {
					System.out.println(i);
					Thread.sleep(1000);;
				}
			}
			catch(Exception e) { }
	}
}
