package exceptionhandling;

public class Main1 {

	public static void main(String[] args) {
		try {//������ ������ �������� try�� ����
		int i = 10;
		int j = 0;
		int result = i/j;
		System.out.println("���:"+result);
		}		catch(Exception e) {
		}
		System.out.println("���� �߻� �� ����");
		
		String str = null;
		str.charAt(10);

	}

}
