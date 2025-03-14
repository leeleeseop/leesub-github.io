package ch07inhe;

public class InheExample {

	public static void main(String[] args) {
		
		// Super 클래스를 상속받은 Sub 클래스 생성
		// Sub 클래스의 객체를 생성하고 상속받은 변수 x를 수정한 후
		// Sub 클래스에 Override된 print() 메서드를 호출합니다.
		Sub sub1 = new Sub();

		// Super 클래스에서 상속받은 변수 x의 값을 100으로 설정
		sub1.x = 100;

		// print() 메서드를 호출하여 객체의 상태를 출력
		sub1.print();
	}
	
}
