import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		List<StudentVO> list = dao.fetch();
		/*
		System.out.println(list);
		for(StudentVO vo : list) {
			//����ϴ� �޼ҵ忡 �ν��Ͻ� �̸��� �����ϸ� toString�� ���
			System.out.println(vo);
		}
		*/
		
		//Stream ����
		Stream<StudentVO> stream = list.stream();
		//�����͸� ���� ���
		//stream.skip(2).limit(3).forEach(data -> System.out.println(date));
		
		//������ �����͸� ���
		/*
		stream.filter(data -> data.getGender().equals("����"))
		.forEach(data -> System.out.println(data));
		*/
		
		//������ �����ϱ� - score������
		/*
		stream.sorted((d1,d2) -> d2.getScore() - d1.getScore())
		//�̸����� ������ d2.getName.compareTo(d1.getName())
		.forEach(data -> System.out.println(data));
		*/
		
		/*
		long cnt = stream.count();
		System.out.println(cnt);
		*/
		
		//Optiional�� ���ϵǴ� �����ʹ� �� �� �� ������ �ؾ� �մϴ�.
		/*
		Optional<StudentVO> vo =  stream.findFirst();
		System.out.println(vo);
		*/
		//score�� �հ� ���ϱ�
		//���� �����Ͱ� �ƴϸ� �ٷ� �հ踦 ���� �� ���� ������
		//map �޼ҵ带 �̿��ؼ� ���� �����ͷ� ������ �� �հ踦 ���ؾ� �մϴ�.
		//int sum = stream.mapToInt(StudentVO::getScore).sum();
		//System.out.println("�հ�:" + sum);
		
		//age�� ��� ���ϱ�
		/*
		double age = stream.mapToInt(StudentVO::getAge).average().getAsDouble();
		System.out.println("���� ���:"+ age);
		*/
		
		//������ ������ �������� ��� ������ ���ϴµ� �Ҽ� 1° �ڸ����� �ݿø��ؼ�
		//���� �κи� ���
		
		/*
		double avg = stream.filter(data -> data.getGender().equals("����"))
				.mapToInt(StudentVO::getScore)
				.average()
				.getAsDouble();
		int score = (int)(avg + 0.5);
		System.out.println("���� ��� ����:" + score);
		*/
		
		//������ ������ �����͸� ������ List�� ����
		/*
		List<StudentVO> list = stream.
				filter(data -> data.getGender().equals("����")).collect(Collectors.toList());
		for(StudentVO vo : result) { System.out.println(vo);}
		*/
		
		//������ �����̰� score�� 90 �̻��� �������� List�� �����ؼ� ���
		/*		
		List<StudentVO> result = stream
					.filter(data -> data.getGender().equals("����")
							&& data.getScore() >= 90)
					.collect(Collectors.toList());
				for(StudentVO vo : result) {
					System.out.println(vo);
				}
				*/
		
		//groupingBy�� �ۼ��� �Լ��� ����� key�� �ϰ�
		//���� �������� List�� ������ �ؼ� Map���� �����մϴ�.
		/*
		Map<String, List<StudentVO>> map =
		stream.collect(Collectors.groupingBy(
				StudentVO::getGender));
		System.out.println(map);
		*/
		
		/*
		Map<String, Integer> map = 
				stream.collect(Collectors.groupingBy(
							StudentVO::getGender,
							Collectors.summingInt(
									StudentVO::getScore)));
					System.out.println(map);
					*/
		
		//gender ���� score�� �հ踦 ������ ���
		Map<String, Integer> map = stream.collect(Collectors.groupingBy(
				StudentVO::getGender, Collectors.summingInt(StudentVO::getScore)));;
				
				//System.out.println(map);
				
				//Map�� ������ ���� ����ϱ�
				Set<String> keySet = map.keySet();
				for(String key : keySet) {
					System.out.println(key + ":" + map.get(key));
				}
		}

	}

