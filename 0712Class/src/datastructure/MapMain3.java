package datastructure;

import java.util.HashMap;

import javax.print.DocFlavor.STRING;

public class MapMain3 {

	public static void main(String[] args) {
		// ���ξ߱� �� �� ���� ����� �迭�� �����
		// ���ξ߱� �� �� ���� ����� �迭�� �����
		String[] kia = { "������", "��ġȫ", "�輱��" };
		String[] hanhwa = { "����", "���ٿ�" };
		String[] lotte = { "����", "�̴�ȣ" };
		// String [] nc = {"�ڼ���", "������"};

		// ������ �ǹ̸� ���� �迭���� ���� �� �ٷ� �迭�̳� ����Ʈ�� ���� ����
		// �ٶ������� �ʽ��ϴ�.
		// �迭�̳� ����Ʈ�� �ε����� ������ ������ �ϱ� ������ �ǹ̸� �ο�����
		// ���մϴ�.
		// �迭�̳� ����Ʈ�� �ٽ� �迭�̳� ����Ʈ�� ���� ���� ���� Map����
		// �ǹ̸� �ο��ؼ� ���� ���� �ٽ� �迭�̳� ����Ʈ�� ������� �մϴ�.

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("team", "���");
		map1.put("data", kia);

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("team", "��ȭ");
		map2.put("data", hanhwa);

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("team", "�Ե�");
		map3.put("data", lotte);
		
		String [] nc = {"�ڼ���", "������"};
		HashMap<String, Object>map4 = new HashMap<>();
		map4.put("team", "nc");
		map4.put("data", nc);

		// HashMap�迭
		HashMap[] players = { map1, map2, map3, map4 };

		for (int i = 0; i < players.length; i = i + 1) {
			HashMap temp = players[i];
			//�� �̸� ���
			System.out.print(temp.get("team"));
			//���� ��� ��������
			//����� �� ���� get �� �����͸� ����ȯ ���� ������
			//������ �ϰų� ����� �� ���� ������ �ڷ������� ���� �� ��ȯ��
			//�ؼ� ����մϴ�.
			String [] imsi = (String []) temp.get("data");
			for(int j=0; j<imsi.length; j=j+1) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println(" ");
		}
	}
}
