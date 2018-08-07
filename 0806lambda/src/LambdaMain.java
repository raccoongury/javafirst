import java.util.ArrayList;
import java.util.List;

interface T{
	public void method(int n);
}

interface V{
	public int add(int n1, int n2);
}

public class LambdaMain {

	public static void main(String[] args) {
		V ob = (n1, n2) ->{
			return n1+n2;
		};
		
		System.out.println(ob.add(100,3000));
		
		//�迭�� [�ε���]�� ���ؼ� ������ �����Ϳ� �����մϴ�.
		int [] ar = {10, 30, 20};
		//ar�� ��� ��Ҹ� temp�� �����ؼ� �ϳ��� �����մϴ�.
		//for - each�� �̿��� �迭�� ������ ����
		for(int temp : ar) {
			System.out.println(temp);
		}
		System.out.println("=================");
		//List�� get(�ε���)�� ���ؼ� ������ �����Ϳ� �����մϴ�.
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(70);
		list.add(40);
		for(int temp : list) {
			System.out.println(temp);
		}
	}
}









