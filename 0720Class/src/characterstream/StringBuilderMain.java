package characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringBuilderMain {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(
				new FileReader(
				"C:\\Users\\503-17\\Documents\\이정원\\0719.txt"));
			//줄 단위로 데이터를 이어붙일 StringBuilder 생성
			StringBuilder sb = 
				new StringBuilder();
			while(true) {
				//한 줄을 읽기
				String line = br.readLine();
				//읽은 데이터가 없으면 종료
				if(line == null) {
					break;
				}
				//읽은 데이터가 있으면 sb에 추가
				sb.append(line);
			}
			
			//읽은 내용을 String에 저장하기
			String content = sb.toString();
			//메모리 정리를 위해서
			sb = null;
			System.out.println(content);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
