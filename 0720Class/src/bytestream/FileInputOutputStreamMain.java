package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamMain {

	public static void main(String[] args) {
		//try - catch - finally는 각각의 블럭
		//파일에 바이트 단위로 기록할 수 있는 스트림 변수 생성
		FileOutputStream fos = null;
		try {
			//예외가 발생할 가능성이 있는 구문
			//현재 프로젝트 디렉토리에 파일을 생성
			fos = new FileOutputStream(
				"./0720byte.txt", true);
			//파일에 1바이트 기록
			//fos.write(97);
			
			//파일에 바이트 배열을 기록
			//byte [] ar = {97, 98, 99, 100, 101};
			//fos.write(ar);
			
			//문자열을 바이트 배열로 변환해서 기록
			//getBytes 이용 - 중요
			String str = "안녕하세요";
			fos.write(str.getBytes());
			
			//버퍼의 내용을 비우기
			fos.flush();
		}catch(Exception e) {
			//예외가 발생했을 때 수행할 구문
			System.out.println(
				"파일 입출력 예외:" + e.getMessage());
			//현재 날짜와 시간 그리고 예외 내용을 로깅합니다.
			//파일에 기록하거나 네트워크를 통해서 서버에 전달
			//합니다.
		}finally {
			//예외 발생 여부에 상관없이 수행할 구문
			try {
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream(
				"./0720byte.txt");
			//1byte 읽어오기
			/*
			int r = fis.read();
			System.out.println(r);
			*/
			
			//4바이트 읽기
			/*
			byte [] b = new byte[4];
			fis.read(b);
			System.out.println(b);
			*/
			 
			 //4바이트 씩 전체를 읽기
			 //read에 바이트 배열을 대입하면 읽은 개수를 리턴
			 //0보다 작거나 같은 값을 리턴하면 읽을 데이터가 없는 것입니다.
			 while(true) {
				 byte [] b = new byte[4];
				 int r = fis.read(b);
				 //배열은 toString이 재정의 되어 있지 않아서 해시코드가 출력
				 //System.out.println(b);
				 
				 //코드를 각각 출력
				 /*
				 for(byte imsi : b) {
					 System.out.println(imsi);
				 }
				 */
				 
				 //문자열로 변환해서 출력
				 System.out.println(new String(b));
				 if(r <= 0 ) {
					 break;
				 }
			 }
			
		}
		catch(Exception e) {
			System.out.println("파일 읽기 예외:" + 
					e.getMessage());
		}
		finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}






