package ch06class;

public class CalculatorWithMethod {

	public static void main(String[] args) {
		
		// result
		// var1, var2 - 값을 가지고 5칙 연산 처리
		
		// var1과 var2 선언 10과 3으로 초기화
		int var1 = 10;
		int var2 = 3;
		
		// 메서드의 호출 사용
		add(var1, var2); //덧셈
		
		minus(var1, var2); //뺄셈
		
		multi(var1, var2); //곱셈
		
		divide(var1, var2); //나눗셈
		
		remain(var1, var2); //나머지 연산
		
		// 더해라.
		add(var1, var2);
		
	} // end of main()
	
	// 메서드를 작성해서 호출해서 사용해 보자. 선언 부분
	// 더해서 출력하는 메서드
	 static void add(int var1, int var2) {
			int result = var1 + var2;
			resultPrint(var1, var2, result, "+");
	 }
	 // 빼서 출력하는 메서드 - minus()
	 static void minus(int var1, int var2) {
			int result = var1 - var2;
			// System.out.println(var1 + " - " + var2 + " = " + result);
			resultPrint(var1, var2, result, "-");
	 }
	 // 곱하는 메서드 - multi()
	 static void multi(int var1, int var2) {
		 int result = var1 * var2;
		 resultPrint(var1, var2, result, "*");
	 }
	 // 나누는 메서드 - divide()
	 static void divide(int var1, int var2) {
		 int result = var1 / var2;
		 resultPrint(var1, var2, result, "/");
	 }
	 // 나머지 메서드 - remain()
	 static void remain(int var1, int var2) {
		 int result = var1 % var2;
		 resultPrint(var1, var2, result, "%");
	 }
	 
	 // 결과를 출력하는 메서드
	 static void resultPrint(int var1, int var2, int result, String op) {
		 System.out.println(var1 + " " + op + " " + var2 + " = " + result);
	 }
	
} // end of class
