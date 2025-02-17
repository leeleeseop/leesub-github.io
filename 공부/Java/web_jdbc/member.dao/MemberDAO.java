package com.webjjang.member.dao;

import java.util.ArrayList;
import java.util.List;

import com.webjjang.notice.vo.NoticeVO;
import com.webjjang.main.controller.Main;
import com.webjjang.main.dao.DAO;
import com.webjjang.member.vo.LoginVO;
import com.webjjang.member.vo.MemberVO;
import com.webjjang.util.db.DB;


public class MemberDAO extends DAO {

	private long no;


	//필요한 객체 선언 - 상속 받아서 사용하자
	// 접속 정보 - DB 사용 - connection를 가져오게 하는 메서드
	
	//1.리스트 처리
	//noticeController -> (Execute로그 출력) -> noticeListService -> [noticeDAO.list()]
	public List<MemberVO> list() throws Exception{
		
		//결과를 저장할 수 있는 변수 선언
		 List<MemberVO> list = new ArrayList<>();
		
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
			//if(rs != null) {
				 while (rs.next()) {
			            MemberVO vo = new MemberVO();
			            vo.setId(rs.getString("id"));
			            vo.setName(rs.getString("name"));
			            vo.setBirth(rs.getString("birth"));
			            vo.setTel(rs.getString("tel"));
			            vo.setGradeName(rs.getString("gradeName"));
			            vo.setStatus(rs.getString("status"));
			            list.add(vo);
			        }
			//}//end of if
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
	
	

	//2-2 회원정보보기 처리
	//1.리스트 처리
	//noticeController -> (Execute로그 출력) -> noticeListService -> [noticeDAO.view()]
		public MemberVO view(String id)  throws Exception{
			//결과를 저장할 수 있는 변수 선언
			MemberVO vo = null;
			try {
				//1. 드라이버 확인
				//2. 연결
				con = DB.getConnection();
				//3. sql - 아래 list
				//4. 실행객체 & 데이터 세팅
				pstmt = con.prepareStatement(VIEW);
				pstmt.setString(1, Main.login.getId());
				//5. 실행
				rs = pstmt.executeQuery();
				//6. 표시 또는 담기
				if(rs != null && rs.next()) {
						// rs -> vo -> list
						// list가 null이면 생성해서 저장할 수 있게 해줘야한다 
						// rs - vo 
						vo= new  MemberVO();
						vo.setId(rs.getString("id"));
						vo.setName(rs.getString("name"));
						vo.setGender(rs.getString("gender"));
						vo.setTel(rs.getString("tel"));
						vo.setBirth(rs.getString("birth"));
						vo.setEmail(rs.getString("email"));
						vo.setRegdate(rs.getString("regDate"));
						vo.setConDate(rs.getString("conDate"));
						//vo.setPhoto(rs.getString("photo"));
						vo.setGradeNo(rs.getInt("gradeNo"));
						vo.setGradeName(rs.getString("gradeName"));

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
		
		
		
	//3.회원가입
	//1.리스트 처리
	//noticeController -> (Execute로그 출력) -> noticeViewService -> [noticeDAO.list()]
	public int write(MemberVO vo)  throws Exception{
				
				//결과를 저장할 수 있는 변수 선언.
				
				int result = 0;
				try {
					//1. 드라이버 확인
					
					//2. 연결
					con = DB.getConnection();
					
					//3. sql - 아래 list
					
					//4. 실행객체 & 데이터 세팅
					pstmt = con.prepareStatement(WRITE);
					pstmt.setString(1,  vo.getId());
					pstmt.setString(2,  vo.getPw());
					pstmt.setString(3,  vo.getName());
					pstmt.setString(4,  vo.getGender());
					pstmt.setString(5,  vo.getBirth());
					pstmt.setString(6,  vo.getTel());
					pstmt.setString(7,  vo.getEmail());
					pstmt.setString(8,  vo.getPhoto());


					
					//5. 실행 실행 update : sxecuteUpdate() - int 결과가 나옴
					result = pstmt.executeUpdate();
					
					//6. 표시 또는 담기
					System.out.println();
					System.out.println("    회원가입이 되었습니다.    ");
					

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
				return  result;
			}// end of public int increase
		
		
	//4 회원정보 수정		
	//4.회원정보 수정 처리
	//1.리스트 처리
	//noticeController -> (Execute로그 출력) -> noticeListService -> [noticeDAO.view()]
	public int update (MemberVO vo)  throws Exception {
					//결과를 저장할 수 있는 변수 선언
					int result = 0;
				
					try {
						//1. 드라이버 확인
						//2. 연결
						con = DB.getConnection();
						//3. sql - 아래 list
						//4. 실행객체 & 데이터 세팅
						pstmt = con.prepareStatement(UPDATE);
						pstmt.setString(1, vo.getName());
						pstmt.setString(2, vo.getGender());
						pstmt.setString(3, vo.getBirth());
						pstmt.setString(4, vo.getTel());
						pstmt.setString(5, vo.getEmail());
						pstmt.setString(6, vo.getPhoto());
						pstmt.setString(7, vo.getId());
						pstmt.setString(8, vo.getPw());

						//5. 실행
						result = pstmt.executeUpdate();
						//6. 표시 또는 담기
						if(result == 0) {	
							throw new Exception("예외 발생 : 글번호가 맞지 않습니다. 정보를 확인해 주세요");
							}//end of if
						}catch(Exception e ) {
							e.printStackTrace();
						  if(e.getMessage().indexOf("예외 발생") >= 0) throw e;
						  
						  else throw new Exception("예외 발생 : 회원정보수정 DB 처리 중 예외가 발생했습니다");
					}finally {
					}//7. 닫기
						DB.close(con, pstmt);	
					//결과 데이터를 리턴해 준다.
					return result;
				}//end of public view
					
	
	//5 탈퇴
	//5. 회원탈퇴 처리
	//1.리스트 처리
	//noticeController -> (Execute로그 출력) -> noticeListService -> [noticeDAO.view()]
	public int delete (MemberVO vo)  throws Exception{
						//결과를 저장할 수 있는 변수 선언
						int result = 0;
					
						try {
							//1. 드라이버 확인
							//2. 연결
							con = DB.getConnection();
							//3. sql - 아래 list
							//4. 실행객체 & 데이터 세팅
							pstmt = con.prepareStatement(DELETE);
							pstmt.setString(1, vo.getId());
							pstmt.setString(2, vo.getPw());
							//pstmt.setString(2, vo.getPw());
							//5. 실행
							result = pstmt.executeUpdate();
							//6. 표시 또는 담기
							if(result == 0) {	//아이디나 비번을 틀림
								throw new Exception("예외 발생 : 아이디나 비밀번호가 맞지 않습니다");
								}//end of if
							}catch(Exception e ) {
							  e.printStackTrace();
							  if(e.getMessage().indexOf("예외발생") >= 0 ) throw e;
							  
							  else throw new Exception("에외 발생 : 회원탈퇴 DB처리 중 오류 가 발생했습니다");
						}finally {
						}//7. 닫기
							DB.close(con, pstmt);	
						//결과 데이터를 리턴해 준다.
						return result;
					}//end of public view
								
	
	//6. 로그인처리
	//memberController -> (Execute로그 출력) -> memberloginService -> [memberDAO.login()]
			public LoginVO login(LoginVO loginvo)  throws Exception{
				//결과를 저장할 수 있는 변수 선언
				LoginVO vo = null;
				try {
					//1. 드라이버 확인
					//2. 연결
					con = DB.getConnection();
					//3. sql - 아래 list
					//4. 실행객체 & 데이터 세팅
					pstmt = con.prepareStatement(LOGIN);
					pstmt.setString(1, loginvo.getId());
					pstmt.setString(2, loginvo.getPw());
					//5. 실행
					rs = pstmt.executeQuery();
					//6. 표시 또는 담기
					if(rs != null && rs.next()) {
							// rs -> vo -> list
							// list가 null이면 생성해서 저장할 수 있게 해줘야한다 
							// rs - vo 
							vo= new  LoginVO();
							vo.setId(rs.getString("id"));
							vo.setName(rs.getString("name"));
							vo.setGradeNo(rs.getInt("gradeNo"));
							vo.setGradeName(rs.getString("gradeName"));
							//vo.setPhoto(rs.getString("photo"));
							vo.setNewMsgCnt(rs.getLong("newMsgCnt"));
						}if(vo == null) {// 아이디와 비밀번호가 맞지가 않아서 에외처리
							throw new Exception(" 예외 발생 : 아이디나 비밀번호가 맞지 않습니다. 정보를 학인해주세요");
						}
					}catch(Exception e ) {
						  e.printStackTrace();
						  if(e.getMessage().indexOf("예외발생") >= 0 ) throw e;
						  
						  else throw new Exception("에외 발생 : 로그인 DB 처리 중 예외가 발생했씁니다");
				}finally {
				}//7. 닫기
					DB.close(con, pstmt, rs);	
				//결과 데이터를 리턴해 준다.
				return vo;
			}//end of public view
			

			//7. 최근 접속 수행 처리
			//r -> (Execute로그 출력) -> noticeListService -> [noticeDAO.view()]
			public int updateConDate (String id)  throws Exception {
							//결과를 저장할 수 있는 변수 선언
							int result = 0;
						
							try {
								//1. 드라이버 확인
								//2. 연결
								con = DB.getConnection();
								//3. sql - 아래 list
								//4. 실행객체 & 데이터 세팅
								pstmt = con.prepareStatement(UPDATE_CONDATE);
								pstmt.setString(1, id);

								//5. 실행
								result = pstmt.executeUpdate();
								//6. 표시 또는 담기
								if(result == 0) {	
									throw new Exception("예외 발생 : 글번호가 맞지 않습니다. 정보를 확인해 주세요");
									}//end of if
								}catch(Exception e ) {
									e.printStackTrace();
								  if(e.getMessage().indexOf("예외 발생") >= 0) throw e;
								  
								  else throw new Exception("예외 발생 : 최근접속일 수정  DB 처리 중 예외가 발생했습니다");
							}finally {
							}//7. 닫기
								DB.close(con, pstmt);	
							//결과 데이터를 리턴해 준다.
							return result;
						}//end of public view
									
			
	//실행할 쿼리를 정의해 놓은 변수 선언
	final String LIST = "select id, name, to_char(m.birth, 'yyyy-mm-dd') birth , tel, gradeName, status "
			+ " from member m, grade g "
			+ " where (g.gradeNo = m.gradeNo)"
			+ " order by id desc";  //1차 정렬 2차 정렬
	
	final String VIEW = "SELECT m.id, m.name, m.gender,  to_char(m.birth, 'yyyy-mm-dd') birth , m.tel, m.email, " 
            + "TO_CHAR(m.regDate, 'yyyy-mm-dd') AS regDate, " 
            + "TO_CHAR(m.conDate, 'yyyy-mm-dd') AS conDate, m.gradeNo, g.gradeName " 
            + "FROM member m, grade g" 
            + " where (m.gradeNo = g.gradeNo) and (id = ?)";
            
	final String WRITE = "insert into member"
			+ "(id, pw, name, gender, birth, tel, email, photo )"
			+ "values(?, ?, ?, ?, ?, ?, ?, ?)";
	
	final String UPDATE = "update member "
			+ " set name = ?, gender = ?, birth = ?, tel = ?, "
			+ " email = ?, photo = ? "
			+ " where id = ? and pw = ?";

	final String DELETE = "update member set status = '탈퇴' "
			+ " where id = ? and pw = ? ";

	final String LOGIN = " select m.id, m.name, m.gradeNo, g.gradeName,  m.newMsgCnt "
			+ " from member m, grade g "
			+ " where (id = ? and pw = ? and status = '정상')"
			+ " and (g.gradeNo = m.gradeNo)";
	
	final String UPDATE_CONDATE = "update member "
			+ " set conDate = sysdate shere id = ? ";

	
}//end of class
