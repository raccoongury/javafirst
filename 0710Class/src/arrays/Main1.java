package arrays;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		//���ڿ� �迭 ����
		String [ ] subject = {"Java", "Oracle", "Web Front End", "Web Back End - Java","Android", "iOS"
		};
		//subject ����
		Arrays.sort(subject);
		//�迭�� ������ ���� ���
		/*
		for(int i = 0; i<subject.length; i=i+1) {
			System.out.println(subject[i]);
		}
		*/
		for(String temp : subject) {
			System.out.println(temp);
		}
		
		//Oracle�� ��ġ �˻�
		int idx = Arrays.binarySearch(subject, "Oracle");
		System.out.println(idx);
		//Android�� ��ġ �˻�
		idx = Arrays.binarySearch(subject, "Android");
		System.out.println(idx);
	}

}
