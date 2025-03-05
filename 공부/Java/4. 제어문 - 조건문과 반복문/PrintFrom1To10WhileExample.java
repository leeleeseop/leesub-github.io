package ch04condition;

import java.util.Scanner;

// 1 ~ 10까지 출력하는 프로그램 작성 - 단 while문 사용
public class PrintFrom1To10WhileExample {

	public static void main(String[] args) {
		// for(초기값; 반복조건; 증감) ~;
		for(int i = 1; i <= 10 ; i++ ) System.out.println(i);
		
		int i = 1;
		for(;i <= 10;) System.out.println(i++);
		
		// 초기값 세팅
		i = 1;
		// 조건은 만족하는 동안 반복 처리한다.
		while(i <= 10) System.out.println(i++);
		System.out.println(i);
		
		String menu = null;
		
		System.out.println("while 전");
		Scanner scanner = new Scanner(System.in);
		// menu가 null이거나 또는 menu가 null이 아니고 "0"이 아니면 실행하자.
		while((menu == null) || (!(menu == null) && !menu.equals("0"))) { // 0 이면 빠져 나간다. = 0 이 아니면 반복처리한다.
		// while((menu == null)?true : !menu.equals("0")) { // 0 이면 빠져 나간다. = 0 이 아니면 반복처리한다.
			System.out.println("while 안");
		// while(!menu.equals("0")) { // 0 이면 빠져 나간다. = 0 이 아니면 반복처리한다.
			System.out.println("메뉴를 입력하세요.");
			menu = scanner.nextLine();
			if(!menu.equals("0")) System.out.println("처리");
		}
		
		scanner.close();
	} // end of main()
	
} // end of class
