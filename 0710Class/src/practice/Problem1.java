package practice;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		//���� ���� �ݾ��� �Է¹޾Ƽ� �������� ����¥�� �� �� �����ؾ� �ϴ���
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		
		int o = money / 50000;
		int m = money % 50000/ 10000;
		
		System.out.printf("������:%d�� ����:%��\n", o, m);

	}

}
