package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMain {

	public static void main(String[] args) {
		//��ü ������ �����͸� ����� �� �ִ� Ŭ������ ���� ����
		ObjectInputStream ois = null;
		try {
			//���Ͽ� ��ü ������ ����� �� �ִ� Ŭ������
			//��ü �����
			ois = new ObjectInputStream(
				new FileInputStream("./oos.txt"));
			//read�� �о�� �� Object Ÿ������ �����ϱ� ������
			//���� �� ��ȯ�� �ؼ� ������ �ڷ�������
			//�ǵ����� ����ؾ� �մϴ�.
			Member member = (Member)ois.readObject();
			System.out.println(member);
			/*
			Member member = new Member();
			member.setEmail("ggangpae1@gmail.com");
			member.setPw("1234");
			member.setPhone("01037901977");
   */
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(ois != null)
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}

