import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement call = null;
		try {
			//�����ͺ��̽� ����̹� Ŭ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//�����ͺ��̽� ����
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", 
				"scott", "tiger");
			//������ Statement ��ü �����
			call = con.prepareCall(
				"{call deleteDeptProc(?)}");
			//����ǥ�� ���� �� ���ε�
			call.setInt(1, 11);
			
			//���� ���� ����
			int r = call.executeUpdate();
			if(r > 0) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
			
			
		}catch(Exception e) {
			
		}finally {
			try {
				if(call != null)call.close();
				if(con != null)con.close();
			}catch(Exception e) {}
		}

	}

}
