package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OracleInsert {

	public static void main(String[] args) {
			//�����ͺ��̽� ���� ����
			Connection con = null;
			//SQL ���� ����
			PreparedStatement pstmt = null;
			try {
				//����̹� Ŭ���� �ε�
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//�����ͺ��̽� ����
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
				//SQL ���� ��ü�� ���� : sql�� �Ű������� �ؼ� ����
				//������ ����
				/*
				pstmt = con.prepareStatement("insert into dept(deptno, dname, loc)" 
						+ "values (50, '����', '�λ�')");
						*/
				/*
				//������ ����
				pstmt = con.prepareStatement("delete from dept where deptno = 50");
				*/
				//dept ���̺��� deptno�� 10���� ��������
						//loc�� ���絵�� ����
						pstmt = con.prepareStatement("update dept set loc = '���絵' where deptno = 10");
						
				//SQL�� ���� - select�� ������ ���� ����
				//r�� ����Ǵ� ���� ������� ���� ����
				int r = pstmt.executeUpdate();
				//�������� ���
				if(r > 0) {
					System.out.println("���� ����");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					if(pstmt !=null) pstmt.close();
					if(con != null) con.close();
				}catch(Exception e) { }
			}

	}

}
