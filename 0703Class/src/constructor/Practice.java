package constructor;

public class Practice {
	
	static {
		System.out.println("�� ó�� �ѹ��� ����Ǵ� ����");
	}
	{
		System.out.println("�ν��Ͻ�(new)�� ���� �� ���� ����Ǵ� ����");
	}
	
	//������//2������ ȣ��
	public Practice(){
		name = "noname";
	}
	//������ �����ε�(���� ������ �̸��� �޼ҵ尡 2�� �̻� �ִ� ���)
	public Practice(String arg) {
		name = arg;
		
	}
	
	//�̸��� �����ϱ� ���� �ν��Ͻ� ������ ����
 private String name;//���� ����� ���� 
 
//name�� ������ �޼ҵ� ����//source - generate���� ����
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
////name�� ������ �޼ҵ� ��
		public void display() {
			String name = "�������� name";
			//this.�� ���̸� �������������� ã�� �ʰ� �ν��Ͻ� �������� ã�ƿɴϴ�
			System.out.println(this.name);
	}
}

