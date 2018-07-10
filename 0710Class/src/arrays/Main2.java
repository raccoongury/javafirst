package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// �ν��Ͻ� �迭 ����� - 5�� ������ �� �ִ� �迭�� ����
				// ������ ��� null
		Book[] books = new Book[5];
		// �ν��Ͻ� ����
		books[0] = new Book();
		// ���� ä��ϴ�.
		books[0].setTitle("�ﱹ��");
		books[0].setAuthor("������");
		books[0].setPubdate("2017-08-11");
		books[0].setPrice(30000);

		// �ν��Ͻ� ����
		books[1] = new Book();
		// ���� ä��ϴ�.
		books[1].setTitle("���");
		books[1].setAuthor("�縶��");
		books[1].setPubdate("345-04-20");
		books[1].setPrice(90000);

		// �ν��Ͻ� ����
		books[2] = new Book();
		// ���� ä��ϴ�.
		books[2].setTitle("�ﱹ���");
		books[2].setAuthor("��ν�");
		books[2].setPubdate("789-02-15");
		books[2].setPrice(60000);

		// �ν��Ͻ� ����
		books[3] = new Book();
		// ���� ä��ϴ�.
		books[3].setTitle("19ȣ�Ƿ� ����");
		books[3].setAuthor("ȣ�ڸ���");
		books[3].setPubdate("2015-09-19");
		books[3].setPrice(20000);

		// �ν��Ͻ� ����
		books[4] = new Book();
		// ���� ä��ϴ�.
		books[4].setTitle("���� ����� ���� �ߴ�");
		books[4].setAuthor("�����");
		books[4].setPubdate("2017-06-25");
		books[4].setPrice(20000);

		// �迭�� �����͸� ����
		// �⺻������ ������ �Ϸ��� �� �������� ũ�⸦ ���� �� �־�� �մϴ�.
		//java���� ũ�� �񱳸� �ϴ� �޼ҵ��
		//Comparable �������̽��� compare �޼ҵ� �Դϴ�.
		//���� �ݵ� Ŭ������ ���� Ŭ������ comparable �������̽���
		//implements �ϴ��� Comparator �������̽��� implements��
		//�ν��Ͻ��� ���� �����ؾ� �մϴ�.
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			//���� Comparator ���� ����
			Comparator <Book> comparator = null;
			System.out.print("0:���� 1:����������� 2.���񳻸�����:");
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
						return book1.getTitle().compareTo(book2.getTitle());//��������
					}
					
				};
			}
			else if(menu == 2) {
				comparator = new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						Book book1 = (Book)o1;
						Book book2 = (Book)o2;
						return book2.getTitle().compareTo(book1.getTitle());//��������
					}
					
				};
			}
			Arrays.sort(books, comparator);
		//Comparator �������̽��� implements �� �ν��Ͻ� �����
		
//		Comparator comparator = new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				Book first = (Book)o1;
//				Book second = (Book)o2;
//				//title�� �̿��ؼ� ��
//				return first.getTitle().compareTo(second.getTitle());
//			}
//		};
//			Arrays.sort(books, comparator);
			
			//================
			
//				Comparator <Book> comp = new Comparator() {
//					@Override
//					public int compare(Object o1, Object o2) {
//						//������ �� ��ȯ
//						Book first = (Book)o1;
//						Book second = (Book)o2;
//						return first.getPrice() - second.getPrice();
//					}
//				};
//				Arrays.sort(books, comp);
				
			//�迭�� ������ ���� ���
			for(Book book : books) {
				System.out.println(book);
			}
			System.out.println("=====================");
		}
		sc.close();
	}
}




