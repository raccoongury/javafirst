package innerclass;

public class Main {

	public static void main(String[] args) {
			ThreadEx obj = new ThreadEx();
			obj.start();
			
			//Thread Ŭ������ Anonymous �����
			Thread th = new Thread() {
				public void run() {
				try {
					for (int i=0;  i<20; i=i+1) {
						System.out.println(i);
						Thread.sleep(1000);
					}
				}
				catch(Exception e) {}
				}
			};
			th.start();
	}

}
