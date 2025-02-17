package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardListDAO2 {

	public static void main(String[] args) {
		
		System.out.println("BoardLsitDAO.main() - 시작");
		
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "java";
		String pw = "java";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 생성완료");
			
			
			// 접속가능한지 확인여부
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("2. 접속 성공");
			
			
			//3. 실행쿼리
			String sql = "select no, title, writer, writeDate, hit"
					+ " from board "
					+ "order by no desc ";
			
			
			//4. 실행객체 sql 넣기와 데이터 세팅
			pstmt = con.prepareStatement(sql);
			System.out.println("4. 실행객체 생성 성공");
			
			
			//5, 실행해서 데이터 가져오기
			rs = pstmt.executeQuery();
			System.out.println("5. 실행성동 데이터 가져오기");
			
			
			//6. 데이터 표시 담기
			if(rs != null) {
				System.out.println("번호 / 제목 / 작성자 / 작성일 / 조회수");
				while(rs.next()) {
					System.out.println(rs.getLong("no"));
					System.out.print(" / "   + rs.getString("title"));
					System.out.print(" / "   + rs.getString("writer"));
					System.out.print(" / "   + rs.getString("writeDate"));
					System.out.println(" / " + rs.getLong("hit"));
				} //end of while 
			}//end of if
			
			System.out.println("6. 데이터 표시 성공");
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.err.println("1. 드라이버 확인 실패");
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("2. 오라클연결 실패 4. 실행객체 생성 실패");
			System.out.println("또는 5. 실행오류");
		}finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
				System.out.println("7. 객체 닫기 성공");
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("7. 객체 닫기 오류");
			}//end of catch2
		}//end of try
		
		System.out.println("BoardLsitDAO.main() - 끝");
	} //end of main
}//end of class
