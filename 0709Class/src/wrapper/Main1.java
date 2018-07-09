package wrapper;

import java.io.IOException;

public class Main1 {

	public static void main(String[] args) {
		//HelloWorld 100만번 출력하는 시간 측정하기
		long start = System.currentTimeMillis();
		
		for (int i =0; i<100; i=i+1) {
			System.out.println("Hellow World");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("작업시간:" + (end-start));
		
		//환경변수 확인
		System.out.println(System.getenv("path"));
		//시스템 속성 확인
		System.out.println(System.getProperty("java.version"));
		
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("C:\\Program Files (x86)\\Hnc\\Hwp80\\Hwp.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
