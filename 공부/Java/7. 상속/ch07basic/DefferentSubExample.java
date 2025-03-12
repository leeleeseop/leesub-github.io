package ch07basic;
import ch07defferent.Sub;

public class DefferentSubExample {

	public static void main(String[] args) {

		// sub 클래스의 객체 생성
		Sub sub = new Sub();

		// public 변수는 모든 곳에서 접근이 가능
		System.out.println(sub.publicVar);

		// protected 변수는 동일 패키지 또는 서브클래스에서 접근할 수 있음
		// 다른 패키지에 있는 클래스라도 sub가 상속관계라면 접근이 가능하지만
		// 상속 관계가 없으면 접근이 불가능
		System.out.println(sub.protectedVar);

		// System.out.println(super1.defaultVar);// default 변수는 다른 패키지에서 사용 불가.
		// System.out.println(super1.privateVar); // private 변수는 다른 클래스에서 사용 불가.
	}
	
}
