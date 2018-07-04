package inheritance;

//Employee Ŭ������ ��ӹ��� Manager Ŭ����
public class Manager extends Employee {
	public Manager() {
		//�̷��� �����ڸ� ���� ���� ���� Ŭ������ �����ڸ� �θ��� ����
		//�ȵ���̵忡�� ���� �߻��մϴ�.
		super(10);
		/*
		System.out.println("10");
		super(10); ������� �ȵ�
		*/
	}
	
	//��å�� ������ ����
	private String task;

	public String getTask() {
		return task;
	}
	
	//�޼ҵ� ����: setTask(String)
	public void setTask(String task) {
		this.task = task;
	}


	@Override
	public String toString() {
		//super.toString()�� ���� Ŭ���� �� Employee�� toString�� ȣ���մϴ�.
		return super.toString() + "Manager [task=" + task + "]"; //return "Manager [task=" + task + "]";
	}

}
