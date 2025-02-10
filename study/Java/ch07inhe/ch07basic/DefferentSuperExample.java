package ch07basic;
import ch07defferent.Super;

public class DefferentSuperExample {

	public static void main(String[] args) {
		Super super1 = new Super();
		System.out.println(super1.publicVar);
//		System.out.println(super1.protectedVar);// private 변수는 다른 패키지에서 사용 불가.
//		System.out.println(super1.defaultVar);// private 변수는 다른 패키지에서 사용 불가.
//		System.out.println(super1.privateVar); // private 변수는 다른 클래스에서 사용 불가.
	}
	
}
