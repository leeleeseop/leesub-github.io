package ch05ref;

public class IndexOfConditionExample {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍 자바 프로그래밍 자바 프로그래밍";
		
		// indexOf(찾는글자) -> 앞에서 인덱스 정보를 저장한다. 없으면 -1이 된다.
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		// substring(시작인덱스) - > 시작 인덱스 부터 끝까지 잘라내기를 한다.
		String substring = subject.substring(location);
		System.out.println(substring);
		
		// 과목명에 자바가 있는지 알아 보고 싶다. 있다. -> index가 0이상, 없다 -> -1
		location = subject.indexOf("자바");
		System.out.println(location);
		
		// 자바와 관련이 있는지 출력
		if(location != -1) System.out.println("자바와 관련된 책");
		else System.out.println("자바와 관련이 없는 책");
		
		// 자바가 포함이 되어 있다. -> contains() . 있으면 true, 없으면 false를 돌려준다.
		boolean result = subject.contains("자바");
		
		// 자바와 관련이 있는지 출력
		if(result) System.out.println("자바와 관련된 책");
		else System.out.println("자바와 관련이 없는 책");
		
		// 마지막에 나타나는 자바의 위치 찾기
		System.out.println(subject.lastIndexOf("자바"));
		
		// 2번 째 자바의 위치 찾기
		System.out.println(subject.indexOf("자바", subject.indexOf("자바") + 1));
		System.out.println(subject.indexOf("자바", 1));
		
		// 파일명 확장자 찾아 보기 - 파일의 특성
		String fileName1 = "c:/my.photo/test.01.jpg";
		String fileName2 = "c:/my.photo/my.jpg";
		
		System.out.println(fileName1.substring(fileName1.lastIndexOf(".") + 1));
		System.out.println(fileName2.substring(fileName2.lastIndexOf(".") + 1));
	}
	
}
