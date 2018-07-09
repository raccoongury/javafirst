package lang;

import java.util.Arrays;

public class User {
	private int num;
	private String name;
	private String [ ] hobbies;
	public int getNum() {
		return num;
	}
	//�ν��Ͻ� ������ ����ϱ� ���� ������ �޼ҵ�
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	//�ν��Ͻ� ������ ���� ������ Ȯ���ϱ� ����(�����) �޼ҵ�
	@Override
	public String toString() {
		return "User [num=" + num + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}
	
	//���� �ν��Ͻ��� �̿��ؼ� ���ο� �ν��Ͻ��� ������ִ� �޼ҵ�
	public User clone( ) {
		User user = new User ( );
		user.num = this.num;
		user.name = this.name;
		//User.hobbies = this.hobbies;
		//�������� �ٽ� ������ �� �־�� �մϴ�.
		user.hobbies = new String[this.hobbies.length];
		for(int i = 0; i<this.hobbies.length; i=i+1) {
			user.hobbies[i] = this.hobbies[i];
		}
		return user;
	}
	
}
