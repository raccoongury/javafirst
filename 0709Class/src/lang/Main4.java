package lang;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// 1-45 ���� �ߺ����� �ʴ� 6���� ���� ����

		// �����͸� ������ �迭 ����
		int lotto[] = new int[6];

		// �迭�� ������ ������ ������ ����
		int size = lotto.length;
		// �ε��� ����
		int i, j;

		// �����͸� �Է¹��� ��ĳ�� ��ü ����
		Scanner sc = new Scanner(System.in);

		for (i = 0; i < size; i = i + 1) {
			try {
				System.out.println("1~45 ������ ���� �Է�");// ���ڸ� �ָ� ƨ�ܹ����� ���ܱ����Է�
				String temp = sc.nextLine();
				lotto[i] = Integer.parseInt(temp);
				if (!(lotto[i] >= 1 && lotto[i] <= 45)) { // lotto[i] <1||lotto[i]>45
					System.out.println("1-45������ ���ڸ� �Է��ϼ���!!!!!");
					i = i - 1;

				}
				// ������ �Էµ� ����� �� - �ߺ� �˻�
				for (j = 0; j <= i - 1; j = j + 1) {
					if (lotto[i] == lotto[j]) {
						break;
					}
				}
				// ���� �����Ϳ� ��� �Է¹��� �����Ͱ� �����ϸ�
				if (j != i) {
					System.out.println("������ �����ʹ� �ȵ˴ϴ�");
					i = i - 1;
					continue;
				}
			} catch (Exception e) {
				System.out.println("������ �Է��ϼ���");
				// �̷� ��� ��ȿ�� ��Ű�� ���ؼ�
				i = i - 1;
			}
		}
	}
}
