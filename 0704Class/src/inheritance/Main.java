package inheritance;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		//��ü�� ������ Ȯ���ϰ��� �ϸ� System.out.println �޼ҵ忡
		//��ü�� �̸��� ����
		System.out.println(emp1);
		
		Employee emp2 = new Employee();
		System.out.println(emp2);
		
		Manager man1 = new Manager();
		System.out.println(man1);
	}

}
