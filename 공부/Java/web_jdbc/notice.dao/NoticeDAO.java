package com.webjjang.notice.dao;

import java.util.ArrayList;
import java.util.List;

import com.webjjang.notice.vo.NoticeVO;
import com.webjjang.main.dao.DAO;
import com.webjjang.util.db.DB;


public class NoticeDAO extends DAO {

	private long no;


	//필요한 객체 선언 - 상속 받아서 사용하자
	// 접속 정보 - DB 사용 - connection를 가져오게 하는 메서드
	
	//1.리스트 처리
	//noticeController -> (Execute로그 출력) -> noticeListService -> [noticeDAO.list()]
	public List<NoticeVO> list()  throws Exception{
		
		//결과를 저장할 수 있는 변수 선언
		List<NoticeVO> list = null;
		
		try {
			
			//1. 드라이버 확인
			//2. 연결
			con = DB.getConnection();
			//3. sql - 아래 list
			//4. 실행객체 & 데이터 세팅
			pstmt = con.prepareStatement(LIST);
			//5. 실행
			rs = pstmt.executeQuery();
			//6. 표시 또는 담기
			if(rs != null) {
				while(rs.next()) {
					// rs -> vo -> list
					// list가 null이면 생성해서 저장할 수 있게 해줘야한다 
					if(list == null) list = new ArrayList<>();
					// rs - vo 
					NoticeVO vo = new NoticeVO();
					vo.setNo(rs.getLong("no"));
					vo.setTitle(rs.getString("title"));
					vo.setStartDate(rs.getString("startDate"));
					vo.setEndDate(rs.getString("endDate"));
					vo.setUpdateDate(rs.getString("updateDate"));
					//vo - > list에 담는다
					list.add(vo);
				}//end of while
			}//end of if
		}catch(Exception e ) {
			e.printStackTrace();
			throw e;
		}finally {	
			//7. 닫기
			DB.close(con, pstmt, rs);
		}
		//결과 데이터를 리턴해 준다.
		return list;
	}//end of public List<noticeVO> list()
	
	

	//2-2 글보기에 대한 처리
	//1.리스트 처리
	//noticeController -> (Execute로그 출력) -> noticeListService -> [noticeDAO.view()]
		public NoticeVO view(Long no)  throws Exception{
			//결과를 저장할 수 있는 변수 선언
			NoticeVO vo = null;
			try {
				//1. 드라이버 확인
				//2. 연결
				con = DB.getConnection();
				//3. sql - 아래 list
				//4. 실행객체 & 데이터 세팅
				pstmt = con.prepareStatement(VIEW);
				pstmt.setLong(1, no);
				//5. 실행
				rs = pstmt.executeQuery();
				//6. 표시 또는 담기
				if(rs != null && rs.next()) {
						// rs -> vo -> list
						// list가 null이면 생성해서 저장할 수 있게 해줘야한다 
						// rs - vo 
						vo= new  NoticeVO();
						vo.setNo(rs.getLong("no"));
						vo.setTitle(rs.getString("title"));
						vo.setStartDate(rs.getString("content"));
						vo.setContent(rs.getString("startDate"));
						vo.setEndDate(rs.getString("endDate"));
						vo.setUpdateDate(rs.getString("updateDate"));
						vo.setWriteDate(rs.getString("writeDate"));

					}//end of if
				}catch(Exception e ) {
				  e.printStackTrace();
				  throw e;
			}finally {
			}//7. 닫기
				DB.close(con, pstmt, rs);	
			//결과 데이터를 리턴해 준다.
			return vo;
		}//end of public view
		
		
		
	//3.글등록
	//1.리스트 처리
	//noticeController -> (Execute로그 출력) -> noticeViewService -> [noticeDAO.list()]
	public NoticeVO write(Object vo)  throws Exception{
				
				//결과를 저장할 수 있는 변수 선언.
				
				int result = 0;
				try {
					//1. 드라이버 확인
					
					//2. 연결
					con = DB.getConnection();
					
					//3. sql - 아래 list
					
					//4. 실행객체 & 데이터 세팅
					pstmt = con.prepareStatement(WRITE);
					pstmt.setString(1, ((NoticeVO) vo).getTitle());
					pstmt.setString(2, ((NoticeVO) vo).getContent());
					pstmt.setString(3, ((NoticeVO) vo).getStartDate());
					pstmt.setString(4, ((NoticeVO) vo).getEndDate());

					
					//5. 실행 실행 update : sxecuteUpdate() - int 결과가 나옴
					result = pstmt.executeUpdate();
					
					//6. 표시 또는 담기
					System.out.println();
					System.out.println("*** 공지 등록이 완료 되었습니다.");
					

				}catch(Exception e ) {
					e.printStackTrace();
					//특별한 예외는 그냥 전달한다
					if(e.getMessage().indexOf("예외발생") >= 0) throw e;
					//그외 처리 중 나타나는 오류에 대해서 시용자가 볼수 있는 예외로 만들어 전달한다.
					else throw new Exception("예외 발생 : 공지 등록 DB 처리 중 예외가 발생했습니다.");
				}finally {	
					//7. 닫기
					DB.close(con, pstmt);
				}
				
				
				//결과 데이터를 리턴해 준다.
				return  null;
			}// end of public int increase
		
		
			
	//4.업데이트
	//1.리스트 처리
	//noticeController -> (Execute로그 출력) -> noticeListService -> [noticeDAO.view()]
	public int update (NoticeVO vo)  throws Exception{
					//결과를 저장할 수 있는 변수 선언
					int result = 0;
				
					try {
						//1. 드라이버 확인
						//2. 연결
						con = DB.getConnection();
						//3. sql - 아래 list
						//4. 실행객체 & 데이터 세팅
						pstmt = con.prepareStatement(UPDATE);
						pstmt.setString(1, vo.getTitle());
						pstmt.setString(2, vo.getContent());
						pstmt.setString(3, vo.getStartDate());
						pstmt.setString(4, vo.getEndDate());
						pstmt.setLong(5, vo.getNo());
						//5. 실행
						result = pstmt.executeUpdate();
						//6. 표시 또는 담기
						if(result == 0) {	
							throw new Exception("예외 발생 : 글번호가 맞지 않습니다. 정보를 확인해 주세요");
							}//end of if
						}catch(Exception e ) {
						  e.printStackTrace();
						  throw e;
					}finally {
					}//7. 닫기
						DB.close(con, pstmt, rs);	
					//결과 데이터를 리턴해 준다.
					return result;
				}//end of public view
					
				
	//5. 삭제
	//1.리스트 처리
	//noticeController -> (Execute로그 출력) -> noticeListService -> [noticeDAO.view()]
	public int delete (Long no)  throws Exception{
						//결과를 저장할 수 있는 변수 선언
						int result = 0;
					
						try {
							//1. 드라이버 확인
							//2. 연결
							con = DB.getConnection();
							//3. sql - 아래 list
							//4. 실행객체 & 데이터 세팅
							pstmt = con.prepareStatement(DELETE);
							pstmt.setLong(1, no);
							//pstmt.setString(2, vo.getPw());
							//5. 실행
							result = pstmt.executeUpdate();
							//6. 표시 또는 담기
							if(result == 0) {	//글번호가 존재하지 않거나 비번 틀림 -> 예외로 처리한다 
								throw new Exception("예외 발생 : 글번호가 맞지 않습니다. 정보를 확인해 주세요");
								}//end of if
							}catch(Exception e ) {
							  e.printStackTrace();
							  if(e.getMessage().indexOf("예외발생") >= 0 ) throw e;
							  
							  else throw new Exception("에외 발생 : 게시판 글삭제 DB 처리 중 예외가 발생했씁니다");
						}finally {
						}//7. 닫기
							DB.close(con, pstmt);	
						//결과 데이터를 리턴해 준다.
						return result;
					}//end of public view
								
				

	//실행할 쿼리를 정의해 놓은 변수 선언
	final String LIST = "select no, title, "
			+ " to_char(startDate, 'yyyy-mm-dd') startDate, "
			+ " to_char(endDate, 'yyyy-mm-dd') endDate, "
			+ " to_char(updateDate, 'yyyy-mm-dd') updateDate "
			+ " from notice "
			+ " order by updateDate desc, no desc";  //1차 정렬 2차 정렬
	
	final String VIEW = " select no, title, content,"
			+ " to_char(startDate, 'yyyy-mm-dd') startDate, "
			+ " to_char(endDate, 'yyyy-mm-dd') endDate, "
			+ " to_char(writeDate, 'yyyy-mm-dd') writeDate,"
			+ " to_char(updateDate, 'yyyy-mm-dd') updateDate "
			+ " from notice "
			+ " where no = ? ";
	
	final String WRITE = "insert into notice("
			+ "no, title, content, startDate, endDate)"
			+ "values(notice_seq.nextval, ?, ?, ?, ?)";

	final String UPDATE = "update notice "
			+ " set title = ?, content = ?, startDate = ?, endDate = ? "
			+ " where no = ?";
	
	final String DELETE = "delete from notice "
			+ " where no = ? ";


}//end of class
