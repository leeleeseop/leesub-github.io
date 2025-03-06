package ch03op;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {

		// byte 변수 v1과 v2를 각각 10과 4로 초기화
		byte v1 = 10;
		byte v2 = 4;

		// int 변수 v3를 5로 초기화
		int v3 = 5;

		// long 변수 v4를 10L로 초기화
		long v4 = 10L;

		// v1 + v2를 계산한 결과를 int 타입 변수 result1에 저장
		int result1 = v1 + v2;
		System.out.println("result1:" + result1);

		// v1 + v2 - v4를 계산한 결과를 Long 타입 변수 result2에 저장
		long result2 = v1 + v2 - v4;
		System.out.println("result2:" + result2);

		//v1를 double타입으로 변환 후 v2와 나누어 double 타입 result3에 저장
		double result3 = (double) v1 / v2;
		System.out.println("result3:" + result3);

		// v1과 v2의 나머지를 int 타입qustn result4에 저장
		int result4 = v1 % v2;
		System.out.println("result4:" + result4);


    
		short a = 12;
		short b = 7;
		int c = 20;
		float d = 4.5f;
		double e = 2.5;
		
		// short끼리 연산하면 int타입으로 자동 변환
		int result5 = a + b;
		System.out.println("result5:" + result5);

		// int와 short의 연산 결과는 int 타입으로 자동 변
		int result6 = c - b;
		System.out.println("result6:" + result6);

		// c(int) / d(float) float타입으로 자동 변환
		float result7 = c / d; 
		System.out.println("result7:" + result7);

		// float * double → double타입으로 자동 변환
		double result8 = d * e; 
		System.out.println("result8:" + result8);

		// int와 short의 나머지 연산 결과는 int타입으로 자동변환
		int result9 = c % b;
		System.out.println("result9:" + result9);
	}
}
