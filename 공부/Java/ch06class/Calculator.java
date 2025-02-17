package ch06class;

public class Calculator {

	public static void main(String[] args) {
		
		// result
		// var1, var2 - 값을 가지고 5칙 연산 처리
		// 값을 세팅
		int var1 = 10;
		int var2 = 3;
		
		int result = var1 + var2;
		System.out.println(var1 + " + " + var2 + " = " + result);
		
		result = var1 - var2;
		System.out.println(var1 + " - " + var2 + " = " + result);
		
		result = var1 * var2;
		System.out.println(var1 + " * " + var2 + " = " + result);
		
		result = var1 / var2;
		System.out.println(var1 + " * " + var2 + " = " + result);
		
		result = var1 % var2;
		System.out.println(var1 + " % " + var2 + " = " + result);
		
	} // end of main()
} // end of class
