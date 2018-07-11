package datastructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ListMain3 {

	public static void main(String[] args) {
		// 정수 List 와 문자열 List의 정렬
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
		//List는 toString 재정의 되어 있어서 인스턴스 출력하면
		//데이터가 순서대로 toString을 호출합니다.
		System.out.println(list1);
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("데니스 리치히");
		list2.add("제임스 고슬링");
		list2.add("리누스 토발즈");

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
