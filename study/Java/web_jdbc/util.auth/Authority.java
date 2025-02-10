package com.webjjang.util.auth;

import java.util.HashMap;
import java.util.Map;

import com.webjjang.main.controller.Main;
import com.webjjang.main.service.Service;

public class Authority {

	//Service에 따른 권한 저장Map
	private static Map<String, Integer> authMap = new  HashMap<String,Integer>();
	
	static {
		//회원관리 
		//관리자가 할수있는 : 리스트, 회원상태변경, 회원등급변경
		//회원이 할수있는거 : 내정보보기, 내정보수정, 회원탈퇴, 로그아웃
		authMap.put("MemberListService", 9);
		authMap.put("MemberViewService", 1);
	}
	
	public static void checkAuth(Service service) throws Exception{
		Integer level = authMap.get(service.getClass().getSimpleName());
		if(level != null) {
			//로그인이 되어 있어야 만 한다
			if(Main.login == null)
				throw new Exception("예외 발생 : 로그인을 하셔야합니다.");
			//로그인한 권한이 낮은 경우 처리
			System.out.println("level : " + level + ", gradeNo : " + Main.login.getGradeNo());
			if(level > Main.login.getGradeNo())
				throw new Exception("예외 발생 : 처리할 권한이 없습니다.");
		}
	}
}
