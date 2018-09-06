package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Buy;

@WebServlet("*.db")
public class DBController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DBController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청 주소에서 공통된 부분을 제외한 부분을 추출
		String requestURI = 
				request.getRequestURI();
		String contextPath = 
				request.getContextPath();
		String command = 
			requestURI.substring(contextPath.length() + 1);
		switch(command) {
		
		
		case "selectlist.db":
			Connection con4 = null;
			PreparedStatement pstmt4 = null;
			ResultSet rs4 = null;
			//select 구문은 결과를 저장할 변수가 필요
			List<Buy> list = new ArrayList<Buy>();
			try {
				//드라이버 클래스 로드
				Class.forName(
					"com.mysql.jdbc.Driver");
				//데이터베이스 연결
				con4 = 
					DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/raccoongury?characterEncoding=UTF-8&serverTimezone=UTC", "root", "********");
				pstmt4 = con4.prepareStatement(
					"select * from buytbl");
				
				//sql을 실행하고 결과 저장하기
				rs4 = pstmt4.executeQuery();
				
				//리턴된 데이터를 읽어서 list에 저장
				while(rs4.next()) {
					Buy buy = new Buy();
					buy.setNum(rs4.getInt("num"));
					buy.setUsertid(rs4.getString("userid"));
					buy.setProductname(rs4.getString("productname"));
					buy.setGroupname(rs4.getString("groupname"));
					buy.setPrice(rs4.getInt("price"));
					buy.setAmount(rs4.getInt("amount"));
					
					list.add(buy);
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				
			}finally {
				try {
					if(rs4 != null)rs4.close();
					if(con4 != null)con4.close();
					if(pstmt4 != null)pstmt4.close();
				}catch(Exception e) {}
			}
			//System.out.println(list);
			for(Buy buy : list) {
				System.out.println(buy);
			}
			break;
			
			
		case "delete.db":
			Connection con3 = null;
			PreparedStatement pstmt3 = null;
			try {
				//드라이버 클래스 로드
				Class.forName(
					"com.mysql.jdbc.Driver");
				//데이터베이스 연결
				con3 = 
					DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/raccoongury?characterEncoding=UTF-8&serverTimezone=UTC", "root", "********");
				pstmt3 = con3.prepareStatement(
					"delete from usertbl where userid=?");
				pstmt3.setString(1, "raccoongury");
				
				//sql을 실행하고 결과 저장하기
				int result3 = pstmt3.executeUpdate();
				if(result3 > 0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("에러는 없지만 삭제는 하지 않음");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					if(con3 != null)con3.close();
					if(pstmt3 != null)pstmt3.close();
				}catch(Exception e) {}
			}
			break;
		
		case "insert.db":
			Connection con1 = null;
			PreparedStatement pstmt = null;
			try {
				//드라이버 클래스 로드
				Class.forName(
					"com.mysql.jdbc.Driver");
				//데이터베이스 연결
				con1 = 
					DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/raccoongury?characterEncoding=UTF-8&serverTimezone=UTC", "root", "********");
				pstmt = con1.prepareStatement(
					"insert into usertbl(userid, name, birthyear, addr, mobile, mdate) values(?,?,?,?,?,?)");
				pstmt.setString(1, "raccoongury");
				pstmt.setString(2, "안중근");
				pstmt.setInt(3, 1905);
				pstmt.setString(4, "서울");
				pstmt.setString(5, "01001010101");
				pstmt.setDate(6, new Date(5, 11, 3));
				
				//sql을 실행하고 결과 저장하기
				int result = pstmt.executeUpdate();
				if(result > 0) {
					System.out.println("삽입성공");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					if(con1 != null)con1.close();
					if(pstmt != null)pstmt.close();
				}catch(Exception e) {}
			}
			break;
			
			
		case "mysql.db":
			try {
				//드라이버 클래스 로드
				Class.forName(
					"com.mysql.jdbc.Driver");
				//데이터베이스 연결
				Connection con = 
					DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/raccoongury?characterEncoding=UTF-8&serverTimezone=UTC", "root", "********");
				System.out.println(con);
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			break;
		
		case "oracle.db":
			try {
				Class.forName(
					"oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.10.101:1521:xe",
					"user17", "user17");
				System.out.println(con);
				con.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			break;
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

