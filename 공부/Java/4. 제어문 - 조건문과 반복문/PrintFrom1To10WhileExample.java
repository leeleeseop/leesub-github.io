package ch04condition;

import java.util.Scanner;

// 1 ~ 10까지 출력하는 프로그램 작성 - 단 while문 사용
public class PrintFrom1To10WhileExample {

	public static void main(String[] args) {
		
		// for(초기값; 반복조건; 증감) ~; 1부터 10까지 출력
		for(int i = 1; i <= 10 ; i++ ) System.out.println(i);

		// 초기값 세팅
		// 1부터 10까지 1씩 증가 
		int i = 1;
		// 현재 값을 출력 후 i를 1씩 증가
		for(;i <= 10;) System.out.println(i++);
		
		// 초기값 세팅
		i = 1;
		// 조건은 만족하는 동안 반복 처리한다.
		while(i <= 10) System.out.println(i++);
		System.out.println(i);

		// menu 변수 초기화 null값으로 시작
		String menu = null;
		System.out.println("while 전");


		Scanner scanner = new Scanner(System.in);
		
		// menu가 null이거나 또는 menu가 null이 아니고 "0"이 아니면 실행하자.
		// 0 이면 빠져 나간다. = 0 이 아니면 반복처리한다.
		while((menu == null) || (!(menu == null) && !menu.equals("0"))) {
		  System.out.println("while 안");
		  System.out.println("메뉴를 입력하세요.");
		  // 키보드 입력 받기
		  menu = scanner.nextLine();
		  // 입력된 메뉴가 "0"이 아니면 "처리" 출력
		  if(!menu.equals("0")) System.out.println("처리");
		}

		// scanner 닫기
		scanner.close();
	} // end of main()
	
} // end of class
