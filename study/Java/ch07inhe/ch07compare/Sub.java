package ch07compare;

// 변수 a와 메서드 print() 상속 받아서 가지고 있다.
// Super와 연관이 있다. -> Super 타입이라고 정의할 수 있다.
// Sub 타입으로도 정의 가능하다. - Sub와 연관이 있고, 변수 a와 메서드 print()와
// 변수 name과 add()를 가지고 있는 클래스
public class Sub extends Super {

	String name = "이영환";
	
	public void add() {
		a ++;
	}
	
}
