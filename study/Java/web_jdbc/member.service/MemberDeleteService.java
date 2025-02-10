package com.webjjang.member.service;

import com.webjjang.main.service.Service;
import com.webjjang.member.dao.MemberDAO;
import com.webjjang.member.vo.MemberVO;

public class MemberDeleteService implements Service {

	@Override
	public Integer service(Object obj) throws Exception {
		
		return new MemberDAO().delete((MemberVO)obj);
	}

}
