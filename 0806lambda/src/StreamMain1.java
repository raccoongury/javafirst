import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		//���ڿ� �迭�� ����
		String [] ar = {"���̸�", "�����", "���¿�"};
		
		//���ڿ� ����Ʈ�� ����
		List<String> person = new ArrayList<String>();
		person.add("������");
		person.add("ȫ����");
		person.add("�����");
		person.add("������");
		
		//���ڿ� �迭�� ������ ��Ʈ�� �����
		Stream<String> stream = Arrays.stream(ar);
		//�۾� ����
		stream.forEach(name -> {System.out.println(name);});
		System.out.println("======================");
		//List�� ������ ��Ʈ�� �����
		stream = person.stream();
		stream.forEach(name -> {System.out.println(name);});

	}

}




