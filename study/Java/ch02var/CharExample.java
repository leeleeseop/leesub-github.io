package ch02var;

public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'A'; // 문자 타입은 '' 안에 한 글자를 반드시 입력해야 한다.
		char c2 = 65; // char 문자 타입은 경우 0이상의 숫자로 운영된다. 2byte
		System.out.println(c1);
		System.out.println(c2); // c2 타입은 문자 -> 출력은 문자
		System.out.println(c2+1); // char + int -> int -> 숫자 출력
		System.out.println((char)(c2+1)); // char + int -> int -> 숫자 출력
		System.out.println((int)c2);
		
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println((char)(c4+1));
	}

}
