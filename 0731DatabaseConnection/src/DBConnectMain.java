import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectMain {

	public static void main(String[] args) {
			//����ϰ��� �ϴ� ����̹� Ŭ������ �ε�
		//�����ͺ��̽� ������ ���� �ٸ�
		
		//�����ͺ��̽� ���� ���� ����
		//�ݵ�� close()�� ȣ���ؾ� �ϹǷ� finally���� close()�� ȣ��
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521:xe",
					"scott", "tiger");
			System.out.println(con);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}finally {
		//������ �Ǿ� ������ �ݵ�� ���� ����
		if(con != null) {
			try {
				con.close();
			}catch(Exception e) { }
		}
		}
	}
	}


