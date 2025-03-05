package ch03op;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2;
		System.out.println("result1:" + result1);
		
		long result2 = v1 + v2 - v4;
		System.out.println("result2:" + result2);
		
		double result3 = (double) v1 / v2;
		System.out.println("result3:" + result3);
		
		int result4 = v1 % v2;
		System.out.println("result4:" + result4);


    
		short a = 12;
		short b = 7;
		int c = 20;
		float d = 4.5f;
		double e = 2.5;
		
		int result5 = a + b; // short끼리 연산하면 int로 자동 변환
		System.out.println("result5:" + result5);
		
		int result6 = c - b;
		System.out.println("result6:" + result6);
		
		float result7 = c / d; // c(int) / d(float) float로 자동 변환
		System.out.println("result7:" + result7);
		
		double result8 = d * e; // float * double → double로 자동 변환
		System.out.println("result8:" + result8);
		
		int result9 = c % b;
		System.out.println("result9:" + result9);
	}
}
