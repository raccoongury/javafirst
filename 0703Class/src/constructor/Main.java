package constructor;

public class Main {

	public static void main(String[] args) {
		//Practice Ŭ������ �ν��Ͻ� ����
		Practice practice1 = new Practice();
		//practice1.setName("noname");//������ �������
		System.out.println(practice1.getName());//������ �����
		
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


