package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DataSaveDto {

		public static void main(String[] args) {
			//�����ͺ��̽����� ������ �б⸦ ���� ����
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			//�о�� ������ ������ ���� �ڷᱸ��
			ArrayList<Dept> list =
					new ArrayList<>();
			
			try {
				//�����ͺ��̽� ����̹��� �ε�
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//�����ͺ��̽� ����
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
				//sql ���� ��ü ����
				pstmt = con.prepareStatement(
						"select deptno, dname, loc from dept");
				//sql ����
				rs = pstmt.executeQuery();
				//������ �б�
				//�� ������ �б�
				while(rs.next()) {
					//�ϳ��� ���� ������ DTO ��ü ����
					Dept dept = new Dept();
					dept.setDeptno(rs.getInt("deptno"));
					dept.setDname(rs.getString("dname"));
					dept.setLoc(rs.getString("loc"));
					
					//���� �ϳ��� ���� ����Ʈ�� ����
					list.add(dept);
				}
				System.out.printf("%10s", "�μ���ȣ");
				System.out.printf("%20s", "�μ���ȣ");
				System.out.printf("%30s", "�μ���ġ");
				System.out.println();
				for(Dept dept : list) {
					System.out.printf("%10s", dept.getDeptno());
					System.out.printf("%20s", dept.getDname());
					System.out.printf("%30s", dept.getLoc());
					System.out.println();
				}
				
			}catch(Exception e) {
				//���� ������ ���
				System.out.println(e.getMessage());
				//���� ������ ����
			}finally {
				//����� ���� ��� �ݱ�
				try {
					if(con != null) con.close();
					
				}catch(Exception e) { }
			}
			
		}

	}
