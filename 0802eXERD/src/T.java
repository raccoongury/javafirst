
public class T {

	//�ܺο��� ��ü�� �������� ���ϵ��� �����ڸ� pricate���� ����
	private T() {}
	
	//1���� ���� �������ֱ� ���� static ���� ����
	private static T obj;
	
	//��ü�� ������ ���� �����ϰ� ������ �׳� �����ϴ� static
	//�޼ҵ带 ����
	public static T getInstace() {
		if (obj == null) {
			obj = new T ();
		}
		return obj;
	}
}
