package thread;

public class ThreadEx1 extends Thread {
	//스레드로 동작할 메소드
	public void run() {
		//1초마다 Thread라는 글자를 10번 출력
		/*
		for(int i = 0; i<10; i=i+1) {
			
		}
		*/
		int i = 0;
		while(i<10) {
			System.out.println("Thread");
			//1초씩 대기
			//Thread 클래스의 static 메소드인
			//sleep(시간)을 이용
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
				//스레드를 강제 종료 할 수 있도록
				//예외가 발생하면 run 메소드 종료
				return;
			}
			
			i = i + 1;
		}
	}
}







