package inheritance;
//���� ������ �����ϱ� ���� Ŭ����
public class Employee {

	//��ȣ�� �̸��� �����ϱ� ���� ����
	protected int num;//private int num;�̰� Manager���� ��ӹޱ� ���� private�� protected�� ����
	protected String name;
	
	//num�� ���� �Ϸù�ȣ�� ����� ���� ���� ���� - static
	private static int autoincrement;
	
	//������(Constructor)
	public Employee(int n) {
		//�Ϸù�ȣ�� �����
		autoincrement = autoincrement + 1;
		num = autoincrement;
	}
	
	//�ν��Ͻ� ������ ����� �� �ֵ��� �ϱ� ���� ������ �޼ҵ�
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//���� Ȯ���ϱ� ���� �ϱ� ���� �޼ҵ�
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + "]";
	}
	

}
