package lang;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
			//value �� ���� ����
		int n = 10;
			//value ���� �����͸� ����
		int x = n;
		
		x = 20;
		
		System.out.println(n);
		
		//������ �������� ���� - �ּҰ� ����
		int [ ] ar = { 10, 29, 30 };
		//10, 20, 30�� ����� ���� �ּҸ� ����
		int [ ] br = ar;
		//����� �ּ��� ù��° �����͸� 1000���� ����
		br [ 0 ] = 1000;
		System.out.println(ar[0]);
		
		//�������� ������ �� �� ���� �����͸� �������ֱ�
		//�迭�� �����ϱ� ���ؼ� ���ο� ������ ����
		int [ ] cr = new int [ ar.length ];
		//���� �����͸� ����
		for ( int i = 0; i < ar.length; i = i +1) {
			cr[i] = ar[i];
			
		}
		
	cr[0] = 500;
	//�̹����� �����͸� �����ؼ� �־��� ������ ������ ���� �ʽ��ϴ�.
	System.out.println(ar[0]);

	}

}
