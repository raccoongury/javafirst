package object;

public class Main {

	public static void main(String[] args) {
			//Car Ŭ������ �ν��Ͻ��� �����ؼ� �����͸� ����
			Car car1 = new Car ();
			car1.setModelName("�׷���");
			car1.setDisplacement(2400);
			car1.setPrice(2200);
			//toString�� ȣ���ؼ� ���
			//System.out.println(car1.toString());
			//System.out.println(car1);
			
			Car car2 = new Car();
			car2.setModelName("�׷���");
			car2.setDisplacement(3000);
			car2.setPrice(2900);
			
			System.out.println(car1 == car2);
			System.out.println(car1.equals(car2));
	}

}
