package etc;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class TrafficSumMain {

	public static void main(String[] args) {
		//�о ���� �ν��Ͻ� �����
		File f = new File("C:\\Java\\java\\log.txt");
		try {
			//������ ������ ���� Scanner �ν��Ͻ� ����
			Scanner sc = new Scanner(f);
			//�հ踦 ������ ������ ����
			int sum = 0;
			//���� ���� ���� ���� �� ���� ����
			while(sc.hasNextLine()) {
				//�� �� �б�
				String temp = sc.nextLine();
				//�������� �����ϱ�
				String [] ar = temp.split(" ");
				
				//10��° ������ Ȯ��
				//System.out.println(ar[9]);
				
				//10��° ���ڿ��� ������ ��ȯ�ؼ� sum�� ���ϱ�
				sum = sum + Integer.parseInt(ar[9]);
			}
			System.out.println("Ʈ���� �հ�:" + sum);
			sc.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
