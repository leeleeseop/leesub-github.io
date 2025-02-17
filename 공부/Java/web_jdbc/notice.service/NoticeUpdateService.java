package com.webjjang.notice.service;



import com.webjjang.notice.dao.NoticeDAO;
import com.webjjang.notice.vo.NoticeVO;
import com.webjjang.main.service.Service;

public class NoticeUpdateService implements Service {

	@Override
	public Integer service(Object obj) throws Exception {
		
		//넘어오는 데이터의 구조 obj - long[] : obj[0] - no, obj[1] - inc
		
		//DB notice에서 조회수 1증가 하고 글보기 데이터 가져와서 리턴
		//1. 조회수 1증가 : inc ==1
		//DB 처리는 DAO에서 처리 NoticeDAO.list()
		//NoticeController -> (Execute로그 출력) -> NoticeListService -> [NoticeDAO.list()]
		return new NoticeDAO().update((NoticeVO)obj);
	}

}
