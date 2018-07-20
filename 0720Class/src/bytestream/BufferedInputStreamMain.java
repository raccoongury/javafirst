package bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamMain {

	public static void main(String[] args) {
		//���Ͽ��� ����Ʈ ������ ���۸��� �̿��ؼ� �б�
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(
				new FileInputStream(
					"C:\\Java\\java\\0702.txt"));
			while(true) {
				byte [] b = new byte[1024];
				int r = bis.read(b);
				/*
				for(byte temp : b) {
					System.out.println(temp);
				}
				*/
				System.out.println(new String(b));
				if(r <= 0) {
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println("���ܹ߻�:" +
		e.getMessage());
		}
		finally {
			try {
				if(bis != null)
					bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
