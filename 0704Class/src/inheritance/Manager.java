package inheritance;

//Employee 클래스를 상속받은 Manager 클래스
public class Manager extends Employee {
	public Manager() {
		//이렇게 생성자를 직접 만들어서 상위 클래스의 생성자를 부르는 경우는
		//안드로이드에서 많이 발생합니다.
		super(10);
		/*
		System.out.println("10");
		super(10); 여기오면 안됨
		*/
	}
	
	//직책을 저장할 변수
	private String task;

	public String getTask() {
		return task;
	}
	
	//메소드 원형: setTask(String)
	public void setTask(String task) {
		this.task = task;
	}


	@Override
	public String toString() {
		//super.toString()은 상위 클래스 인 Employee의 toString을 호출합니다.
		return super.toString() + "Manager [task=" + task + "]"; //return "Manager [task=" + task + "]";
	}

}
