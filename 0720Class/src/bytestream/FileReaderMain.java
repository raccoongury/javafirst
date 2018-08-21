package bytestream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("./sample.txt");
			char [] buf = new char[15];
			while(true) {
				//buf의 크기 만큼 읽어서 buf에 저장하고
				//읽은 개수를 r 에 저장
				int r = fr.read(buf);
				if(r <= 0) {
					break;
				}
				//배열에서 0번째 부터 r 만큼 만
				//문자열로 변환해서 출력
				System.out.println(
					new String(buf, 0, r));
			}
			
		}
		catch(Exception e) {
			System.out.println(
				"예외:" + e.getMessage());
		}
		finally {
			if(fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}


	}

}
