package interfacetest;

import java.util.Scanner;

public class Main {
	String msg = new String();
	public static void main(String[] args) {
		//�������̽��ε� ������ ���� �� �ְ� 
		//�������̽��� ���� ������ �ڽ��� implements �� Ŭ������ 
		//�ν��Ͻ��� �ּҸ� ������ �� �ֽ��ϴ�.
		MemberService memberService = 
				new MemberServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է��ϼ���:");
		String id = sc.nextLine();
		boolean r = memberService.idCheck(id);
		if(r == true) {
			System.out.println("��� ������ ���̵� �Դϴ�.");
		}
		else {
			System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
		}
		
		System.out.print("�α��� �� ���̵� �Է��ϼ���:");
		id = sc.nextLine();
		System.out.print("��й�ȣ�� �Է��ϼ���:");
		String password = sc.nextLine();
		int result = memberService.login(id, password);
		if(result == 0) {
			System.out.println("�α��� ����");
		}else if(result == 1) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else if(result == 2) {
			System.out.println("���� ���̵� �Դϴ�.");
		}
		
		
		sc.close();
	}

}
