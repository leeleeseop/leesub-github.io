package ch07basic;

public class SuperExample {

	public static void main(String[] args) {

		// 객체 생성
		Super super1 = new Super();
		
		System.out.println(super1.publicVar);
		
		System.out.println(super1.protectedVar);
		
		System.out.println(super1.defaultVar);
		
		// private 변수는 다른 클래스에서 사용 불가.
		// System.out.println(super1.privateVar);
	}
	
}
