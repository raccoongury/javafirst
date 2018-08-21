package characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataMain {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(
				new FileReader(
				"C:\\Users\\503-17\\Documents\\이정원\\access_log.txt"));
			//접속한 아이피를 중복 상관없이 저장하기 위한 자료구조
			ArrayList<String> iplist = new ArrayList<>();
			//중복 없이 저장하기 위한 Set 만들기
			Set<String>ipset = new HashSet<String>();
			while(true) {
				//한 줄을 읽기
				String line = br.readLine();
				//읽은 데이터가 없으면 종료
				if(line == null) {
					break;
				}
				//공백으로 분할
				String []  ar = line.split(" ");
				//System.out.println(ar[0]);
				ipset.add(ar[0]);
				iplist.add(ar[0]);
				
			}
			System.out.println(iplist);//ipset로하면  중복없이출력
			
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
