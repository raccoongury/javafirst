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
				//buf�� ũ�� ��ŭ �о buf�� �����ϰ�
				//���� ������ r �� ����
				int r = fr.read(buf);
				if(r <= 0) {
					break;
				}
				//�迭���� 0��° ���� r ��ŭ ��
				//���ڿ��� ��ȯ�ؼ� ���
				System.out.println(
					new String(buf, 0, r));
			}
			
		}
		catch(Exception e) {
			System.out.println(
				"����:" + e.getMessage());
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
