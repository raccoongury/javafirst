package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleMain {

	public static void main(String[] args) {
		Connection con = null;
			try {
				//����ϴ� �����ͺ��̽� ���� �ε��ϴ� Ŭ���� �̸��� �����Ǿ� �ֽ��ϴ�.
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//Ȯ���ϱ� ���� �ڵ�
				//�� �ڵ尡 ��µ��� ������ ����̹� �̸��� Ȯ���غ���
				//����̹��̸��� Ʋ���� �ʾҴٸ� ojdbc6.jar ��
				//Referenced Libraries�� ���ԵǾ� �ִ��� Ȯ��
				System.out.println("����Ŭ ����̹� �ε� ����");
				
				//�����ͺ��̽� ����
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
				System.out.println("�����ͺ��̽� ���� ����");
			}catch(Exception e) {
				System.out.println(e.getMessage());
				
			}finally {
				try {
					//�����ͺ��̽��� ���� ������ �����ͺ��̽��� �ݱ�
					if(con != null) {
						con.close();
					}
					}catch(Exception e) { }
				}
			}
	}
