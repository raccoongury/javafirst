package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class OracleBinding {

	public static void main(String[] args) {
		//1.정수를 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 부서번호(정수):");
		int deptno = sc.nextInt();
		//System.out.println("부서번호:" + deptno);
		sc.close();
		
		//2.입력받은 데이터를 가지고 데이터베이스에 삭제하기
		//필요한 변수 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//드라이버 클래스를 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("로드 성공");
			
			//데이터베이스 연결
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", 
				"scott", "tiger");
			//System.out.println("연결 성공");
			
			//SQL 실행객체 생성
			pstmt = con.prepareStatement(
				"delete from dept where deptno = ?");
			pstmt.setInt(1, deptno);
			
			//sql 실행
			//실행하고 나면 영향받은 행의 개수를 리턴합니다.
			//조건에 맞는 데이터가 없으면 실패하는게 아니고
			//삭제하는 행의 개수가 0입니다.
			//실패하면 예외가 발생하므로 catch로 갑니다.
			int r = pstmt.executeUpdate();
			if(r > 0) {
				System.out.println("삭제 성공");
				//작업에 성공하면 commit을 호출
				con.commit();
			}
			else
				System.out.println("조건에 맞는 데이터가 없습니다.");
			
		}catch(Exception e) {
			try {
				//작업도중 예외가 발생한 경우 rollback을 호출
				con.rollback();
			}catch(Exception e1) {}
			//예외의 내용을 출력
			System.out.println(e.getMessage());
			//예외가 발생한 지점을 역추적
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}catch(Exception e) {}
		}
		

	}
}












