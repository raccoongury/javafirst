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
			//출력하는 메소드에 인스턴스 이름을 대입하면 toString의 결과
			System.out.println(vo);
		}
		*/
		
		//Stream 생성
		Stream<StudentVO> stream = list.stream();
		//데이터를 전부 출력
		//stream.skip(2).limit(3).forEach(data -> System.out.println(date));
		
		//남자인 데이터만 출력
		/*
		stream.filter(data -> data.getGender().equals("남자"))
		.forEach(data -> System.out.println(data));
		*/
		
		//데이터 정렬하기 - score순으로
		/*
		stream.sorted((d1,d2) -> d2.getScore() - d1.getScore())
		//이름같은 형식은 d2.getName.compareTo(d1.getName())
		.forEach(data -> System.out.println(data));
		*/
		
		/*
		long cnt = stream.count();
		System.out.println(cnt);
		*/
		
		//Optiional로 리턴되는 데이터는 한 번 더 가공을 해야 합니다.
		/*
		Optional<StudentVO> vo =  stream.findFirst();
		System.out.println(vo);
		*/
		//score의 합계 구하기
		//숫자 데이터가 아니면 바로 합계를 구할 수 없기 때문에
		//map 메소드를 이용해서 숫자 데이터로 변경한 후 합계를 구해야 합니다.
		//int sum = stream.mapToInt(StudentVO::getScore).sum();
		//System.out.println("합계:" + sum);
		
		//age의 평균 구하기
		/*
		double age = stream.mapToInt(StudentVO::getAge).average().getAsDouble();
		System.out.println("나이 평균:"+ age);
		*/
		
		//성별이 남자인 데이터의 평균 점수를 구하는데 소수 1째 자리에서 반올림해서
		//정수 부분만 출력
		
		/*
		double avg = stream.filter(data -> data.getGender().equals("남자"))
				.mapToInt(StudentVO::getScore)
				.average()
				.getAsDouble();
		int score = (int)(avg + 0.5);
		System.out.println("남자 평균 점수:" + score);
		*/
		
		//성별이 여자인 데이터만 가지고 List를 생성
		/*
		List<StudentVO> list = stream.
				filter(data -> data.getGender().equals("여자")).collect(Collectors.toList());
		for(StudentVO vo : result) { System.out.println(vo);}
		*/
		
		//성별이 남자이고 score가 90 이상인 데이터의 List를 생성해서 출력
		/*		
		List<StudentVO> result = stream
					.filter(data -> data.getGender().equals("남자")
							&& data.getScore() >= 90)
					.collect(Collectors.toList());
				for(StudentVO vo : result) {
					System.out.println(vo);
				}
				*/
		
		//groupingBy에 작성한 함수의 결과를 key로 하고
		//원래 데이터의 List를 값으로 해서 Map으로 리턴합니다.
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
		
		//gender 별로 score의 합계를 정수로 출력
		Map<String, Integer> map = stream.collect(Collectors.groupingBy(
				StudentVO::getGender, Collectors.summingInt(StudentVO::getScore)));;
				
				//System.out.println(map);
				
				//Map의 데이터 전부 출력하기
				Set<String> keySet = map.keySet();
				for(String key : keySet) {
					System.out.println(key + ":" + map.get(key));
				}
		}

	}

