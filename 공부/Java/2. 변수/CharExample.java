package ch02var;

public class CharExample {

	public static void main(String[] args) {

		// char 타입 변수 c1을 선언하고 문자리터 'A'로 초기화
		// 문자 타입은 '' 안에 한 글자를 반드시 입력해야 한다.
		char c1 = 'A';

		// char 타입 변수 c2를 선언하고 정수 65로 초기화
		// char 문자 타입은 경우 0이상의 숫자로 운영된다. 2byte
		char c2 = 65; 
		
		// c1의 값(A)가 콘솔에 출력
		System.out.println(c1);

		// char타입이기 문에 유니코드 65에 해당하는 문자인 A가 출력 
		System.out.println(c2); 

		// c2와 정수 1을 더한 결과를 출력
		// char와 int의 연산은 int타입으로 자동 형변환이 되므로 정수값(66)이 출력
		System.out.println(c2+1);

		// c2에 1을 더한 결과를  char 타입으로 강제 형변환
		// 66은 유니코드 문자 'B'에 해당하므로  'B'가 출
		System.out.println((char)(c2+1));

		// c2의 char타입을 int타입으로 강제 형변환하여 정수 65를 출력
		System.out.println((int)c2);

		// char 타입 변수를 c3를 선언하고 문자 리터럴 '가'초기화
		// char 타입은 유니코드를 지원하므로 한글도 저장가능
		char c3 = '가';

		// char 타입 변수를 c4를 선언하고 정수 리터럴 '44032'초기화
		// 44032는 유니코드에서 한글문자로 '가'에 해당
		char c4 = 44032;
		
		System.out.println(c3); // c3의 값 '가' 출력
		System.out.println(c4); // c4의 값은 44032이지만 char타입으로 '가'출력

		// c4에 1을 더한 후 char 타입으로 변환하여 출력
		// 44032 + 1 = 44033(각)이 출력ackage ch02var;

public class CharExample {

	public static void main(String[] args) {

		// char 타입 변수 c1을 선언하고 문자리터 'A'로 초기화
		// 문자 타입은 '' 안에 한 글자를 반드시 입력해야 한다.
		char c1 = 'A';

		// char 타입 변수 c2를 선언하고 정수 65로 초기화
		// char 문자 타입은 경우 0이상의 숫자로 운영된다. 2byte
		char c2 = 65; 
		
		// c1의 값(A)가 콘솔에 출력
		System.out.println(c1);

		// char타입이기 문에 유니코드 65에 해당하는 문자인 A가 출력 
		System.out.println(c2); 

		// c2와 정수 1을 더한 결과를 출력
		// char와 int의 연산은 int타입으로 자동 형변환이 되므로 정수값(66)이 출력
		System.out.println(c2+1);

		// c2에 1을 더한 결과를  char 타입으로 강제 형변환
		// 66은 유니코드 문자 'B'에 해당하므로  'B'가 출
		System.out.println((char)(c2+1));

		// c2의 char타입을 int타입으로 강제 형변환하여 정수 65를 출력
		System.out.println((int)c2);

		// char 타입 변수를 c3를 선언하고 문자 리터럴 '가'초기화
		// char 타입은 유니코드를 지원하므로 한글도 저장가능
		char c3 = '가';

		// char 타입 변수를 c4를 선언하고 정수 리터럴 '44032'초기화
		// 44032는 유니코드에서 한글문자로 '가'에 해당
		char c4 = 44032;
		
		System.out.println(c3); // c3의 값 '가' 출력
		System.out.println(c4); // c4의 값은 44032이지만 char타입으로 '가'출력

		// c4에 1을 더한 후 char 타입으로 변환하여 출력
		// 44032 + 1 = 44033(각)이 출력
		System.out.println((char)(c4+1)); 
	}

}
