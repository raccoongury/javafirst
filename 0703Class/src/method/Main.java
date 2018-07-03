package method;

import java.util.Scanner;

//실행 클래스 - main 메소드를 소유한 클래스
public class Main {

	public static void main(String[] args) {
		// Member 클래스의 인스턴스를 생성
		Member member1 = new Member();
		Scanner sc = new Scanner(System.in);//출력스캐너1단계
		// 인스턴스 변수를 호출해서 데이터 저장
		System.out.println("이메일:");
		String email = sc.nextLine();//출력스캐너2단계
		member1.setEmail("raccoongury@gmail.com");// member1.email="raccoongury@gmail.com";
		
		System.out.println("비밀번호:");
		String password = sc.nextLine();
		member1.setPassword("1234");

		System.out.println("별명:");
		String nickname = sc.nextLine();
		member1.setNickname("순한맛너구리");
		
		System.out.println("나이:");
		int age = sc.nextInt();//출력스캐너2-나이는 정수이므로int nextInt
		member1.setAge(15);
		sc.close();

		member1.display(); // 아래와 다르게 member클래스에 저장하고 불러올때
		/*
		 * System.out.println("이메일:" + member1.email + "\t" + "비밀번호:" member1.password +
		 * "\t" + "닉네임:" + member1.nickname + "\t" + "나이:" + member1.age);
		 */

		//1 member1.diplay(); 디스플레이 방식말고 tostroing으로 불러오기
		System.out.println(member1);
		
		System.out.println(Member.sum(10,30));
		System.out.println(Member.sum(10,20,30));
		System.out.println(Member.sum(10));
		//0
		long m = Math.max(100, 200);
		System.out.println(m);
}

}
