package ch04condition;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 \"q\"를 입력하세요.");

		// scanner객체를 생성하고 키보드(System.in)으로부터 입력 받기
		Scanner scanner = new Scanner(System.in);
		//  사용자가 입력한 입력을 저장할 문자열 변수 선언
		String inputString;
		// do-while 루프: do 블록 안의 코드는 최고한 한번은 반드시 실행
		do {
			// 사용자가 입력한 문자를 출력
			System.out.print(">");
			inputString = scanner.nextLine();
		//입력한 문자열이 'q'가 아니면 반복
		} while (!inputString.equals("q"));
	} // end of main()
} // end of class
