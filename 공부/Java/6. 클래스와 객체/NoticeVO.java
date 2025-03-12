package ch06class;

// 번호, 제목, 작성일 - 저장
public class NoticeVO {

	// private 변수 선언.
	private long no; // 공지사항 번호
	private String title; // 공지사항 제목
	private String writeDate; // 공지사항 작성일

	// getter & setter
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	
	@Override // 상속받은 메서드와 동일한지 확인해 주는 어노테이션
	public String toString() {
		return "NoticeVO [ no=" + no
				+ ", title=" + title
				+ ", writeDate=" + writeDate
				+ " ]";
	}
}
