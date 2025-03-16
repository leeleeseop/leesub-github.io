package Ch20JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardLisDAO {

	public static void main(String[] args) {
		
		
		System.out.println("BoardLsitDAO.main() - 시작");
		
		// jdbc에 필요한 객체 선언 
		Connection  con = null; // 연결 - 서버, 아이디, 비밀번호
		PreparedStatement pstmt = null; //실행 객체 - sql과 데이터
		ResultSet rs = null; //항목이나 위치정보 데이터를 가져왔을때 결과 저장 객체 - select
		
		
		try {
			// 드라이버 확인과 필요한 객체 로딩 
			// project 시작에서 딱 한번만 확인하면 된다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 확인 완료");
			// 2. 접속 가능한지 확인 - 연결 확인
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"java", "java"); 
			System.out.println("2. 오라클 연결 성공 ");
			
			
			//3. 실행쿼리
			String sql = "select no, title, writer, writeDate, hit"
					+ " from board"
					+ " order by no desc";
			System.out.println("3.sql - " + sql );
			
			
			//4. 실행 객체 sql 넣기와 데이터 세팅
			pstmt = con.prepareStatement(sql);
			System.out.println("4. 싱행 객체 생성 완료");
			
			
			// 5. 실행해서 데이터 가져오기 - select
			rs = pstmt.executeQuery();
			System.out.println("5. 실행성공 데이터 가죠오기");
			
			
			//6. 데이터 표시나 담기 - BoardVO에 담는다. 컬레션
			//지금은 바로 출력해보자 
			if(rs != null) {
				//rs.next() -> 다음 데이터로 포인터를 미동시켜준다 
				//다음 데이터가 없으면 false를 리턴해 준다 while문 빠져나감 
				System.out.println("번호/ 제목 / 작성자 / 작성일 / 조회수");
				while(rs.next()) {
					// 각 컬럼의 값을 출력
					System.out.print(rs.getLong("no"));
					System.out.print(" / " + rs.getString("title"));
					System.out.print(" / " + rs.getString("writer"));
					System.out.print(" / " + rs.getString("writeDate"));
					System.out.println(" / " + rs.getLong("hit"));	
				}// end of wrile	
		}//end of if	
		System.out.println("6. 데이터 표시 성공");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("1. 드라이버 확인 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("2. 오라클 연결 실패 4. 실행 객체 생성 실패");
			System.out.println("또는 5. 실행 오류");
		} finally {
			try {
				//7. 닫기
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
	}

}
