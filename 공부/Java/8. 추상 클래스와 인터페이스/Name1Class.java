package ch08Interface;

// Name1Class는 AbstractClass를 상속받아 추상 메서드 print()를 구현
public class Name1Class extends AbstractClass{

	@Override
	public void print() {
		
		// 추상 메서드를 print()를 구현하여 name의 값을 "이름 : " 와 함께 출력
		System.out.println("이름 : " + name);
	}

}
