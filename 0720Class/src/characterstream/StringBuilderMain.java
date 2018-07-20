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
				"C:\\Users\\503-17\\Documents\\������\\0719.txt"));
			//�� ������ �����͸� �̾���� StringBuilder ����
			StringBuilder sb = 
				new StringBuilder();
			while(true) {
				//�� ���� �б�
				String line = br.readLine();
				//���� �����Ͱ� ������ ����
				if(line == null) {
					break;
				}
				//���� �����Ͱ� ������ sb�� �߰�
				sb.append(line);
			}
			
			//���� ������ String�� �����ϱ�
			String content = sb.toString();
			//�޸� ������ ���ؼ�
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
