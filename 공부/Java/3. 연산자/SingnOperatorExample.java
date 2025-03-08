package ch03op;

public class SingnOperatorExample {

	public static void main(String[] args) {

		// int형 변수 x를 -100으로 초기화
		int x = -100;
		// 단항 부호 연산자를 사용하여 x(-100)의 부호를 반전시켜 100으로 변경 후 출력
		x = -x;
		System.out.println("x:" + x);

		//byte형 변수를 b를 100으로 초기화
		byte b = 100;
		// b(100)의 부호를 반전시키고 -100으로 변경후 y에 저장시켜 출력
		// byte타입에 연산을 적용하면 int을 자동타입변환
		int y = -b;
		System.out.println("y:" + y);
			
	}// main end
}// class end
