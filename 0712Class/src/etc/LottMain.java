package etc;

import java.util.Random;
import java.util.TreeSet;

public class LottMain {

	public static void main(String[] args) {
		//1���� 45������ ���� 6���� �����ϰ� �����ؼ� ���
		//������ ���ڸ� ���� ���ؼ� ���� �ν��Ͻ��� ����
		Random r = new Random();
		TreeSet <Integer> lotto = new TreeSet<>();
		while(lotto.size() < 6) {
			lotto.add(r.nextInt(45) + 1);
		}
		for(int x : lotto) {
			System.out.println(x);
		}
	}

}
