package thread;

//Runnable �������̽��� ������ Ŭ����
public class ThreadEx3 implements Runnable {

	@Override
	public void run() {
		String msg = "�ް����͵�";
		//1�ʸ��� ���ѹݺ�
		int idx = 0;
		while(true) {
			String str = "";
			for(int i=0; i<msg.length(); i=i+1) {
				char ch = msg.charAt((idx+i)%msg.length());
				str = str + ch;
			}
			System.out.println(str);
			
			try {
				Thread.sleep(1000);
				idx = idx + 1;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}



