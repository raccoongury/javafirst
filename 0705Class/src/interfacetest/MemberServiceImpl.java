package interfacetest;

import java.io.Serializable;

//MemberService �������̽��� implements �� Ŭ������ ����
//�ϳ��� �������̽��� implements �� Ŭ������ �̸��� �������̽� �̸� �ڿ�
//Impl�� ���̴� ���� �����Դϴ�.
public class MemberServiceImpl implements MemberService, Serializable {

	@Override
	public boolean idCheck(String id) {
		boolean result = false;
		
		//id�� root�� �ƴ϶�� true
		if(id.equals("root") == false) {
			result = true;
		}
		return result;
	}

	@Override
	public int login(String id, String password) {
		//id�� root�̰� password�� 1234 �̸� �α��� ���� - 0
		//id�� root�̰� password�� 1234�� �ƴϸ� ��й�ȣ�� Ʋ�� - 1
		//id�� root�� �ƴϸ� ���� id - 2
		int result = 2;
		if(id.equals("root")) {
			if(password.equals("1234")) {
				result = 0;
			}
			else {
				result = 1;
			}
		}
		return result;
	}

}
