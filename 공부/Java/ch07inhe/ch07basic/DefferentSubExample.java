package ch07basic;
import ch07defferent.Sub;

public class DefferentSubExample {

	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.publicVar);
		System.out.println(sub.protectedVar);
//		System.out.println(super1.defaultVar);// default 변수는 다른 패키지에서 사용 불가.
//		System.out.println(super1.privateVar); // private 변수는 다른 클래스에서 사용 불가.
	}
	
}
