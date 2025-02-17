package com.webjjang.util.io;

import java.util.List;

import com.webjjang.board.vo.BoardVO;
import com.webjjang.member.vo.MemberVO;

public class MemberPrint {

	//게시판 리스트  출력메서드 
	public void print(List<MemberVO> list) {
		System.out.println();
		System.out.println("<<-------------회원리스트 ----------->>>");
		System.out.println("<<----------------------------------------------->>>");
		System.out.println("아이디  /       이름       /  생년월일  /  연락처  /  등급명  /  상태   ");
		System.out.println("<<----------------------------------------------->>>");
		if(list == null) {//데이터가 없으면 null이 된다.
			System.out.println("***데이터가 존재하지 않습니다***");
		}else {
			for(MemberVO vo : list) {
				System.out.print(" " + vo.getId());
				System.out.print(" / " + vo.getName());
				System.out.print(" / " + vo.getBirth());
				System.out.print(" / " + vo.getTel());
				System.out.print(" / " + vo.getGradeName());
				System.out.print(" / " + vo.getStatus());
				System.out.print(" / " + vo.getEmail());
				System.out.print(" / " + vo.getRegdate());
				System.out.print(" / " + vo.getConDate());
				System.out.print(" / " + vo.getNewMsgCnt());
				//System.out.print(" / " + vo.getPhoto());
				System.out.print(" / " + vo.getGender());
				System.out.print(" / " + vo.getPw());
				System.out.print(" / " + vo.getGradeNo());
				System.out.println();
			}
		}
		System.out.println("<<----------------------------------------------->>>");
	}
	
	//게시판 글보기  출력메서드 
	public void print(MemberVO vo) {
		System.out.println();
		System.out.println("<<------------- 회원정보 보기 ----------->>>");
		System.out.println("<<----------------------------------------------->>>");
		System.out.println("+ 아이디 : " + vo.getId());
		System.out.println("+ 이름 : " + vo.getName());
		System.out.println("+ 생년월일 : " + vo.getBirth());
		System.out.println("+ 연락처 : " + vo.getTel());
		System.out.println("+ 등급명 : " + vo.getGradeName());
		System.out.println("+ 성별 : " + vo.getGender());
		System.out.println("+ 이메일 : " + vo.getEmail());
		System.out.println("+ 가입일 : " + vo.getRegdate());
		System.out.println("+ 최근 접속일 : " + vo.getConDate());
		//System.out.println("+ 사진 : " + vo.getPhoto());
		System.out.println("+ 등급번호 : " + vo.getGradeNo());
	}
	
	
}
