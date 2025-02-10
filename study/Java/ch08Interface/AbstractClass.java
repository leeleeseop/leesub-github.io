package ch08Interface;

// 추상 클래스 - 추상 메서드를 가지고 있는 클래스
public abstract class AbstractClass {

	String name;
	
	// 이름 : 이이섭
	
	// **** 출력 ***
	// ** 이이섭 : 이이섭 **
	// ********************
	
	// 추상 메서드는 상속 받은 자식 클래스에서 코드를 작성한다. 
	public abstract void print();
	
	public void setAndPrint(String name) {
		this.name = name;
		print();
	}
	
}
