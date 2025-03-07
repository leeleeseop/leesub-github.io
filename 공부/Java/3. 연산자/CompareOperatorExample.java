package ch03op;

public class CompareOperatorExample {

	public static void main(String[] args) {

		// int변수 varInt를 선언하고 정수형 10으로 초기화
		int varInt = 10;
		
		// String 타입의 변수 str1을 선언하고 문자열 10을 초기화
		String str1 = "10";
		// varInt와 str1의 값을 콘솔에 출력
		System.out.println(varInt);
		System.out.println(str1);
		// System.out.println(varInt == str1); // 연관있는 것 끼리 연산을 시도해야 한다.

		
		// str1과 똑같이 문자열 10을 초기화 후 str3 변수의 값 콘솔에 출력
		// str1 == str2: 같은 객체를 참조하는지 비교결과를 콘솔에 출력
		// str1 == str3 같은메모리의 객체이므로 true가 출력
		String str2 = "10";
		System.out.println(str2);
		System.out.println(str1 == str2);

		
		// String타입의 변수 str3 선언하고 new String("10")을 초기화 후 콘솔에 str3변수의 값 콘솔에 출력
		// (str1 == str3)의 비교결과를 콘솔에 출력 str1과 str3은 서로 다른 메모리 주소에있는 객체를 참조하므로
		// str1 == str3은 false가 콘솔에 출력
		String str3 = new String("10");
		System.out.println(str3);
		System.out.println(str1 == str3);

		
		// hashCode와 identityHashCode를 이용해 각 문자열 객체의 내부주소와 실제주소를 출력
		System.out.println("str1의 주소 값: " + str1.hashCode());
		System.out.println("str3의 주소 값: " + str3.hashCode());
		System.out.println("str1의 주소 값: " + System.identityHashCode(str1));
		System.out.println("str2의 주소 값: " + System.identityHashCode(str2));
		System.out.println("str3의 주소 값: " + System.identityHashCode(str3));

		
		// 문자열인 경우 주소를 사용하는 해시함수에 값을 넣어서 그것을 가지고 주소로 사용한다.
		// 값이 같으면 같은 주소를 가지게 된다. new 해서 생성된 것은 서로 다른 주소를 가진다.
		// 값이 같으면 같다고 처리해야한다. 이때 사용되는 메서드가 equals() 이다.
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));
		// ?? - str3이 가지고 있는 주소값이 str1로 넣어진다. 
		str1 = str3;
		System.out.println(str1 == str3);
	}
}
