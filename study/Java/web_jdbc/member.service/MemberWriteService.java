package com.webjjang.member.service;

import java.util.List;

import com.webjjang.main.service.Service;
import com.webjjang.member.dao.MemberDAO;
import com.webjjang.member.vo.MemberVO;

public class MemberWriteService implements Service {

	@Override
	public Integer service(Object obj) throws Exception {
		
        // MemberDAO 객체 생성
   
        // MemberDAO의 view 메서드 호출하여 결과를 반환
        return new MemberDAO().write((MemberVO)obj);
		//DB notice에서 리스트 쿼리 실행해서 데이터 가져오기 - 리턴
		//DB 처리는 DAO에서 처리 NoticeDAO.list()
		//NoticeController -> (Execute로그 출력) -> NoticeListService -> [NoticeDAO.list()]
		//if(inc == 1) newdao.increase(no);
		//return new MemberDAO().view((String)obj);
	}

}
