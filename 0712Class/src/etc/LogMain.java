package etc;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class LogMain {

	public static void main(String[] args) {
		//로그 파일의 내용을 읽을 수 있는 Scanner 만들기
		File f = new File("C:\\log.txt");
		HashSet<String> set = new HashSet<String>();
		try {
			Scanner sc = new Scanner(f);
		
			while(sc.hasNextLine()) {
				//System.out.println(sc.nextLine());
				//한 줄 읽기
				String temp = sc.nextLine();
				//공백으로 분할하기
				String [] ar = temp.split(" ");
				set.add(ar[0]);
			}
			System.out.println(set);
		
			sc.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}








