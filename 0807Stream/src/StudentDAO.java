import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	//StudentDAO Ŭ�������� ��� �����͸� �������� �޼ҵ�
	public List<StudentVO> fetch(){
		//������ ����Ʈ�� ����
		//List�� �����ؾ� �ϴ� ��쿡�� null�� �������� �ʴ°�
		//�����ϴ�.
		//List�� Ư���� ��찡 �ƴϸ� ���� ���Ÿ� �̿��ؼ� �����ϴµ�
		//null �̸� NullPointerException�� �߻��մϴ�.
		//null�� �ȸ���� ���ؼ� �ν��Ͻ��� �����ؼ� �����մϴ�.
		List<StudentVO> list = 
			new ArrayList<StudentVO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//����̹� Ŭ���� �ε�
			Class.forName(
				"oracle.jdbc.driver.OracleDriver");
			//�����ͺ��̽� ����
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"scott", "tiger");
			//sql ���� ��ü ����
			pstmt = con.prepareStatement(
				"select num, name, subject, score, age, gender "
				+ "from student");
			//SQL ����
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				StudentVO vo = 
					new StudentVO(
						rs.getString("num"), rs.getString("name"),
						rs.getString("subject"), rs.getInt("score"),
						rs.getInt("age"), rs.getString("gender"));
				list.add(vo);
			}
		}catch(Exception e) {
			//���� ���� Ȯ���� ���ؼ� �ۼ�
			System.out.println(
				"�б� ����:" + e.getMessage());
			//������ ��ġ�� �˱� ���ؼ� �ۼ�
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}catch(Exception e) {}
		}
		
		
		return list;
	}
}










