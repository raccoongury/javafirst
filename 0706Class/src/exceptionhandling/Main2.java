package exceptionhandling;

public class Main2 {

	public static void main(String[] args) {
		//���ڿ� �迭�� ����
		String [] ar = {"Moring", "Afternoon", "Evening"};
		
		try {
		//�迭�� �����͸� ��ȭ�ϸ鼭 ���
		int size = ar.length;
		//size���� �����ؼ� ���ܰ� �߻�
		for(int i=0; i<=size; i=i+1) {
			System.out.println(ar[i]);
			if(i>1) {
				throw new NumberFormatException("������ ����  �߻�");
				
			}
			//System.out.println(Integer.parseInt(ar[i]));
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//���� ���� ���
			System.out.println(e.getMessage());
			//���� ������ ����
			e.printStackTrace();
		}
		catch (Exception e) {
			//���� ���� ���
			System.out.println(e.getMessage());
			//���� ������ ����
			e.printStackTrace();
			}finally {
				System.out.println("���� �߻� ���ο� ������� ����");
			}
	}

}
