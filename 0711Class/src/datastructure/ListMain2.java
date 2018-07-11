package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain2 {

	public static void main(String[] args) {
		//������ �����ϴ� ArrayList�� LinkedList�� �����
		//�߰��� ������ 10������ �����ϴµ� �ɸ��� �ð��� ����
		ArrayList<Integer>al = new ArrayList<>();
		LinkedList<Integer>li = new LinkedList<>();
		
		al.add(1);
		al.add(3);
		al.add(4);
		
		li.add(1);
		li.add(3);
		li.add(4);

		//al�� 10������ �߰��� �ְ� �ð� ����
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i=i+1) {
			//1��° �ڸ��� 2�� �߰�
			al.add(1, 2);
		}
		long end = System.currentTimeMillis();
		System.out.println("al:" + (end-start));
		
		//li�� 10������ �߰��� �����ϰ� �ð� ����
		 start = System.currentTimeMillis();
		for(int i=0; i<100000; i=i+1) {
			//1��° �ڸ��� 2�� �߰�
			li.add(1, 2);
		}
		end = System.currentTimeMillis();
		System.out.println("li:" + (end-start));
		
		//�д� �ð�
		 start = System.currentTimeMillis();
			for(int i=0; i<100000; i=i+1) {
				//1��° �ڸ��� 2�� �߰�
				al.get(i);
			}
			end = System.currentTimeMillis();
			System.out.println("al:" + (end-start));
		
		 start = System.currentTimeMillis();
			for(int i=0; i<100000; i=i+1) {
				//1��° �ڸ��� 2�� �߰�
				li.get(i);
			}
			end = System.currentTimeMillis();
			System.out.println("li:" + (end-start));
		
		
	}
}
