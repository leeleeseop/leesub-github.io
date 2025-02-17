package JDBC;

public class BoardWriterDAO extends DAO {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("JDBC.DB");
		
		try {
			
			con = DB.getConnection();
			System.out.println("2. 연결 성공");
					
			//3. sql - DB
			System.out.println("3. sql - " + DB.WRITE);
			
			//4. 실행객체 & 데이터세팅
			pstmt = con.prepareStatement(DB.WRITE);
			pstmt.setString(1,  "점심시간");
			pstmt.setString(2,  "점심시간이 길었으면");
			pstmt.setString(3,  "이이섭");
			pstmt.setString(4,  "1111");
			System.out.println("4. 실행객체 생성 완료");
			
			//5. 실행 int result = pstmt.executeUpdate()로 실행
			int result = pstmt.executeUpdate();
			System.out.println("5. 실행성공");
			
			//6. 데이터출력 또는 저장
			System.out.println("6. 일반게시판 글등록 성공 : result - " + result);
		
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
