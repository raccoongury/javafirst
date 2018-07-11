package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		// 문자열을 저장할 수 있는 ArrayList 생성
		LinkedList<String> arrayList = new LinkedList<>();
		// 데이터를 삽입
		arrayList.add("아이린");
		arrayList.add("나라");
		arrayList.add("설현");
		arrayList.add("수지");
		arrayList.add("유리");
		// 데이터 개수
		System.out.println("데이터 개수:" + arrayList.size());
		// 전체 데이터 출력
		for (String temp : arrayList) {
			System.out.println(temp);
		}
		// 3번째 데이터 출력하기
		System.out.println("==========================");
		System.out.println(arrayList.get(2));

	}

}
