package object;

public class Car {
		//�𵨸�, ��ⷮ, ������ ������ ����
	private String modelName;
	private int displacement;
	private int price;
	
	//�ν��Ͻ� ������ ����ϱ� ���� ������ �޼ҵ� -getters & setters
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getDisplacement() {
		return displacement;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//���ε������� ���� ������ Ȯ���ϱ� ���� �뵵�� ���
	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", displacement=" + displacement + ", price=" + price + "]";
	}
	//2���� ������ ������ ���ϴ� �޼ҵ�
	public boolean equals(Car other) {
		boolean result = false;
		//ȣ���ϴ� �ν��Ͻ��� modelName �� �Ű������� modelName�� ������
		//true�� �����ϰ� �׷��� ������ false�� ����
				if(modelName.equals(other.modelName)) {
					result = true;
				}
				return result;
	}
}
