package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardListDAO {

	public static void main(String[] args) {
		
		
		System.out.println("BoardLsitDAO.main() - 시작");
		
		// jdbc에 필요한 객체 선언 
		Connection  con = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 확인 완료");
			
			
			//2. 접속 가능한지 확인 - 연결 확인
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"java", "java"); 
			System.out.println("2. 오라클 연결 성공 ");
			
			
			//3.실행쿼리
			String sql = "select no, title, writer, writeDate, hit"
					+ " from board "
					+ "order by no desc";
			System.out.println("3.sql - " + sql );
			
			
			//4. 실행객체 sql 넣기와 데이터 세팅
			pstmt = con.prepareStatement(sql);
			System.out.println("4. 실행 객체 생성 완료");
			
			
			//5. 실행해서 데이터 가져오기 
			rs = pstmt.executeQuery();
			System.out.println("5. 실행성공 데이터 가져오기");
			
			
			//6. 데이터 표시 담기
			if(rs != null ) {
				System.out.println("번호/ 제목 / 작성자 / 작성일 / 조회수");
				while(rs.next()) {
					System.out.println(rs.getLong ("no"));
				System.out.print(" / " + rs.getString("title"));
				System.out.print(" / " + rs.getString("writer"));
				System.out.print(" / " + rs.getString("writeDate"));
				System.out.println(" / " + rs.getLong("hit"));
				}//end while
			}//end if
			
			System.out.println("6. 데이터 표시 성공");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("1. 드라이버 확인 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("2. 오라클 연결 실패 4. 실행 객제 생성 실패");
			System.out.println("또는 5. 실행오류");
		} finally {
			try {
				if(con != null) con.close();
				if(con != null) pstmt.close();
				if(con != null) rs.close();
				System.out.println("7. 객체 닫기 성공");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("7. 객체 닫기 오류");
			}
		}
		
		System.out.println("BoardLsitDAO.main() - 끝");
	
	} // end main()
} // end class
