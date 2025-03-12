package ch07basic;
import ch07defferent.Super;

public class DefferentSuperExample {

	public static void main(String[] args) {

		// super 클래스의 객체 생성
		Super super1 = new Super();

		// public 변수는 모든 패키지에 사용이 가능
		System.out.println(super1.publicVar);
		
//		System.out.println(super1.protectedVar);// private 변수는 다른 패키지에서 사용 불가.
//		System.out.println(super1.defaultVar);// private 변수는 다른 패키지에서 사용 불가.
//		System.out.println(super1.privateVar); // private 변수는 다른 클래스에서 사용 불가.
	}
	
}
