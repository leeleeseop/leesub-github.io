package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {

		//int타입 변수 x와y 선언하고 3과5로 초기화 후 변수 값 출력
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ",y:" + y);

		// x값을 temp에 저장
		// x값은 y값(5)으로 변경
		// y값은 temp에 저장해둔 값3으로 변경 후 x:5 y:3 출력
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ",y:" + y);

		// 세개의 변수 a, b, c를 각각 1, 2, 3으로 초기화 후 변수 값 출력
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println("a:" + a + ",b:" + b + ",c" + c);

		// a값을 temp1에 저장
		// c값을 temp2에 저장
		// a값을 b값(2)으로 변경
		// b값은 temp2에 저장해둔 값3으로 c값은 temp1에 저장해둔 값1로 변경후 a:2 b:3 c:1 출력
		int temp1 = a;
		int temp2 = c;
		a = b;
		b = temp2;
		c = temp1;
		System.out.println("a:" + a + ",b:" + b + ",c:" + c);
	} 
}
