package mutex;

import java.util.ArrayList;

//���� �ڿ��� ���� Ŭ����
		public class ShareData {
			//���� ������ ����
			public static ArrayList<Character> list = 
					new ArrayList<>();
			
			//�����͸� �����ϴ� �޼ҵ�
			public synchronized void save(char ch) {
				if(list.size()>1) {// ==1���� �Һ�ݺ�
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				list.add(ch);
				System.out.println(ch + "�� �����߽��ϴ�.");
				//wait ���� ������ �����
				notifyAll();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//����Ʈ���� �ϳ��� ������ ����ϴ� �޼ҵ�
			public synchronized void get() {
				if(list.size() == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				char ch = list.remove(0);
				System.out.println(ch + "�� �Һ��߽��ϴ�.");
				notifyAll();
			}
		}

