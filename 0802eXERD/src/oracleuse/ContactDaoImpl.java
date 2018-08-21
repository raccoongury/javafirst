package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactDaoImpl implements ContactDao {
	//모든 메소드에서 공통으로 사용할 변수 선언
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//데이터베이스 연결을 수행해주는 메소드
	private void connect() {
		try {
			//드라이버 클래스 로드
			Class.forName(
				"oracle.jdbc.driver.OracleDriver");
			//데이터베이스 연결
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"scott", "tiger");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	//데이터베이스 자원을 해제해주는 메소드
	private void close() {
		try {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(con != null)con.close();
		}
		catch(Exception e) {}
	}
	
	//가장 큰 num을 찾아오는 메소드
	//sql: select max(num) from contact
	private int getMaxNum() {
		int result = 0;
		
		try {
			connect();
			//가장 큰 글번호를 찾아오는 sql을 실행하는 객체 생성
			pstmt = con.prepareStatement(
				"select max(num) from contact");
			//sql 실행
			rs = pstmt.executeQuery();
			
			//결과 읽기
			while(rs.next()) {
				//select 절의 첫번째 컬럼의 값을 정수로 읽어서
				//result에 저장
				result = rs.getInt(1);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			close();
		}
		return result;
	}
	
	@Override
	//데이터를 삽입하는 메소드
	public boolean insertContact(Contact contact) {
		boolean result = false;
		try {
			//가장 큰 번호 찾아오는 SQL을 실행
			int maxNum = getMaxNum();
			
			connect();
			//SQL 실행 객체 만들기
			pstmt = con.prepareStatement(
					"insert into contact(num, name, phone, email, birthday) " + 
					"values(?,?,?,?,?)");
			//물음표에 값을 바인딩
			//가장 큰 번호 + 1로 설정
			pstmt.setInt(1,  maxNum + 1);
			pstmt.setString(2, contact.getName());
			pstmt.setString(3, contact.getPhone());
			pstmt.setString(4, contact.getEmail());
			pstmt.setDate(5, contact.getBirthday());
			
			//select를 제외한 구문은 executeUpdate로 실행
			//실행결과를 영향받은 행의 개수를 정수로 리턴
			int r = pstmt.executeUpdate();
			if(r == 1) {
				result = true;
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		
		return result;
	}

	@Override
	public boolean updateContact(Contact contact) {
		boolean result = false;
		connect();
		try {
			//SQL 생성
			pstmt = con.prepareStatement(
				"update contact "
				+ "set name=?,phone=?,email=?,birthday=? "
				+ "where num=?");
			//물음표에 실제 데이터를 바인딩
			pstmt.setString(1, contact.getName());
			pstmt.setString(2, contact.getPhone());
			pstmt.setString(3, contact.getEmail());
			pstmt.setDate(4, contact.getBirthday());
			pstmt.setInt(5, contact.getNum());
			
			//sql 실행
			int r = pstmt.executeUpdate();
			//결과 사용
			if(r > 0) {
				result = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		close();
		return result;
	}

	@Override
	public boolean deleteContact(int num) {
		boolean result = false;
		connect();
		try {
			pstmt = con.prepareStatement(
				"delete from contact "
				+ "where num=?");
			pstmt.setInt(1, num);
			int r = pstmt.executeUpdate();
			if(r > 0) {
				result = true;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		close();
		return result;
	}

	@Override
	public List<Contact> allContact() {
		//읽어온 데이터를 저장하기 위한 리스트 생성
		List<Contact> list = new ArrayList<Contact>();
		connect();
		try {
			//contact 테이블에 있는 전체 데이터를 가져오는 SQL 실행 객체
			//를 생성합니다.
			pstmt = con.prepareStatement(" select num, name, phone, email, birthday"
					+ " from contact");
			//select 구문 실행
			rs = pstmt.executeQuery();
			
			//반복문을 이용해서 데이터를 읽어서 List에 저장
			while(rs.next()) {
				Contact contact = new Contact ( );
				contact.setNum(rs.getInt("num"));
				contact.setName(rs.getString("name"));
				contact.setPhone(rs.getString("phone"));
				contact.setEmail(rs.getString("email"));
				contact.setBirthday(rs.getDate("birthday"));
				//읽은 데이터를 리스트에 저장
				list.add(contact);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		close();
		return list;
	}

	@Override
	public List<Contact> nameContact(String name) {
			List<Contact>list = new ArrayList<Contact> ( );
			connect();
			try {
				//contact 테이블의 name 컬럼에 name의 값이 포함된
				//데이터를 조회하는 SQL 만들기
				pstmt = con.prepareStatement(
						"select * from contact where name like ?");
				//물음표에 데이터 바인딩 하기
				pstmt.setString(1, "%" + name + "%");
				//SQL 실행하기
				rs = pstmt.executeQuery();
				//데이터를 읽어서 list에 저장하기
				while(rs.next()) {
					Contact contact = new Contact ( );
					contact.setNum(rs.getInt("num"));
					contact.setName(rs.getString("name"));
					contact.setPhone(rs.getString("phone"));
					contact.setEmail(rs.getString("email"));
					contact.setBirthday(rs.getDate("birthday"));
					//읽은 데이터를 리스트에 저장
					list.add(contact);
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		return null;
	}

}
