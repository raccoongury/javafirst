package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		// ���ڿ��� ������ �� �ִ� ArrayList ����
		LinkedList<String> arrayList = new LinkedList<>();
		// �����͸� ����
		arrayList.add("���̸�");
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		// ������ ����
		System.out.println("������ ����:" + arrayList.size());
		// ��ü ������ ���
		for (String temp : arrayList) {
			System.out.println(temp);
		}
		// 3��° ������ ����ϱ�
		System.out.println("==========================");
		System.out.println(arrayList.get(2));

	}

}
