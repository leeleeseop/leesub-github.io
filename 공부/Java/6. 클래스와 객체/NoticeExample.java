package ch06class;

public class NoticeExample {

	public static void main(String[] args) {
		
		// 공지사항 데이터
		// 번호 -101, 제목 - "데이터베이스 구현 평가", 작성일 - "2024.04.23"
		NoticeVO vo = new NoticeVO();
		
		// 데이터 저장 - setter 사용
		vo.setNo(101);
		vo.setTitle("데이터베이스 구현 평가");
		vo.setWriteDate("2024.04.23");
		
		// 저장된 데이터 확인
		System.out.println(vo.toString()); // vo 안에 toString()를 자동으로 호출한다.
		System.out.println("번호 : " + vo.getNo());
		System.out.println("제목 : " + vo.getTitle());
		System.out.println("작성일 : " + vo.getWriteDate());
	}
	
}
