package ch04condition;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 \"q\"를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
		} while (!inputString.equals("q"));
	} // end of main()
} // end of class
