package etc;

import java.util.StringTokenizer;

public class StringTokenMain {

	public static void main(String[] args) {
		String msg = "���� ���б������� �߱� ���� �����ϴ�.";
		
		//msg�� ��������� ���� �ؼ� ���
		//1.split �޼ҵ� �̿�
		String [] ar = msg.split(" ");
		for(String token : ar) {
			System.out.println(token);
		}
		System.out.println("================");
		
		StringTokenizer st = new StringTokenizer(msg, " ");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		String data = "90.30.20.60";
		//data�� , ������ �����ؼ� �հ踦 ���ϱ�
		String [] tokens = data.split("\\.");
		int sum = 0;
		for(String token : tokens) {
			sum = sum + Integer.parseInt(token);
		}
		System.out.println("�հ�:" + sum);

	}
}






