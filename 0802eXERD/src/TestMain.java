
public class TestMain {

	public static void main(String[] args) {
		//�����ڸ� �̿��ؼ� ��ü�� ����
		//T obj1 = new T();
		//T obj2= new T();
		
		//�̱��� ������ ������ Ŭ������ ��ü �����
		T obj1 = T.getInstace();
		T obj2 = T.getInstace();
		
		//�ؽ��ڵ� ���
			System.out.println(System.identityHashCode(obj1));
			System.out.println(System.identityHashCode(obj2));
			
			int a = 10;
			int b = 10;
			System.out.println(System.identityHashCode(a));
			System.out.println(System.identityHashCode(b));
	}

}
