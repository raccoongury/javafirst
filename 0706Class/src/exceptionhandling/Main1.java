package exceptionhandling;

public class Main1 {

	public static void main(String[] args) {
		try {//문제가 있을것 같은곳을 try로 묶음
		int i = 10;
		int j = 0;
		int result = i/j;
		System.out.println("결과:"+result);
		}		catch(Exception e) {
		}
		System.out.println("예외 발생 후 실행");
		
		String str = null;
		str.charAt(10);

	}

}
