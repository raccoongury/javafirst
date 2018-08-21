package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class OracleDataBinding {

	public static void main(String[] args) {
		// 데이터베이스 연결 변수
		Connection con = null;
		// SQL 실행 변수
		PreparedStatement pstmt = null;
		
		//키보드로 부터 입력을 받을 수 있는 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("부서번호:");
		int deptno = sc.nextInt();
		
		System.out.print("부서이름:");
		//이전에 남아있던 Enter를 제거하기 위한 코드입니다.
		sc.nextLine();
		String dname = sc.nextLine();
		
		System.out.print("지역:");
		String loc = sc.nextLine();
		
		sc.close();
		
		try {
			// 드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 데이터베이스 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			String sql = "insert into dept(deptno, dname, loc) "
					+ "values(?,?,?)";
			//pstmt 생성 - 다른 데이터를 바인딩할 수 있는 PreparedStatement 생성
			pstmt = con.prepareStatement(sql);
			//데이터 바인딩
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			int r = pstmt.executeUpdate();
			if(r > 0) {
				System.out.println("삽입 성공");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
			}
		}

	}

}
