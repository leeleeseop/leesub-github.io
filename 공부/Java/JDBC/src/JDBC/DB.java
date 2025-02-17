package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {

	
	//DB 연결 관련 정보
	//DB접속 관련 -> DB 클래스에서만 존재 : con을 만들어서 사용
    private static final String DRIVER = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String ID = "java";
    private static final String PW = "java";
    private static boolean hasDriver = false; //불려지면 맨처음 실행된다
    
    static {
    	try {
    		//1.드라이버 확인 - 딱 한번만 사용
    		Class.forName(DRIVER);
    		System.out.println("1. 드라이버 확인 완료");
    		hasDriver = true;
    	}catch (Exception e) {
			e.printStackTrace();
			System.out.println("** 드라이버가 없으므로 프로그램을 종료합니다");
			System.exit(1);
    	}//end of catch
    } //end of static
    
    public static final Connection getConnection() throws SQLException {
    	return DriverManager.getConnection(URL, ID, PW);
    } //end of public static final
    
    // 필요한 객체 닫기( 자원을 반환 )
    public static final void close(Connection con, PreparedStatement pstmt)
    		throws SQLException {
    	
    	//7. 닫기
    	if(con != null) con.close();
    	if(pstmt != null) pstmt.close();
    }
    
	public static final void close(Connection con, PreparedStatement pstmt,
			ResultSet rs) throws SQLException{
		
		close(con, pstmt);
		if(rs != null) rs.close();
		
	}
	
	//sql query
    //1. list
	public static final String LIST = " select no, title, writer, writeDate, "  
			+ " to_char(writeDate, 'yyyy-mm-dd') writeDate, hit "
			+ " from board "
			+ " order by no desc ";
    
	
	//2.incerese
	public static final String INCREASE = "update board set hit = hit + 1"
			+ " where no = ? " ;
    
	
	//3. view
	public static final String VIEW = " select no, title, content, writer, writeDate, "
			+ " to_char(writeDate, 'yyyy-mm-dd') writeDate, hit "
			+ " from board "
			+ " where no = ? ";
   
	
	//4. write
	public static final String WRITE = "insert into board("
			+ "no, title, content, writer, pw)values(board_seq.nextval, ?, ?, ?, ?)";
    
	
	//5. update
	public static final String UPDATE = "update board set "
			+ " title = ? content = ? writer = ? "
			+ " where no = ? and pw = ? ";
	
	
	//6. delecte
	public static final String DELECTE = "delecte form board "
			+ " where no = ?  and pw = ? ";
}
