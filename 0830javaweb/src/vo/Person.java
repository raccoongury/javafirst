package vo;

public class Person {

	protected String name;
	protected int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		System.out.println("getAge 호출");
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
