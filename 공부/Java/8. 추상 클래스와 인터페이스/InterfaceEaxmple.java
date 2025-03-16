package ch08Interface;

public class InterfaceEaxmple {

	public static void main(String[] args) {

		// AddCal 인터페이스 타입의 변수 cal을 선언하고 AddClass 객체로 초기화
		// 두 정수를 더하는 기본적인 add() 메서드를 구현
		AddCal cal = new AddClass();
		// cal.add(10, 5)를 호출하여 두 수의 합을 출력
		System.out.println(cal.add(10, 5));
		
		// cal 변수를 AddAndMultiClass 객체로 변경
		// 두 정수를 더한 후 결과에 100을 곱하는 add() 메서드를 구현
		cal = new AddAndMultiClass();
		// cad.add(10, 5)를 호출하여 변경된 연산 결과를 출력
		System.out.println(cal.add(10, 5));
		
	}
	
}
