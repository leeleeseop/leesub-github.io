package ch08Interface;

public class NameExample {

	public static void main(String[] args) {
		AbstractClass name1 = new Name1Class();
		name1.setAndPrint("홍길동");
		AbstractClass name2 = new Name2Class();
		name2.setAndPrint("손흥민");
	}
	
}
