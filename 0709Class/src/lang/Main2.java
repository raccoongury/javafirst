package lang;

public class Main2 {

	public static void main(String[] args) {
		User user1 = new User( );
		user1.setNum(1);
		user1.setName("���̸�");
		String [ ] hobbies = {"�뷡", "��"};
		user1.setHobbies(hobbies);
		//toString�� ȣ���ؼ� ���� ���� Ȯ��
		//System.out.println(user1);
		
		//user1�� �����Ͱ� ����� ���� �ּҸ� user�� ����
		User user2 = user1;
		user2.setNum(2);
		System.out.println(user1);
		
		//
		User user3 = user1.clone( );
		user3.setNum(3);
		user3.setName("����");
		user3.getHobbies( )[0] = "����";
		System.out.println(user1);
		System.out.println(user3);
	}

}
