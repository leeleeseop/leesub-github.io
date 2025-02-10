package ch06class;

public class CalculatorClass {

	// mian()이 없다.
	// 메서드를 작성해서 호출해서 사용해 보자. 선언 부분
	// 더해서 출력하는 메서드
	public void add(int var1, int var2) {
			int result = var1 + var2;
			resultPrint(var1, var2, result, "+");
			return;
	 }
	 // 빼서 출력하는 메서드 - minus()
	public void minus(int var1, int var2) {
			int result = var1 - var2;
			// System.out.println(var1 + " - " + var2 + " = " + result);
			resultPrint(var1, var2, result, "-");
	 }
	 // 곱하는 메서드 - multi()
	// static인 경우 자동으로 미리 올라간다. resultPrint가 메인메모리에 올라와사 사용가능
	public static void multi(int var1, int var2) {
		 int result = var1 * var2;
		 staticResultPrint(var1, var2, result, "*");
	 }
	 // 나누는 메서드 - divide()
	public void divide(int var1, int var2) {
		 int result = var1 / var2;
		 resultPrint(var1, var2, result, "/");
	 }
	 // 나머지 메서드 - remain()
	public void remain(int var1, int var2) {
		 int result = var1 % var2;
		 resultPrint(var1, var2, result, "%");
	 }
	 
	 // 결과를 출력하는 메서드
	public void resultPrint(int var1, int var2, int result, String op) {
		 System.out.println(var1 + " " + op + " " + var2 + " = " + result);
	 }
	
	// 결과를 출력하는 메서드
	public static void staticResultPrint(int var1, int var2, int result, String op) {
		System.out.println(var1 + " " + op + " " + var2 + " = " + result);
	}
	
}
