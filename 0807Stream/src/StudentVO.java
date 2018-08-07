
public class StudentVO {
	//���̺��� �� �÷��� ������ �����ϱ� ���ؼ� ����
	private String num;
	private String name;
	private String subject;
	private int score;
	private int age;
	private String gender;
	
	//�ν��Ͻ� ������ �� �� �����͸� �ٷ� �����ؼ� �����ϸ�
	//�޼ҵ� ȣ��Ƚ���� ���� �� �ֱ� ������ ����
	public StudentVO() {
		super();
	}
	
	public StudentVO(String num, String name, String subject, int score, int age, String gender) {
		super();
		this.num = num;
		this.name = name;
		this.subject = subject;
		this.score = score;
		this.age = age;
		this.gender = gender;
	}

	//�ν��Ͻ� ������ private���� �����߱� ������
	//�ν��Ͻ��� ����� �� ��� �ν��Ͻ� ������ ����ϱ� ���� �޼ҵ�
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	//�����͸� ������ Ȯ���ϱ� ���ؼ� - ������� ���ؼ�
	@Override
	public String toString() {
		return "StudentVO [num=" + num + ", name=" + name + ", subject=" + subject + ", score=" + score + ", age=" + age
				+ ", gender=" + gender + "]";
	}
}
