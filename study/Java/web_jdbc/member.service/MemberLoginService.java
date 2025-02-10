package com.webjjang.member.service;

import com.webjjang.member.dao.MemberDAO;
import com.webjjang.member.vo.LoginVO;
import com.webjjang.main.service.Service;

public class MemberLoginService implements Service {

	@Override
	public LoginVO service(Object obj) throws Exception {
		// DB 처리는 DAO에서 처리 - MemberDAO.view() : obj == no
		// MemberController - (Execute) - [MemberListService] - MemberDAO.view()
		return new MemberDAO().login((LoginVO)obj);
  }
}
