package com.webjjang.member.controller;

import java.util.List;

import com.webjjang.main.controller.Main;
import com.webjjang.member.service.MemberConUpdateService;
import com.webjjang.member.service.MemberDeleteService;
import com.webjjang.member.service.MemberListService;
import com.webjjang.member.service.MemberLoginService;
import com.webjjang.member.service.MemberUpdateService;
import com.webjjang.member.service.MemberViewService;
import com.webjjang.member.service.MemberWriteService;
import com.webjjang.member.vo.LoginVO;
import com.webjjang.member.vo.MemberVO;
import com.webjjang.notice.service.NoticeDeleteService;
import com.webjjang.notice.service.NoticeListService;
import com.webjjang.notice.service.NoticeUpdateService;
import com.webjjang.notice.service.NoticeViewService;
import com.webjjang.notice.service.NoticeWriterService;
import com.webjjang.notice.vo.NoticeVO;
import com.webjjang.util.exe.Execute;
import com.webjjang.util.io.In;
import com.webjjang.util.io.MemberPrint;
import com.webjjang.util.io.NoticePrint;

public class MemberController {

	public void  excute( ) {
		//게시판 기능무한 반복
		while(true) {
			
			Main.loginInto();
			System.out.println();
			System.out.println("               회원관리               ");
			//메뉴 출력 - 리스트, 글보기. 글등록, 글수정, 글삭제
			System.out.println("********************************");
			System.out.println("**1.회원리스트, 2.회원정보보기, 3.회원가입**");
			System.out.println("**4.정보수정, 5.회원탈퇴, 6."+((Main.login == null)?"로그인":"로그아웃")+"**");
			System.out.println("********************************");
			
			Object result = null;
			
			//메뉴입력
			String menu = In.getStr("메뉴");
			
			
			//입력받는 데이터 
			Long no = 0L;
			
			
			try {
				//메뉴처리 : CRUD DB 처리 - Controller - Service - DAO
				switch (menu) {
				

				case "1":
					//[NoticeController] - (Execute) - NoticeListService - NoticeDAO.list()
					System.out.println("1.회원 리스트");
					// DB에서 데이터 가져오기 - 가져온 데이터는 List<NoticeVO>
					result = Execute.execute(new MemberListService(), null);
					// 가져온 데이텉 출력하기
					new MemberPrint().print((List<MemberVO>) result);
					break;
				
					
				
				case "2":
					System.out.println("2.내 정보 보기");
					if(Main.login == null ) throw new Exception("예외 발생 : 로그인이 필요합니다");
					//1. 내 정보 보기 데이터 가져오기 : 아이디, 이름, 생년월일, 이메일, 가입일, 최근접속일
					//사진, 등급번호, 등급명
					//사용자가 로그인한 아이디 정보를 사용한다
					//일반 회원은 로그인한 아이디 정보를 사용한다 . 관리자는 직접입력
					String id = (Main.login.getGradeNo()==9)?In.getStr("아이디"):Main.login.getId();
					// 전달데이터 - 글번호 , 조회수, 증가 여부(1증가, 0:증가 안함) : 배열 또는 Map
					result = Execute.execute(new MemberViewService(), id);
					//게시판 글보기 출력 : NoticePrint
					new MemberPrint().print((MemberVO)result);
					break;
				
					
				
				case "3":
					System.out.println("3.회원가입");			
					// 데이터 수집 - 사용자 : 아이디, 비밀번호, 이름, 성별, 생년월일, 연락처, 이메일, 사진
					id = In.getStr("아이디");
					String pw = In.getStr("비밀번호");
					String name = In.getStr("이름");
					String gender = In.getStr("성별(남/여)");
					String birth = In.getStr("생년월일(YYYY-MM-DD");
					String tel = In.getStr("연락처");
					String email = In.getStr("이메일");
					String photo= In.getStr("사진");
					//변수로 만든것을 vo로 저장하고 Service
					MemberVO vo = new MemberVO();
					vo.setId(id);
					vo.setPw(pw);
					vo.setName(name);
					vo.setGender(gender);
					vo.setBirth(birth);
					vo.setTel(tel);
					vo.setEmail(email);
					vo.setPhoto(photo);
					
					// [NoticeController] - NoticeWeireService - NoticeDAO.write(v0)					
					result = Execute.execute(new MemberWriteService(), vo);
					break;
				
				
					
				case "4":
					System.out.println("4.회원정보 수정");
					if(Main.login == null ) throw new Exception("예외 발생 : 로그인이 필요합니다");
					//1. 내 정보 보기 데이터 가져오기 : 아이디, 이름, 생년월일, 이메일, 가입일, 최근접속일
					//사진, 등급번호, 등급명
					//사용자가 로그인한 아이디 정보를 사용한다
					//일반 회원은 로그인한 아이디 정보를 사용한다 . 관리자는 직접입력
					id = Main.login.getId();
					//전달 데이터 id 
					vo = (MemberVO) Execute.execute(new MemberViewService(), id);
					
					//정보 수정과 DB처리
					update(vo);
					break;
				
				
				case "5":
					System.out.println("5.회원탈퇴 : 상태 - 탈퇴로 수정");
					//데이터 수집 - db에서 실행에 필요한 데이터 - 글번호 비밀번호 - NoticeVO
					id = In.getStr("아이디");
					pw = In.getStr("비밀번호");
					
					vo = new MemberVO();
					vo.setId(id);
					vo.setPw(pw);
					
					//DB 처리 - 탈ㄹ퇴 
					Execute.execute(new MemberDeleteService(), vo);
					
					//로그아웃
					Main.login = null;
					
					//db처리 - 탈퇴 처리 또는 로그아웃
					System.out.println();
					System.out.println("****************************************");
					System.out.println("      회원탈퇴 처리가 되었습니다     ");
					System.out.println("         로그아웃 되었습니다     ");
					System.out.println("****************************************");
					break;
				
					
					
				case "6"://로그인 또는 로그아웃
					System.out.println("6. 로그인 / 로그아웃");
					if(Main.login == null){//로그인을 해라
					//데이터 수집 - db에서 실행에 필요한 데이터 - 글번호 비밀번호 - NoticeVO
					id = In.getStr("아이디");
					pw = In.getStr("비밀번호");
					LoginVO loginVO = new LoginVO();
					loginVO.setId(id);
					loginVO.setPw(pw);
					
					
					//db처리 & 로그인 처리
					Main.login
					= (LoginVO) Execute.execute(new MemberLoginService(), loginVO);
					System.out.println();
					System.out.println("****************************************");
					System.out.println("로그인이 되었습니다.");
					System.out.println("****************************************");
					
					//최근 접속일수정 - 로그인이 되어 있는 경우만 
					if(Main.login != null) {
						new MemberConUpdateService().service(Main.login.getId());
					}
					
					} else {
						//로그인 처리
						Main.login = null;
						System.out.println();
						System.out.println("****************************************");
						System.out.println("** 로그아웃되었습니다. **");
						System.out.println("****************************************");
					}
					break;
				
				
				
				case "0":
					
					return;
	
				default:
					System.out.println("#######################################");
					System.out.println("##잘못된 메뉴를 선택하셨습니다.##");
					System.out.println("##[0~5, 0] 중에서 입력하셔야 합니다.##");				
					System.out.println("#######################################");
					break;
				}//end of seitch
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println();
				System.out.println("%$#$%$#%#%#%$#$%#%$%$#%$#%#%$#%#%#%#%$#%#%$#%#%%$");
				System.out.println("%$#<< 오류 출력%%$");
				System.out.println("%$#$%$#%#%#%$#$%#%$%$#%$#%#%$#%#%#%#%$#%#%$#%#%%$");
				System.out.println("타입 : " + e.getClass().getSimpleName());
				System.out.println("내용 : " + e.getMessage());
				System.out.println("조치 : 데이터를 확인 후 다시 실행해 보세요.");
				System.out.println("    : 계속 오류가 나면 전산담당자에게 연락하세요.");			
				System.out.println("%$#$%$#%#%#%$#$%#%$%$#%$#%#%$#%#%#%#%$#%#%$#%#%%$");
			}
		}// end of while
	}//end of public
	
	// call by reference -> 주소가 전달된다 안에서 변경하면 밖에서도 변경이 된다
	private void update(MemberVO vo) throws Exception {
	
		while(true) {
			new MemberPrint().print(vo);
			System.out.println();
			System.out.println("-------------------------------------");
			System.out.println("1.이름, 2.성별, 3.생년월일 4.연락처");
			System.out.println("5.이메일 6.사진, 9.수정취소, 0.수정완료");
			System.out.println("-------------------------------------");
			String item = In.getStr("수정 항목 선택");
			switch(item) {
				case "1" : {
					vo.setId(In.getStr("이름"));
					break;
				}
				case "2" : {
					vo.setGender(In.getStr("성별 (남/여)"));
					break;
				}
				case "3" : {
					vo.setBirth(In.getStr("생년월일"));
					break;
				}
				case "4" : {
					vo.setTel(In.getStr("연락처"));
					break;
				}
				case "5" : {
					vo.setEmail(In.getStr("이메일"));
					break;
				}
				case "6" : {
					vo.setPhoto(In.getStr("사진"));
					break;
				}

				case "9" : {
					System.out.println();
					System.out.println("**** 수정이 최소 되었습니다****");
					return;
				}
				case "0" : {
					
					//본인확인용 비밀번호 찾기	
					vo.setPw(In.getStr("본인 확인용 비밀번호"));
					Execute.execute(new MemberUpdateService(), vo);
					return;
					
					
				}
				default:
					System.out.println("*************************");
					System.out.println("** 잘못된 항목 번호 선택하셨습니다");
					System.out.println("** [1~3, 9, 0]번호를 선택하세요");
					System.out.println("*************************");
			}
		}//end of while
		// DB에 데이터 수정하기 - NoticeUpdateService

	}

		

}//end of class
