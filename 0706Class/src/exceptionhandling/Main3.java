package exceptionhandling;

public class Main3 {

	public static void main(String[] args) {
		//java.lang.Thread 라는 클래스에는 sleep 이라는 메소드가 있는데
		//이 메소드는 매개변수로 대입된 시간만큼 실행을 중지 시키는 역할을 합니다.
		//이 메소드를 이용해서 1-10까지를 1초씩 쉬면서 출력
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
		//image0.png, image1.png, image2.png 순서대로 반복
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
		//김기태, 이종범, 최향남, 이대진을 반복(연관성 없는걸 연관성 있게 만들어주는 배열)
		String [] ar = {"김기태", "이종범", "최향남", "이대진"};
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

