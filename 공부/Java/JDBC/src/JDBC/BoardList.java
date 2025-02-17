package JDBC;


public class BoardList extends DAO {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//드라이버 확인
		Class.forName("JDBC.DB");
		
		//DB 필요 객체 선언 -> DAO 클래스 상속 받아서 사용
	
		//DB접속 관련 -> DB 클래스에서만 존재 : con을 만들어서 사용
		
		
		try {
			//1.드라이버 확인 - 딱 한번만 사용 - DB 클래스의 static 초기화 불록에서 처리한다 
			//2.DB연결
			con = DB.getConnection();
			System.out.println("2. 연결완료 - con : " + con);
			
			
			//3 sql - DB클래스에 static final 변수로 선언
			System.out.println("3. SQL 작성 - " + DB.LIST);
			
			
			//4. 실행객체
			pstmt = con.prepareStatement(DB.LIST);
			System.out.println("4. 실행객체 생성 완료");
			
			
			//5. 실행 - select : executeQuery() 실행
			rs = pstmt.executeQuery();
			System.out.println("5. 데이터 가져오기");
			
			
			//6. 데이터 표시 또는 담기 
			//rs -> vo -> ArrayList에 담아서 
			if(rs != null) {
				System.out.println("rs null 아님");
				System.out.println("번호 / 제목 / 작성자 / 작성일 / 조회수");
				while(rs.next()) { //있는 데이터 모두 처리
					System.out.print(rs.getLong("no"));
					System.out.print(" / " + rs.getString("title"));
					System.out.print(" / " + rs.getString("writer"));
					System.out.print(" / " + rs.getString("writeDate"));
					System.out.println(" / " + rs.getLong("hit"));
				}
				System.out.println("6. 데이터 표시 또는 담기 성공");
			}
			
		}catch (Exception e) {
			
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
