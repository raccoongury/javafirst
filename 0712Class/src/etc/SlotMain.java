package etc;

import java.util.ArrayList;
import java.util.Random;

public class SlotMain {

	public static void main(String[] args) {
		ArrayList<String> list = 
				new ArrayList<String>();
		list.add("!");
		list.add("@");
		list.add("#");
		list.add("$");
		list.add("%");
		list.add("^");
		list.add("&");
		list.add("*");
		
		String slot ="";
		Random r = new Random();
		//list�� �ִ� ��� 3���� �����ϰ� �����ؼ� slot�� �߰�
		for(int i=0; i<3; i=i+1) {
			slot = slot + list.get(r.nextInt(list.size()));
		}
		System.out.println(slot);
		//3���� ���ڰ� ������ �� Ȯ��
		if(slot.charAt(0) == slot.charAt(1) && 
				slot.charAt(1) == slot.charAt(2)) {
			System.out.println(slot.charAt(0) + "�� 3��");
		}
		//���� 2�� ���ڸ� �������� Ȯ��
		else if(slot.charAt(0) == slot.charAt(1)) {
			System.out.println(slot.charAt(0) + "�� �տ� 2��");
		}
		//�� �̿��� ���
		else {
			System.out.println("�� ���� ��ȸ�� !!!!");
		}
		

	}

}




