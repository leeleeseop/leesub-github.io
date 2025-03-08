package ch04condition;

// 앞에 숫자(x)가 뒤에 숫자(y)보다 크면 서로 바꾼다.

public class ChangeNumberExample {

	public static void main(String[] args) {

		// x와 y를 각각 10과 5로 초기화 후 x와 y값 출력
		int x = 10, y = 5;
		System.out.println("x = " + x + ", y = " + y);

		// if조건식으로 x가 y보다 큰지 비교 조건이  참이면 코드블록 실행
		if(x>y) {
			
			// int타입변수 z를 선언하고 x의 현재 값으로 초기화
			int z = x;
			
			// 변수 x에 변수 y의 현재 값을 할당 x는 y의 값인 5로 변경
			x= y;

			// y에 변수 z의 값을 할당 z는 x의 원래 값 10을 가지고 있으므로 y는 10으로 변경
			y = z;
		}
		
		// x와 y의 값을 콘솔에 출력
		System.out.println("x = " + x + ", y = " + y);

		// x와 y의 값을 다시 초기값 10과 5로 재설정 후 x와 y의 값을 콘솔에 출
		x = 10; y = 5;
		System.out.println("x = " + x + ", y = " + y);

		// 두번째 if 조건문
		if(x>y) {

			// x와 y의 합을 계산하여 x의 값은 15
			x = x + y;
			
			// x에서 y을 뺀 값을 계산하여 y의 값은 10
		        y = x - y;
		       
			// x의 값을 산술연산을 통해 x에서 y를 뺀 값을 계산하여 x의 값은 5
		        x = x - y;
		}
		// x와 y의 값을 콘솔에 출력(x=5, y=10)
		System.out.println("x = " + x + ", y = " + y);
	}
}
