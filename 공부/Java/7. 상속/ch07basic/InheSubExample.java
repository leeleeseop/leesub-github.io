package ch07basic;

public class InheSubExample {

	public static void main(String[] args) {
		
		// sub 클래스의 객체 생성
		// 이 클래스는 상속을 통해 상위 클래스의 멤버 변수들을 사용 가능
		Sub sub = new Sub();
		
		System.out.println(sub.publicVar); // 상속받은 public 변수 사용가능
		
		System.out.println(sub.protectedVar);// 상속받은 protected 변수 사용가능
		
		System.out.println(sub.defaultVar); // 상속받은 default 변수 사용가능
		
		// 상속이 되지 않는 private 변수는 사용도 불가능
		// System.out.println(sub.privateVar);  
	}
	
}
