package Ch20JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardViewDAO {

	public static void main(String[] args) {
		
		// 필요한 객체 선언
		// 오라클 접속 정보 - 드라이버, 서버URL, 아이디, 비밀번호,
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "java";
		String pw = "java";
		
		//데이터 정보
		
		long no = 4;
		try {
			
			
			//1. 드라이버 확인
			Class.forName(driver);
			System.out.println("1. 드라이버 확인");
			
			
			//2. 연결
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("2. 연결 성공");
			
			
			//3. sql
			String sql = "select no, title, content, writer, writeDate, hit"
					+ " from board "
					+ " where no = ?";
			System.out.println("sql - " + sql);
			
			
			//4. 실행객체
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, no);
			System.out.println("4. 실행객체 생성완료");
			
			
			//5. 실행
			rs = pstmt.executeQuery();
			System.out.println("5. 실행완료");
			
			//6. 표시 또는 닫기
			if(rs != null && rs.next() ) {
				System.out.println("번호 : " + rs.getLong("no"));
				System.out.println("제목 : " + rs.getString("title"));
				System.out.println("내용 : " + rs.getString("content"));
				System.out.println("작성자 : " + rs.getString("writer"));
				System.out.println("작성일 : " + rs.getString("writeDate"));
				System.out.println("조회수 : " + rs.getLong("hit"));
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		
		} finally {
			try {
				
				//7.닫기
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
				System.out.println("7. 닫기 성공");
			} catch (Exception e) {
				e.printStackTrace();
		}
			
		}

	}// end of main()

}// end of class
