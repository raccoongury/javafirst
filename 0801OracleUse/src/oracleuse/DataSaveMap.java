package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataSaveMap {

		public static void main(String[] args) {
			//�����ͺ��̽����� ������ �б⸦ ���� ����
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			//�о�� ������ ������ ���� �ڷᱸ��
			ArrayList<Map<String,Object>> list =
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
					//�ϳ��� ���� ������ �� ��ü ����
					Map<String, Object> map = new HashMap<>();
					map.put("deptno",  rs.getInt("deptno"));
					map.put("dname", rs.getString("dname"));
					map.put("loc", rs.getString("loc"));
					
					//���� �ϳ��� ���� ����Ʈ�� ����
					list.add(map);
				}
				System.out.printf("%10s", "�μ���ȣ");
				System.out.printf("%20s", "�μ���ȣ");
				System.out.printf("%30s", "�μ���ġ");
				System.out.println();
				for(Map map : list) {
					System.out.printf("%10s", map.get("deptno"));
					System.out.printf("%20s", map.get("dname"));
					System.out.printf("%30s", map.get("loc"));
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