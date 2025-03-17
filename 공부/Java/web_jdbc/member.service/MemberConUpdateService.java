package com.webjjang.member.service;

import java.util.List;

import com.webjjang.main.service.Service;
import com.webjjang.member.dao.MemberDAO;
import com.webjjang.member.vo.MemberVO;

public class MemberConUpdateService implements Service {

	@Override
	public Integer service(Object obj) throws Exception {

	// obj는 회원 아이디 String으로 캐스팅
        return new MemberDAO().updateConDate((String)obj);
	}
}
