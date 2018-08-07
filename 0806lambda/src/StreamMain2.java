import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain2 {

	public static void main(String[] args) {
		String [] ar = 
			{"������", "�����", "������", "���߱�", "��äȣ",
				"��âȣ", "ȫ����", "������", "�̺�â", "�ȱ�"};
		//��Ʈ�� ��ȯ
		Stream<String> stream = Arrays.stream(ar);
		//��� ������ ���
		//stream.forEach(name -> {System.out.println(name);});
		
		//�ߺ� ����
		/*
		stream.distinct().skip(2).limit(3).forEach(
			name -> {System.out.println(name);});
		*/
		
		//������ �����ϴ� �����͸� ã�Ƽ� ���
		//return ���� �ϳ� �ۿ� ���� ���� return �̶�� �ܾ ��������
		//����Ǵ� �ڵ尡 �� �� �� ���� {} ���� ����
		/*
		stream.filter(name->name.startsWith("��"))
			.forEach(name -> System.out.println(name));
		*/
		stream.filter(name->name.length() != 3)
		.forEach(name -> System.out.println(name));
	}
}



