package inheritance;
//직원 정보를 저장하기 위한 클래스
public class Employee {

	//번호와 이름을 저장하기 위한 변수
	protected int num;//private int num;이걸 Manager에서 상속받기 위해 private를 protected로 변경
	protected String name;
	
	//num의 값을 일련번호로 만들기 위한 공유 변수 - static
	private static int autoincrement;
	
	//생성자(Constructor)
	public Employee(int n) {
		//일련번호를 만들기
		autoincrement = autoincrement + 1;
		num = autoincrement;
	}
	
	//인스턴스 변수를 사용할 수 있도록 하기 위한 접근자 메소드
	
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

	
	//값을 확인하기 쉽게 하기 위한 메소드
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + "]";
	}
	

}
