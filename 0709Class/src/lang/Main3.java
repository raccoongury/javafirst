package lang;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		int x = -1;
		Scanner sc = new Scanner(System.in);
		
		while ( true) {
			System.out.println("���� �Է�:");
			String temp = sc.nextLine();
			try {
			x=Integer.parseInt(temp);
			break;
			}
		catch(Exception e) {
			System.out.println("������ �Է��ϼ���");
		}
		System.out.println(x);
		sc.close( );
		}
	}
}
	
