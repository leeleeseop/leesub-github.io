package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardUpdateDAO2 {

	public static void main(String[] args) {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "java";
	String pw = "java";
	
	//필요데이터 선언
	String title  = "오늘";
	String content = "집";
	String writer = "가자";
	Long no = 1l;
	String userpw = "1111";
	
	try {
		
		//1.드라이버 확인
		Class.forName(driver);
		System.out.println("1.드라이버 확인 완료");
		
		//2. 오라클 접속 확인
		con = DriverManager.getConnection(url, id, pw);
		System.out.println("2.오라클 접속 완료");
		
		//3. SQL문 선언
		String sql = "update board set "
				+ "title = ?, content = ?, writer = ? "
				+ "where no = ? and pw = ?";
		System.out.println("3.sql : " + sql);
		
		
		//4. 객체선언 
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		pstmt.setString(3, writer);
		pstmt.setLong(4, no);
		pstmt.setString(5, userpw);
		System.out.println("4.자바 객체 선언 완료");
		
		//5. 실행객체에서 데이터 가져오기
		int result = pstmt.executeUpdate();
		System.out.println("5. 실행객체 데이터 가져오기 성공");
		
		//6.성공여부 확인
		if (result > 0) {
			System.out.println("6.업데이트 성공하였습니다");
		} else {
			System.out.println("6.업데이트 실패하였습니다");
		}
		
		
		
	}//end of try
	catch (Exception e) {
		e.printStackTrace();
	}finally {
		try{	
			if (con != null) con.close();
			if (pstmt != null) pstmt.close();
			System.out.println("7.객체 닫기 성공");
		}catch (Exception e) {
			System.out.println("7.객체 닫기 오류");
		}
	}
	
	
	
	}//end of main
	
}//end of class
