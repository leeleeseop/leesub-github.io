package com.memorit.util.intercepter;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.memorit.member.vo.LoginVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class AuthrityInterceptor extends HandlerInterceptorAdapter {
	
	// url에 대한 권한 정보를 저장하는 Map
	private Map<String, Integer> authMap = new HashMap<>();

	// 이 클래스에서만 사용하는 변수
	private String url = null;
	// 페이지에 대한 등급 정보를 저장하는 메서드
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception {
		log.info("+[AuthrityInterceptor]------------------------------------------------+");	
		url = request.getServletPath();	
		log.info("+ Authotiry.preHandle.url : " + url);	
		// 로그인 객체 꺼내기	
		// 로그인 정보는 session에 있다. session이 안보인다. request에서 꺼낼 수 있다.	
		HttpSession session = request.getSession();	
		LoginVO vo = (LoginVO) session.getAttribute("login");	
		// 새로운 메시지 갯수를 가져오는 처리가 로그아웃 이상이 생긴경우 처리	
		// - 브라우에서 페이지 이동이 없이 가만히 놔둔 상태로 있거가 서버가 재실행이 세션이 사라진다. 	
		if(url.equals("/ajax/getMessageCnt.do") && vo == null)	
			throw new ServletException("DispatcherServlet - 메시지 갯수 가져 오는데 로그인이 안되어 있습니다.");	
		
		// url 정보가 authMap 있는지 확인 한다.
		// 데이터가 없으면(null이면) 권한 체크가 필요없는 페이지 요청입니다.
		Integer pageGradeNo = authMap.get(url);

		if (pageGradeNo == null) {
			log.info("AuthorityFilter.checkAuthority() - 권한이 필요없는 페이지 입니다.");
			return true;
		}

		// 여기서 부터를 로그인이 필요한 처리입니다. vo가 null이면 안된다.
//		if (vo == null) {
//			log.info("AuthorityFilter.checkAuthority() - 로그인이 필요합니다.");
//			response.sendRedirect(request.getContextPath() + "/member/loginForm.do");
//			return false;
//		}
//		log.info("AuthorityFilter.checkAuthority().pageGradeNo : " + pageGradeNo);
//		log.info("AuthorityFilter.checkAuthority().userGradeNo : " + vo.getGradeNo());
		// 권한이 없는 페이지 요청에 대한 처리
//		if (pageGradeNo > vo.getGradeNo()) {
//			log.info("AuthorityFilter.checkAuthority() - 권한이 없습니다.");
//			// 오류 페이지로 이동시킵니다.	
//			request.getRequestDispatcher("/WEB-INF/views/error/auth_error.jsp").forward(request, response);
//			return false;
//		}
//		log.info("AuthorityFilter.checkAuthority() - 권한이 있습니다.");		
		// 요청한 내용을 계속 진행
		return super.preHandle(request, response, handler);
	} // end of preHandle
}
