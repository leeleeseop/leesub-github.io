package ch08Interface;

// 추상 클래스 - 추상 메서드를 가지고 있는 클래스
public abstract class AbstractClass {

	// 이름을 저장
	String name;
	
	// 이름 : 이이섭
	
	// **** 출력 ***
	// ** 이이섭 : 이이섭 **
	// ********************
	
	// 추상 메서드는 상속 받은 자식 클래스에서 코드를 작성한다. 
	public abstract void print();

	// 일반메서드: 전달받은 name 값을 멤법 변수에 저장한 후, print()메서드를 호출
	public void setAndPrint(String name) {
		this.name = name;
		print();
	}
	
}
