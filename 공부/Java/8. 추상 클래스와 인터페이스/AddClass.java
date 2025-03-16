package ch08Interface;

// AddClass는 AddCal 인터페이스를 구현하는 클래스
// 아 클래스는 두 정수를 더한 결과를 반환하는 add() 메서드
public class AddClass implements AddCal {

	@Override
	public int add(int a, int b) {
		
		// 두 정수를 더하여 결과를 반환 
		return a + b;
	}

}
