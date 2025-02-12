package JDBC;


public class BoardViewDAO extends DAO {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//드라이버 확인
		Class.forName("JDBC.DB");
		
		//DB 필요 객체 선언 -> DAO 클래스 상속 받아서 사용
		//DB접속 관련 -> DB 클래스에서만 존재 : con을 만들어서 사용
		
		long no = 1;
		
		try {
			//1.드라이버 확인 - 딱 한번만 사용 - DB 클래스의 static 초기화 불록에서 처리한다 
			//2.DB연결
			con = DB.getConnection();
			System.out.println("2. 연결완료 - con : " + con);
		
			
			//3 sql - DB클래스에 static final 변수로 선언
			System.out.println("3. SQL 작성 - " + DB.VIEW);
			
			
			//4. 실행객체
			pstmt = con.prepareStatement(DB.VIEW);
			pstmt.setLong(1, no);
			System.out.println("4. 실행객체 생성 완료");
			
			
			//5. 실행 - select : executeQuery() 실행
			rs = pstmt.executeQuery();
			System.out.println("5. 데이터 가져오기");
			
			
			//6. 데이터 표시 또는 담기 
			//rs -> vo -> ArrayList에 담아서 
			if(rs != null | rs.next()) {
			
					System.out.println(" 글번호 " + rs.getString("no"));
					System.out.println(" 제목 " + rs.getString("title"));
					System.out.println(" 작성자 " + rs.getString("writer"));
					System.out.println(" 내용 " + rs.getString("content"));
					System.out.println(" 작성일 " + rs.getString("writeDate"));
					System.out.println(" 조회수 " + rs.getLong("hit"));
					System.out.println("6. 데이터 표시 또는 담기 성공");
				}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//7. 닫기 - DB클래스
				DB.close(con, pstmt, rs);
				System.out.println("7. 닫기 성공");
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
