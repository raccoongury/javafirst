package polymorphism;

//Super Ŭ������ ��ӹ޴� Sub Ŭ����
public class Sub extends Super {
	//display �޼ҵ带 �������̵�
	//�Ʒ� ������̼� ������ �߻����� ������ ����� �������̵� �� ���Դϴ�.
	@Override
	public void display() {//����Ŭ������ �ִ°� ����Ŭ�������� ���� �������̵�
		System.out.println("How are you?");
	}
	public void method() {
		System.out.println("���� Ŭ������ ���� �޼ҵ�");
	}
}
