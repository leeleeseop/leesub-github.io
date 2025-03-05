package ch02var;

public class BooleanExample {

	public static void main(String[] args) {

		// boolean 타입 변수 stop을 선언하고 true로 초기화
		boolean stop = true;
		
		// stop변수의 값을 콘솔에 출력합니다.
		System.out.println(stop);
		
		if(stop) { 
			System.out.println("중지합니다."); // if 조건이 참(true)일때 실행되는 코드블록
		} else {
			System.out.println("시작합니다."); // if 조건이 거짓(fasle)일때 실행되는 코드블록
		}// 이 stop 변수의 값은 true이므로 if블록 안의 "중지합니다" 출력

		if(stop) 
			System.out.println("중지합니다."); 
		else
			System.out.println("시작합니다."); // if 문 끝

		//int 타입의 변수 x를 선언하고 10으로 초기화
		int x = 10; 

		// x와 20이 같은지 비교한 결과(false)를 result1에 저장
		boolean result1 = (x == 20);
		
		// x와 20이 같은지 비교한 결과(true)를 ressult2에 저장
		boolean result2 = (x == 10);
		
		// result1 값(false)가 출력
		System.out.println(result1);
		
		// 값을 딱 한번만 사용하는 경우는 변수에 넣지 않는다.
		// 비교연산 결과를 직접 콘솔에 출력
		System.out.println((x == 20));

		// result2 값(true)가 출력
		System.out.println(result2);
		
	}
}
