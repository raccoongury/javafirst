package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//Ű����κ��� �� ���� �Է¹޾Ƽ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �Է�:");
		//�� ���� �Է¹ޱ�
		//String msg = sc.nextLine();
		
		//���� ������ �����ؼ� �Է¹ޱ�
		String msg = sc.next();
		System.out.println(msg);
		
		//��ĳ�ʸ� ����ϸ� �������� �ݾ� �־�� �մϴ�.
		sc.close();
		
		//���ڿ��� ���� �ޱ�
		sc = new Scanner("Hello Java ");
		System.out.println(sc.next());
		System.out.println(sc.next());
		sc.close();
		//File ��ü �����
		File f = new File("C:\\���ڿ��׽�Ʈ.txt");
		//���ϰ� ����Ǵ� ��ĳ�� ��ü �����
		try {
			sc = new Scanner(f);
			//�����Ͱ� ���� �� ���� �б�
			//������ �ִµ� ������ ���д� ���� 2���� ��� �ε�
			//���й��ڰ� ���� ����̰� �ѱ� ���ڵ��� ���� �ٸ� ����Դϴ�.
			//�ѱ� ���ڵ��� �߸��Ǹ� ���ڰ� �����°� �ƴϰ� scanner�� ������ ���մϴ�.
			//���� ���ڸ� ã�ƾ� �ϴµ� ���ڵ��� �ٸ��� ���鹮�ڵ� �ڵ� ���� �ٸ��ϴ�.
			
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}







