package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class BoardWriterDAO2 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		//오라클 접속 데이터
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "java";
		String pw = "java";
		
		//필요 데이터 선언
		String title = "지금"; 
		String content = "학원";
		String writer = "이섭";
		String javapw = "1111";
		
		
		try {
			//1.드라이버 확인 
			Class.forName(driver);
			System.out.println("드라이버 확인 완료");
			
			//2.오라클 접속 확인
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("오라클 접속 완료");
			
			//3.sql문 선언
			String sql = " insert into board (no, title, content, writer, pw )"
					+ "values(board_seq.nextval, ?, ?, ?, ?)";
			System.out.println("3.sql :" + sql);
			
			//4. 객체선언 
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title); 
			pstmt.setString(2, content); 
			pstmt.setString(3, writer); 
			pstmt.setString(4, javapw);
			System.out.println("자바 실행객체 성공완료");
			
			//5. 실행객체에서 데이터 가져오기
			int result =  pstmt.executeUpdate();
			System.out.println("5. 실행객체 데이터 가져오기 성공");
			
			//6.성공여부 확인
			System.out.println("6. 글등록 성공 " + result);

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류");
		}finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				//if( != null) rs.close();
				System.out.println("7. 객체닫기 성공");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("7. 객체닫기 실패");
			}
		}	
	}
}
