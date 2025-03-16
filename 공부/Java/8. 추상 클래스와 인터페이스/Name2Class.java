package ch08Interface;

// AbstractClass를 상속받아 추상 메서드 print()를 구현
public class Name2Class extends AbstractClass {

	@Override
	public void print() {
		
		// 추상 메서드 print()를 구현하여 name 필드의 값을 포맷으로 출력
		System.out.println("***** 출력 *******");
		System.out.println("** 이름 : " + name + " **");
		System.out.println("*****************");
	}

}
