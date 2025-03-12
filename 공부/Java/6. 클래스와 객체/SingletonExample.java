package ch06class;

public class SingletonExample {

	public static void main(String[] args) {
		
		// 싱글톤 객체가 한번만 생성이된 것을 사용한다.
		Singleton obj1 = Singleton.getInstance();
		obj1.print();
		Singleton obj2 = Singleton.getInstance();
		obj2.print();

		// 두 객체가 같은 인스턴스를 참조하는지 비
		System.out.println(obj1 == obj2);

		// System.identityHashCode()를 사용하여 각 객체의 실제 메모리 주소(해시 코드)를 출력
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
	} // end of main()
} // end of class
