package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class Logfileread {

	public static void main(String[] args) {
		// 1.번째 access -log.txt 파일을 읽을 수 있는 Stream을 생성
		// BufferedReader 객체 만들기
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new FileReader("C:\\Users\\503-17\\Documents\\이정원\\access_log.txt"));
			//4. HashMap을 이용해서 접속한 Ip별 횟수를 출력
			HashMap<String, Integer> map = new HashMap<>();
			
			//5.HashMap을 이용해서 접속할 IP 별 트래픽 합계 출력
			HashMap<String, Integer> traffic = 
				new HashMap<>();
			
			//2.번째줄단위로 데이터를 읽어서 출력
			while(true) { //줄단위를 만들려면 문한반복문으로
				String line = br.readLine();		//한 줄을 읽기
				//읽은 데이터가 없으면 종료
				if(line == null) {
					break;
				}
				//System.out.println(line); //줄단위로 출력 확인 테스트
				//3-1.줄 단위로 읽은 데이터를 공백으로 분할해서 첫번째에 있는 데이터만 출력
				String [] ar= line.split(" ");
				//3-2.System.out.println(ar[0]);
				//4-2. ip로 저장된 데이터를 가져옵니다
				Integer count = map.get(ar[0]);
				//4-3.저장된 데이터가 없으면 1을 저장합니다.
				if(count == null) {
					map.put(ar[0], 1);
				}
				//4-4.저장된 데이터가 있으면 1을 더해서 저장합니다.
				else {
					map.put(ar[0], count + 1);
				}
				//5-1.트레픽을 가지고와서  이거나 이게 아닌경우에 만 정수로 바꿈
				Integer traf = traffic.get(ar[0]);
				if(traf == null) {
					if(!ar[9].equals("\"-\"")) {
						traffic.put(ar[0],
							Integer.parseInt(ar[9]));
					}
				}else {
					if(!ar[9].equals("-")) {
						traffic.put(ar[0], 
							traf + Integer.parseInt(ar[9]));
					}
				}
				
			}
			//4-5.맵의 모든 데이터를 출력
			Set<String> keySet = map.keySet();
			for(String key : keySet) {
				System.out.println(key + ":" + map.get(key));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

