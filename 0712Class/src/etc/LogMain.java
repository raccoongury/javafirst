package etc;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class LogMain {

	public static void main(String[] args) {
		//�α� ������ ������ ���� �� �ִ� Scanner �����
		File f = new File("C:\\log.txt");
		HashSet<String> set = new HashSet<String>();
		try {
			Scanner sc = new Scanner(f);
		
			while(sc.hasNextLine()) {
				//System.out.println(sc.nextLine());
				//�� �� �б�
				String temp = sc.nextLine();
				//�������� �����ϱ�
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








