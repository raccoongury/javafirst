package datastructure;

import java.util.HashMap;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "�¿�");
		map.put("age", 30);
		map.put("company", "SM");
		// ������ Ű�� �ٽ� �����ϸ� ������Ʈ�� �˴ϴ�.
		map.put("company", "SM Town");
		
		//company Ű�� ���� ����ϱ�
		System.out.println(map.get("company"));
		//���� Ű�� �̸��� ����ϸ� null�� ����
		System.out.println(map.get("position"));
		
		//��� ������ ��ȸ - ������ �� ����� Key�� ���� ��ȸ����
		//��� Ű�� Set���� ����
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key)); 
		}
	}
}
