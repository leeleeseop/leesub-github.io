package ch02var;

// class - 연관이 있는 것 끼리 모아 놨다. - 변수, 메서드() 들
public class ValiableInitializationExample{
	// static - 고정 : 자동으로 올라간다.
	public static void main(String[] args){
		
		// 변수 선언 + 데이터 넣지 않음(초기화시키지 않음)
		// 메서드 안에 선언된 변수 - 지역 변수
		int value; //int 타입의 지역변수 value를 선언 
		
		// 프로그램이 진행되기 전에 값을 넣어주는 작업 = 초기화
		value = 10; // value변수에 값10을 할당 이제 value변수는 정수 값 10으로 초기화
		
		// 변수 선언
		// int 타입의 지역변수 result를 선언하고 value + 10을 더하여 연산결과 20으로 초기화
		int result = value + 10; // - 지역변수는 초기화 시키지 않으면 오류남.
		
		// 지역 변수는 메서드 안에 선언된 변수 - 초기화 시키지 않으면 값이 없음
		// 전역 변수는 메서드 안에 선언되지 않은 변수
		//  - 초기화 시키지 않으면 기본 값을 갖는다. 숫자인 경우 0
		// int result = ValiableInitializationExample.value + 10;

		// result변수의 값(20)을 출력
		System.out.println(result);
	}
	// 메서드 선언
	int add() {
		return 0;
	}
	
	// 변수 선언 - 초기값을 넣지 않았지만 기본 값이 세팅된다. 숫자는 0
	// 메서드 밖에 선언한 변수 - 전역 변수.
	static int value;
	
}
