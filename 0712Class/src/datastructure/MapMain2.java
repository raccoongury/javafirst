package datastructure;

public class MapMain2 {

	public static void main(String[] args) {
		//���ξ߱� �� �� ���� ����� �迭�� �����
		String [] kia = {"������", "��ġȫ", "�輱��"};
		String [] hanhwa = {"����", "���ٿ�"};
		String [] lotte = {"����", "�̴�ȣ"};
		String [] nc = {"�ڼ���", "������"};
			//String �迭�� �迭�� ����
		String [][] players = {kia, hanhwa, lotte, nc};
		
		//������ �迭�� ������ ���
		//ū �迭�� ���Ե� ���� �迭�� ������ ������ŭ �ݺ�
		for(int i = 0; i<players.length; i=i+1) {
			if(i==0) {
				System.out.print("KIA:" + "\t");
			}else if(i==1) {
				System.out.print("��ȭ:" + "\t");
			}else if(i==2) {
				System.out.print("�Ե�:" + "\t");
			}else if(i==3) {
				System.out.print("NC:" + "\t");
			}
			
			//���� �迭�� ������� ��������
			String [] imsi = players[i];
			//���� �迭�� ������ ������ŭ �ݺ�
			for(int j = 0; j<imsi.length; j=j+1 ) {
				System.out.print(imsi[j] + "\t");
			}
			System.out.println(" ");
		}
	}
}
