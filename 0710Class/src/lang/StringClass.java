package lang;

import java.util.ArrayList;
import java.util.HashMap;

public class StringClass {
	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		// x:200 y:100 ������ ���ڿ� �����
		String str = String.format("x:%d y:%d", x, y);
		System.out.println(str);

		String msg = "I like Java";
		// ���� ���ڿ����� java ���Կ��� Ȯ�� - ��ҹ��� ���о���
		int idx = msg.toLowerCase().indexOf("java".toLowerCase());
		if (idx >= 0) {
			System.out.println("java�� �����մϴ�.");
		} else {
			System.out.println("java�� �������� �ʽ��ϴ�.");
		}

		// msg�� ���ڿ��� ������ �������� �����ؼ� �ϳ��� ����ϱ�
		String[] ar = msg.split(" ");
		for (int i = 0; i < ar.length; i = i + 1) {
			System.out.println(ar[i]);
		}
		// msg�� 3��° ���� 7��° ���ڱ��� ����ϱ�

		String sub = msg.substring(3, 8);
		System.out.println(sub);

		ArrayList<Integer> a1 = new ArrayList<>();
		HashMap<String, String> hm = new HashMap<>();

	}
}