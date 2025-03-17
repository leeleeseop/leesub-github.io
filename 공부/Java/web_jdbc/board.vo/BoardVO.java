package com.webjjang.board.vo;

public class BoardVO {

	//private 변수
	// 글번호
	private Long no;
	// 제목
	private String title;
	// 내용
	private String content;	
	// 작성자
	private String writer;
	// 작성일
	private String writeDate;
	// 조회수
	private Long hit;
	// 비밀번호
	private String pw;
	
	//setter, getter
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public Long getHit() {
		return hit;
	}
	public void setHit(Long hit) {
		this.hit = hit;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	//toString - 데이터 확인용
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", writeDate=" + writeDate + ", hit="
				+ hit + ", pw=" + pw + "]";
	}

	
}
