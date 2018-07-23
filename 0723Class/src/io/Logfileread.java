package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class Logfileread {

	public static void main(String[] args) {
		// 1.��° access -log.txt ������ ���� �� �ִ� Stream�� ����
		// BufferedReader ��ü �����
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new FileReader("C:\\Users\\503-17\\Documents\\������\\access_log.txt"));
			//4. HashMap�� �̿��ؼ� ������ Ip�� Ƚ���� ���
			HashMap<String, Integer> map = new HashMap<>();
			
			//5.HashMap�� �̿��ؼ� ������ IP �� Ʈ���� �հ� ���
			HashMap<String, Integer> traffic = 
				new HashMap<>();
			
			//2.��°�ٴ����� �����͸� �о ���
			while(true) { //�ٴ����� ������� ���ѹݺ�������
				String line = br.readLine();		//�� ���� �б�
				//���� �����Ͱ� ������ ����
				if(line == null) {
					break;
				}
				//System.out.println(line); //�ٴ����� ��� Ȯ�� �׽�Ʈ
				//3-1.�� ������ ���� �����͸� �������� �����ؼ� ù��°�� �ִ� �����͸� ���
				String [] ar= line.split(" ");
				//3-2.System.out.println(ar[0]);
				//4-2. ip�� ����� �����͸� �����ɴϴ�
				Integer count = map.get(ar[0]);
				//4-3.����� �����Ͱ� ������ 1�� �����մϴ�.
				if(count == null) {
					map.put(ar[0], 1);
				}
				//4-4.����� �����Ͱ� ������ 1�� ���ؼ� �����մϴ�.
				else {
					map.put(ar[0], count + 1);
				}
				//5-1.Ʈ������ ������ͼ�  �̰ų� �̰� �ƴѰ�쿡 �� ������ �ٲ�
				Integer traf = traffic.get(ar[0]);
				if(traf == null) {
					if(!ar[9].equals("\"-\"")) {
						traffic.put(ar[0],
							Integer.parseInt(ar[9]));
					}
				}else {
					if(!ar[9].equals("-")) {
						traffic.put(ar[0], 
							traf + Integer.parseInt(ar[9]));
					}
				}
				
			}
			//4-5.���� ��� �����͸� ���
			Set<String> keySet = map.keySet();
			for(String key : keySet) {
				System.out.println(key + ":" + map.get(key));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

