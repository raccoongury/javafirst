package interfacetest;

//�޼ҵ��� ������ final �������� ������ ��ü
//���⿡ ������ ����� �� �������̽��� implements �ؼ� Ŭ�������� ���� ������ ����
public interface MemberService {
	//�������̽��� �޼ҵ�� abstract�� ������ �ʾƵ� �߻� �޼ҵ��Դϴ�.
	//���⿡ ����� �޼ҵ�� ����({ })�� ������ �ȵ˴ϴ�.
	
	//���̵� �ߺ� üũ�� ���� �޼ҵ�
	public boolean idCheck(String id);
	//�α��� ó���� ���� �޼ҵ�
	public int login(String id, String password);
}
