package datastructure;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapMain1 {

	public static void main(String[] args) {

		//�̸��� ���� �� �Ҽ� ȸ�縦 �����ϴ� Map�� ����
		
		//HashMap�� key�� ������ �˼� ����
		//HashMap<String, Object> map = new HashMap<>();
		
		//�Է��� ������� key�� �����մϴ�. 
		//LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		
		TreeMap<String, Object> map = new TreeMap<>();
			map.put("name", "���̸�");
			map.put("age",  28);
			map.put("company", "SM");
			
		//��ü�� �Ѳ����� ���
			System.out.println(map);
		//������ ��� ���� �׸񺰷� ���
			System.out.println("====================");
			Set<String> keys = map.keySet();
			for(String key : keys) {
				System.out.println(key + ":" + map.get(key));
		}
	}
}
