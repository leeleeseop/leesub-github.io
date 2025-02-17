package ch06class;

public class SingletonExample {

	public static void main(String[] args) {
		// 싱글톤 객체가 한번만 생성이된 것을 사용한다.
		Singleton obj1 = Singleton.getInstance();
		obj1.print();
		Singleton obj2 = Singleton.getInstance();
		obj2.print();
		
		System.out.println(obj1 == obj2);
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
	} // end of main()
} // end of class
