package bytestream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("./char.txt");
			fw.write("�ȳ��ϼ���");
			fw.write("�ݰ����ϴ�.\n");
			fw.write("���ڿ��� ���Ͽ� ����ϰ� �ֽ��ϴ�.");
			fw.flush();
		}
		catch(Exception e) {
			System.out.println(
				"��� ����:" + e.getMessage());
		}
		finally {
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
