import java.util.Arrays;
import java.util.stream.IntStream;

public class ParellelMain {
	
	//1�� ����ϴ� �޼ҵ�
	public static void work(int a) {
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		int [] ar = {20,30,20,30,20,20,20,20,10,20};
		
		//�Ϲ� ��Ʈ������ work �۾��� ����
		IntStream stream = Arrays.stream(ar); 
		long start = System.currentTimeMillis(); 
		stream.forEach(su -> work(su));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		//���� ��Ʈ������ work �۾��� ����
		stream = Arrays.stream(ar); 
		start = System.currentTimeMillis(); 
		stream.parallel().forEach(su -> work(su));
		end = System.currentTimeMillis();
		System.out.println(end-start);

	}
}