import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain3 {

	public static void main(String[] args) {
		//Student Ŭ������ �ν��Ͻ��� �迭
		Student [] ar = new Student[5];
		ar[0] = 
			new Student("��������", "����", 98, 24, "��ǻ�Ͱ��а�");
		ar[1] = 
			new Student("������", "����", 75, 30, "�����а�");
		ar[2] = 
			new Student("������", "����", 99, 28, "��ǻ�Ͱ��а�");
		ar[3] = 
			new Student("�ּ���", "����", 100, 29, "��ǻ�Ͱ��а�");	
		ar[4] = 
			new Student("���缺", "����", 45, 38, "ü���а�");
		
		//������ ������ �����͸� ���
		/*
		Stream<Student> stream = Arrays.stream(ar);
		stream.filter(student -> student.getGender().equals("����"))
		.forEach(student -> System.out.println(student));
		*/
		//������ �����̰� ���̰� 30�̻��� ������
		/*
		Stream<Student> stream = Arrays.stream(ar);
		stream.filter(
				student -> student.getGender().equals("����")
				&& student.getAge() >= 30)
		.forEach(student -> System.out.println(student));
		*/
		
		//Student�� score�� ����
		/*
		Stream<Student> stream = Arrays.stream(ar);
		stream.mapToInt(Student::getScore)
		.forEach(student -> System.out.println(student));
		*/
		
		/*
		int [] array = {30, 20, 31, 78, 12};
		IntStream stream = Arrays.stream(array);
		stream.sorted().forEach(su -> System.out.println(su));
		
		String [] insa = {
				"Morning", "Afternoon", "Evening", "Night"
		};
		//���ڿ� �迭�� �����ؼ� ���
		Stream<String> s = Arrays.stream(insa);
		//s.sorted().forEach(su -> System.out.println(su));
		s.sorted((n1, n2)->n2.compareTo(n1)).forEach(su -> System.out.println(su));
		*/
		
		Stream<Student> stream = Arrays.stream(ar);
		stream.sorted((n1, n2)->n2.getAge()-n1.getAge())
		.forEach(student -> System.out.println(student));
		
		
		
		
		
		
		
		
		
			
		
	}

}
