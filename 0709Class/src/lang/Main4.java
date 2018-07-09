package lang;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// 1-45 까지 중복되지 않는 6개의 정수 저장

		// 데이터를 저장할 배열 생성
		int lotto[] = new int[6];

		// 배열의 데이터 개수를 저장할 변수
		int size = lotto.length;
		// 인덱스 변수
		int i, j;

		// 데이터를 입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);

		for (i = 0; i < size; i = i + 1) {
			try {
				System.out.println("1~45 사이의 정수 입력");// 문자를 주명 튕겨버리니 예외구문입력
				String temp = sc.nextLine();
				lotto[i] = Integer.parseInt(temp);
				if (!(lotto[i] >= 1 && lotto[i] <= 45)) { // lotto[i] <1||lotto[i]>45
					System.out.println("1-45사이의 숫자를 입력하세요!!!!!");
					i = i - 1;

				}
				// 이전에 입력된 값들과 비교 - 중복 검사
				for (j = 0; j <= i - 1; j = j + 1) {
					if (lotto[i] == lotto[j]) {
						break;
					}
				}
				// 이전 데이터와 방금 입력받은 데이터가 동일하면
				if (j != i) {
					System.out.println("동일한 데이터는 안됩니다");
					i = i - 1;
					continue;
				}
			} catch (Exception e) {
				System.out.println("정수를 입력하세요");
				// 이런 경우 무효를 시키기 위해서
				i = i - 1;
			}
		}
	}
}
