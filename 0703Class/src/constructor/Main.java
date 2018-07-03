package constructor;

public class Main {

	public static void main(String[] args) {
		//Practice 클래스의 인스턴스 생성
		Practice practice1 = new Practice();
		//practice1.setName("noname");//생성자 미적용시
		System.out.println(practice1.getName());//생성자 적용시
		
		Practice practice2 = new Practice();
		//practice1.setName("noname");
		System.out.println(practice2.getName());
		
		Practice practice3 = new Practice("park");
		System.out.println(practice3.getName());
		
		String str = "Hello World";
		int r = str.lastIndexOf("k");
		System.out.println(r);
		
		r = str.length();
		System.out.println(r);
		

		}
		
	}


