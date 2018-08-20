package lang;

import java.util.ArrayList;
import java.util.HashMap;

public class StringClass {
	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		// x:200 y:100 형식의 문자열 만들기
		String str = String.format("x:%d y:%d", x, y);
		System.out.println(str);

		String msg = "I like Java";
		// 위의 문자열에서 java 포함여부 확인 - 대소문자 구분없이
		int idx = msg.toLowerCase().indexOf("java".toLowerCase());
		if (idx >= 0) {
			System.out.println("java가 존재합니다.");
		} else {
			System.out.println("java가 존재하지 않습니다.");
		}

		// msg의 문자열을 공백을 기준으로 분할해서 하나씩 출력하기
		String[] ar = msg.split(" ");
		for (int i = 0; i < ar.length; i = i + 1) {
			System.out.println(ar[i]);
		}
		// msg의 3번째 부터 7번째 글자까지 출력하기

		String sub = msg.substring(3, 8);
		System.out.println(sub);

		ArrayList<Integer> a1 = new ArrayList<>();
		HashMap<String, String> hm = new HashMap<>();

	}
}