package method;

import java.util.Scanner;

//���� Ŭ���� - main �޼ҵ带 ������ Ŭ����
public class Main {

	public static void main(String[] args) {
		// Member Ŭ������ �ν��Ͻ��� ����
		Member member1 = new Member();
		Scanner sc = new Scanner(System.in);//��½�ĳ��1�ܰ�
		// �ν��Ͻ� ������ ȣ���ؼ� ������ ����
		System.out.println("�̸���:");
		String email = sc.nextLine();//��½�ĳ��2�ܰ�
		member1.setEmail("raccoongury@gmail.com");// member1.email="raccoongury@gmail.com";
		
		System.out.println("��й�ȣ:");
		String password = sc.nextLine();
		member1.setPassword("1234");

		System.out.println("����:");
		String nickname = sc.nextLine();
		member1.setNickname("���Ѹ��ʱ���");
		
		System.out.println("����:");
		int age = sc.nextInt();//��½�ĳ��2-���̴� �����̹Ƿ�int nextInt
		member1.setAge(15);
		sc.close();

		member1.display(); // �Ʒ��� �ٸ��� memberŬ������ �����ϰ� �ҷ��ö�
		/*
		 * System.out.println("�̸���:" + member1.email + "\t" + "��й�ȣ:" member1.password +
		 * "\t" + "�г���:" + member1.nickname + "\t" + "����:" + member1.age);
		 */

		//1 member1.diplay(); ���÷��� ��ĸ��� tostroing���� �ҷ�����
		System.out.println(member1);
		
		System.out.println(Member.sum(10,30));
		System.out.println(Member.sum(10,20,30));
		System.out.println(Member.sum(10));
		//0
		long m = Math.max(100, 200);
		System.out.println(m);
}

}
