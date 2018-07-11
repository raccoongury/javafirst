package datastructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ListMain3 {

	public static void main(String[] args) {
		// ���� List �� ���ڿ� List�� ����
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(40);
		list1.add(30);
		list1.add(35);

		Comparator<Integer> comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Integer first = (Integer)o1;
				Integer second = (Integer)o2;
				return first - second;
			}
		};
		list1.sort(comp);
		//List�� toString ������ �Ǿ� �־ �ν��Ͻ� ����ϸ�
		//�����Ͱ� ������� toString�� ȣ���մϴ�.
		System.out.println(list1);
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("���Ͻ� ��ġ��");
		list2.add("���ӽ� ����");
		list2.add("������ �����");

		Comparator<String> comp1 = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
					String first = (String)o1;
					String second = (String)o2;
				return second.compareTo(first);
				
			}
		};
		list2.sort(comp1);
		System.out.println(list2);
	}

}
