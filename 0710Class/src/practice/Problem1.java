package practice;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		//만원 단위 금액을 입력받아서 오만원과 만원짜리 몇 장 지급해야 하는지
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		
		int o = money / 50000;
		int m = money % 50000/ 10000;
		
		System.out.printf("오만원:%d장 만원:%장\n", o, m);

	}

}
