package wrapper;

import java.io.IOException;

public class Main1 {

	public static void main(String[] args) {
		//HelloWorld 100���� ����ϴ� �ð� �����ϱ�
		long start = System.currentTimeMillis();
		
		for (int i =0; i<100; i=i+1) {
			System.out.println("Hellow World");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("�۾��ð�:" + (end-start));
		
		//ȯ�溯�� Ȯ��
		System.out.println(System.getenv("path"));
		//�ý��� �Ӽ� Ȯ��
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
