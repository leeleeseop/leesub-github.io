package JDBC;

public class BoardIncreaseDAO extends DAO {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("JDBC.DB");
		
		//조회수 1 증가 시키는 글번호
		long no = 1L;
		
		
		try {
			
			con = DB.getConnection();
			System.out.println("2. 연결 성공");
					
			//3. sql - DB
			System.out.println("3. sql - " + DB.INCREASE);
			
			//4. 실행객체 & 데이터세팅
			pstmt = con.prepareStatement(DB.INCREASE);
			pstmt.setLong(1,  no);
			System.out.println("4. 실행객체 생성 완료");
			
			//5. 실행 int result = pstmt.executeUpdate()로 실행
			int result = pstmt.executeUpdate();
			System.out.println("5. 실행성공");
			
			//6. 데이터출력 또는 저장
			System.out.println("6. 조회수 1 증가 성공 : result - " + result);
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				//7. 닫기 - DB
				DB.close(con, pstmt, rs);
				System.out.println("7. 닫기 성공");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
