package com.webjjang.board.service;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.board.vo.BoardVO;
import com.webjjang.main.service.Service;

// BoardWriterService: 게시글 등록 처리를 담당
public class BoardWriterService implements Service {

	@Override
	public BoardVO service(Object obj) throws Exception {
		
		//넘어오는 데이터의 구조 obj - long[] : obj[0] - no, obj[1] - inc
		
		//DB board에서 조회수 1증가 하고 글보기 데이터 가져와서 리턴
		//1. 조회수 1증가 : inc ==1
		//DB 처리는 DAO에서 처리 BoardDAO.list()
		//BoardController -> (Execute로그 출력) -> BoardListService -> [BoardDAO.list()]
		return new BoardDAO().write((BoardVO)obj);
	}

}
