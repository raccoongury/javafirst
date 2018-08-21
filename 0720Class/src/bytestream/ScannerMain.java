package bytestream;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		// 키보드로 부터 입력받는 Scanner 인스턴스 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수:");
		int x = sc.nextInt();
		System.out.println(x);
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.println(name);
		
		
	}

}
