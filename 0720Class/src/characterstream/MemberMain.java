package characterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {
		//Ű����κ��� �� ������ �Է��� ���� �� �ִ� Ŭ������
		//������ ���� ����
		//finall������ close�� �� �� �ֵ��� try �ۿ���
		//������ �����մϴ�.
		BufferedReader br = null;
		
		try {
			//Ű����κ��� �Է¹��� �� �ִ� �ν��Ͻ� ����
			br = new BufferedReader(
				new InputStreamReader(System.in));
			System.out.print("�̸�:");
			//���ڿ� �� ���� �о����
			String name = br.readLine();
			
			System.out.print("����:");
			String age = br.readLine();
			
			System.out.print("Ű:");
			String height = br.readLine();
			
			//3���� �����͸� �ϳ��� �����ϱ� ���� �ν��Ͻ��� ����
			Member member = new Member();
			member.setName(name);
			//������ ��ȯ�ؼ� ����
			member.setAge(Integer.parseInt(age));
			//�Ǽ��� ��ȯ�ؼ� ����
			member.setHeight(Double.parseDouble(height));
			
			//���� �̿��ؼ� ����
			Map<String, Object> map = 
				new HashMap<>();
			map.put("name", name);
			map.put("age", Integer.parseInt(age));
			map.put("height",Double.parseDouble(height));
			
			//����� ���� VO Ŭ������ Map�� �� ���̰� �����ϴ�.

			System.out.println(member);
			System.out.println(map);
			
			//����� ���� ���� �ٸ��ϴ�. ���̸� 1�� ���ϱ�
			int r = member.getAge()+1;
			//Map������ �����͸� �����ͼ� ����� �� ���� �� ��ȯ�� �ؾ��մϴ�
			r = (Integer)map.get("age") + 1;
		}catch(Exception e) {
			System.out.println(
				"����:" + e.getMessage());
		}finally {
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





