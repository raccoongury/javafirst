package method;

public class Member {//public �� ������ �ڱ� ��Ű�� �ȿ����� ���, ������ �ٸ���Ű������ ��밡��

		private String email;
		//emai�� getter
		public String getEmail() {
			return email;
		}
		//email�� setter
		public void setEmail(String arg) {
			email = arg;
		}
		//
		
		private String password;
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		private String nickname;
		private int age;
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		//�ν��Ͻ� �������� ������ִ� �޼ҵ�
		//Ŭ���� �ȿ��� Ŭ������ ������� ������ ����� ����
		//�ν��Ͻ��� Ŭ���� �̸��� �������� �ʽ��ϴ�.member1�� �ٻ�
		public void display() {
			System.out.println("�̸���:" + email + "\t" + 
					"��й�ȣ:" + password + "\t" + 
					"�г���:" + nickname + "\t" +
					"����:" + age);
			
		}
		//1
		@Override//Source -> Generate tostring �ڵ�������
		public String toString() {
			return "Member [email=" + email + ", password=" + password + ", nickname=" + nickname + ", age=" + age
					+ "]";
		}
		//0
		//static �޼ҵ�: Ŭ���� �̸����� ȣ���� �� �ִ� �޼ҵ�
		//�Ű������� ... �� ������ �Ű����� ������ �������
		//���� ����
		public static int sum(int ... ar) {// ...���� �༭
			int tot = 0;
			//heap�� �ִ� �����͸� stack�� ����
			//���� ����ϱ� ������ heap�� ������ ȿ���� ������
			int len = ar.length;
			
			for(int i = 0; i<len; i=i+1) {
				tot =tot + ar[i];
			}
			return tot;
			}
		}