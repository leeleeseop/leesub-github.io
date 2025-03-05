package ch02var;

public class FloatDoubleExample {

	public static void main(String[] args) {

		// float 타입 변수 var1을 선언하고 부동 소수점 0.1234567890123456789f로 초기화
		// float: 32비트의 크기를 가지며 7자리 자릿수를 가짐
		float var1 = 0.1234567890123456789f;
		// float var1 = 0.1234567850123456789f;
		// double var2 = 0.1234567890123456789;

		// double타입의 변수 var2를 선언하고 부동 소수점 0.1234567890123456749로 초기화
		// float가 허용하는 자리수가 있다. 그것보다 넘치면 나머지는 자른다.
		// double: 64비트의 크기를 가지며 15자리 자릿수를 가짐
		double var2 = 0.1234567890123456749;

		// var1, var2의 변수가 값을 출력하여 정밀도 차이를 확인할 수 있
		System.out.println(var1);
		System.out.println(var2);

		// double 타입 변수 var3선언 3e6을 초기화 콘솔에는3000000.0 출력
		// 3e6: 3 * 10^6 0
		double var3 = 3e6;
		System.out.println(var3);

		// double 타입 변수 var4선언 2e-3을 초기화 콘솔에는 0.002 출력
		// 2e-3: 2 * 10^-3
		double var4 = 2e-3;
		System.out.println(var4);
	}
}
