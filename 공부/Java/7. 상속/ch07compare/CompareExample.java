package ch07compare;

public class CompareExample {

	public static void main(String[] args) {
		Sub sub1 = new Sub();
		print(sub1);
		// 자동 캐스팅 된다. Super가 크고 Sub는 작다. : 작 -> 큰 - 자동 캐스팅
		
		// 타입이 Super라는 얘기는 Super에 있는 것만 사용하겠다.
		// Super sub2 = new Sub();

		// Super객체 생성
		Super sub2 = new Super();
		print(sub2);
		
		// Sub sub3 = (Sub) sub2; // sub2는 Super타입이지만 원래 Sub 객체를 넣었다.
		// sub2.add(); 
		sub2.print(); 
	}

	
	// Sub -> Super 자동 캐스팅 : Super와 Super를 상속 받은 클래스는 모두 이메서드 사용가능
	public static void print(Super s) {
		// s 안에 담겨 있는 것이 Sub인지 알아보고 싶다.
		if(s instanceof Sub) {
			// 강제 형변환을 통해 Sub 클래스의 add() 메서드 호출
			((Sub) s).add();
			// s 객체의 print() 메서드 호출
			s.print();
		}
		System.out.println(s);
	}
	
} // end of class
