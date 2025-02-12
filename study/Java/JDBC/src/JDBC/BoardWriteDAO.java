package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardWriteDAO {
	public static void main(String[] args) {
	
		// 필요 객체 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 오라클 접속 데이터
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "java";
		String pw = "java";
		
		// 필요 데이터 선언
		String title = "지금은";
		String content = "JDBC 팀 실습중";
		String writer = "1팀";
		String userPW = "1111";
		// long no = 13;
		
		try {
			// 1. 드라이버 확인
			Class.forName(driver);
			System.out.println("1. 드라이버 확인");
			
			// 2. 오라클 접속 확인
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("2. 오라클 접속 확인");
			
			// 3. sql 문 작성
			String sql1 = "insert into board(no, title, content, writer, pw) "
					+ " values(board_seq.nextval, ?, ?, ?, ?)";
			// String sql2 = "update board set title = ?, content = ?, writer = ?"
			//		+ " where no = " + no + " and pw = " + userPW;
			System.out.println("3. sql : " + sql1);
			
			// 4. 실행 객체 만들기
			pstmt = con.prepareStatement(sql1);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, writer);
			pstmt.setString(4, userPW);
			System.out.println("4. 실행 객체 생성 완료");
			
			// 5. 실행 객체에서 데이터 가져오기
			rs = pstmt.executeQuery();
			System.out.println("5. 실행 객체 데이터 가져오기 성공");
					
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류");
		} finally {
			try {
				// 7. 객체 닫기
				if (con != null) con.close();
				if (pstmt != null) pstmt.close();
				if (rs != null) rs.close();
				System.out.println("7. 객체 닫기 성공");
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("7. 객체 닫기 오류");
			}
		}
		
	} // end of main
} // end of class
