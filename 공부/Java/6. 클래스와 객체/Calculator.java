package ch06class;

public class Calculator {

	public static void main(String[] args) {
		
		// result
		// var1, var2 - 값을 가지고 5칙 연산 처리
		// 값을 세팅
		int var1 = 10;
		int var2 = 3;

		// var1과 var2를 더한 결과를 result에 저장하고 출력
		int result = var1 + var2;
		System.out.println(var1 + " + " + var2 + " = " + result);

		// var1과 var2를 뺀 결과를 result에 저장하고 출력
		result = var1 - var2;
		System.out.println(var1 + " - " + var2 + " = " + result);

		// var1과 var2를 곱한 결과를 result에 저장하고 출력
		result = var1 * var2;
		System.out.println(var1 + " * " + var2 + " = " + result);

		// var1과 var2를 나눈 결과를 result에 저장하고 출력
		result = var1 / var2;
		System.out.println(var1 + " / " + var2 + " = " + result);

		// var1과 var2를 나눈 나머지 결과를 result에 저장하고 출력
		result = var1 % var2;
		System.out.println(var1 + " % " + var2 + " = " + result);
		
	} // end of main()
} // end of class
