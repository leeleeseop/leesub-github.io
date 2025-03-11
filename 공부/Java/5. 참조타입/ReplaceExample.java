package ch05ref;

public class ReplaceExample {

	public static void main(String[] args) {

		// oldeStr 원본 문자열
		// String - 문자열 : 문자 배열
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";

		// replace() 메소드를 사용하여 oldStr 내의 모든 "자바" 를 "JAVA"로 변경한 결과를 newStr에 저장
		// 한글 자바 -> 영문 JAVA로 변경해 보자.
		String newStr = oldStr.replace("자바", "JAVA");

		// 원본 문자열 출력
		System.out.println(oldStr);

		// 변경 문자열 출력
		System.out.println(newStr);
		
	} // end of main()
} // end of class
