package polymorphism1;

public class Main {

	public static void main(String[] args) {
		// 3�� Ŭ������ �����ϴ� �޼ҵ带 ȣ���غ���
		Starcraft star = new Terran();
		//Terran t = new Terran();
		star.attack();//t.attack();

		Starcraft star = new Zerg();
		star.attack();

		Starcraft star = new Protoss();
		star.attack();

	}

}
