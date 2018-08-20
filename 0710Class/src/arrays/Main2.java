package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// 인스턴스 배열 만들기 - 5개 저장할 수 있는 배열을 생성
				// 아직은 모두 null
		Book[] books = new Book[5];
		// 인스턴스 생성
		books[0] = new Book();
		// 값을 채웁니다.
		books[0].setTitle("삼국지");
		books[0].setAuthor("나관중");
		books[0].setPubdate("2017-08-11");
		books[0].setPrice(30000);

		// 인스턴스 생성
		books[1] = new Book();
		// 값을 채웁니다.
		books[1].setTitle("사기");
		books[1].setAuthor("사마의");
		books[1].setPubdate("345-04-20");
		books[1].setPrice(90000);

		// 인스턴스 생성
		books[2] = new Book();
		// 값을 채웁니다.
		books[2].setTitle("삼국사기");
		books[2].setAuthor("김부식");
		books[2].setPubdate("789-02-15");
		books[2].setPrice(60000);

		// 인스턴스 생성
		books[3] = new Book();
		// 값을 채웁니다.
		books[3].setTitle("19호실로 가다");
		books[3].setAuthor("호텔리어");
		books[3].setPubdate("2015-09-19");
		books[3].setPrice(20000);

		// 인스턴스 생성
		books[4] = new Book();
		// 값을 채웁니다.
		books[4].setTitle("나는 나대로 살기로 했다");
		books[4].setAuthor("나살기");
		books[4].setPubdate("2017-06-25");
		books[4].setPrice(20000);

		// 배열의 데이터를 정렬
		// 기본적으로 정렬을 하려면 각 데이터의 크기를 비교할 수 있어야 합니다.
		//java에서 크기 비교를 하는 메소드는
		//Comparable 인터페이스의 compare 메소드 입니다.
		//직접 반든 클래스의 경우는 클래스에 comparable 인터페이스를
		//implements 하던가 Comparator 인터페이스를 implements한
		//인스턴스를 같이 대입해야 합니다.
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			//비교할 Comparator 변수 선언
			Comparator <Book> comparator = null;
			System.out.print("0:종료 1:제목오름차순 2.제목내림차순:");
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			else if(menu == 1) {
				comparator = new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						Book book1 = (Book)o1;
						Book book2 = (Book)o2;
						return book1.getTitle().compareTo(book2.getTitle());//오름차순
					}
					
				};
			}
			else if(menu == 2) {
				comparator = new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						Book book1 = (Book)o1;
						Book book2 = (Book)o2;
						return book2.getTitle().compareTo(book1.getTitle());//내림차순
					}
					
				};
			}
			Arrays.sort(books, comparator);
		//Comparator 인터페이스를 implements 한 인스턴스 만들기
		
//		Comparator comparator = new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				Book first = (Book)o1;
//				Book second = (Book)o2;
//				//title을 이용해서 비교
//				return first.getTitle().compareTo(second.getTitle());
//			}
//		};
//			Arrays.sort(books, comparator);
			
			//================
			
//				Comparator <Book> comp = new Comparator() {
//					@Override
//					public int compare(Object o1, Object o2) {
//						//데이터 형 변환
//						Book first = (Book)o1;
//						Book second = (Book)o2;
//						return first.getPrice() - second.getPrice();
//					}
//				};
//				Arrays.sort(books, comp);
				
			//배열의 데이터 전부 출력
			for(Book book : books) {
				System.out.println(book);
			}
			System.out.println("=====================");
		}
		sc.close();
	}
}




