package ch08Interface;

public class NameExample {

	public static void main(String[] args) {

		// AbstractClass 타입의 변수 name1에 NmaeClass 객체를 할당
		// AbstractClass의 추상 메서드 print()를 구현하여 이름을 출력
		AbstractClass name1 = new Name1Class();
		name1.setAndPrint("홍길동");
		
		AbstractClass name2 = new Name2Class();
		name2.setAndPrint("길동홍");
	}
	
}
