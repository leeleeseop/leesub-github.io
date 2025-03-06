package ch02var;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
		// 변수 선언 + 초기값 세팅
		// "10" - 리터럴 -> String, ==> 10 - int
		// 문자열의 맨 앞자리 부터 "1" -> 1, 뒤에 더 있으면 * 10 + "0" -> 0
		// int - integer : int 관련된 프로그램을 작성
		// -> Integer : int wrapper 클래스 ==> int는 Integer와 자동 캐스팅
		//  - 기본형 변수에 대한 처리 등을 만들어 놓은 클래스 
		//    byte : Byte, short : Short, int : Integer
		//    char : Character, boolean : Boolean
		int value1 = Integer.parseInt("10");
		System.out.println("value1 : " + value1);

		// String.valueOf(value1): 다양한 타입의 값을 String 타입으로 변환 기
		String str1 = String.valueOf(value1);
		System.out.println(str1);

		// str1이 String타입인지 확
		System.out.println(str1 instanceof String);

		// value1에 빈 문자열을 더하여 생성한 결과를 String 타입인지 확인
		// (value1 + "")는 int와 문자열의 결합 연산 결과는 문자열
		System.out.println((value1 + "") instanceof String);
		
		// int의 최대 사용 값과 최소 사용값을 출력
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
