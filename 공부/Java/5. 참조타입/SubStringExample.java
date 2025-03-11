package ch05ref;

public class SubStringExample {

	public static void main(String[] args) {

		// String타입 ssn선언 문자열 초기화
		// ssn문자열의 길이(문자개수)를 콘솔에 출력
		String ssn = "990724-1234567";
		System.out.println(ssn.length());

		// String타입 firstNum선언 substing() 메소드 호출
		// 0: 문자열을 시작할 인덱스 6: 문자열을 끝낼 인덱스
		// firstNum의 값을 콘솔에 출력
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		// substring(7)을 사용하여 문자열의 인덱스 7부터 끝까지 추출
		// secondNum의 값을 콘솔에 출력
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

		// indexof("-")를 사용하여 "-"의 위치를 찾은 후 "-"문자 바로 다음 인덱스 부터 끝까지 문자열을 추출
		// secondNum의 값을 콘솔에 출력
		secondNum = ssn.substring(ssn.indexOf("-") + 1);
		System.out.println(secondNum);
		
	} // end of main()
} // end of class
