package ch04condition;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 업무 프로그램 시작
		// 키보드로 입력 받는 객체
		Scanner scanner = new Scanner(System.in);
		
		// 라벨을 붙인다.
		whileLoop:
		while (true) {
			// 메뉴 출력 - 메뉴 - 1. 게시판 2. 공지사항 3. 상품 4. 로그인 0. 종료
			System.out.println("1. 게시판  2. 공지사항  3. 상품");
			System.out.println("4. 로그인  0. 종료");
			// 메뉴 입력
			String menu = scanner.nextLine();
			// 입력한 내용을 처리
			switch (menu) {
			case "1":
				System.out.println("게시판을 처리하였습니다.");
				break;
			case "2":
				System.out.println("공지사항을 처리하였습니다.");
				break;
			case "3":
				System.out.println("상품을 처리하였습니다.");
				break;
			case "4":
				System.out.println("로그인을 처리하였습니다.");
				break;
			case "0": // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				// break whileLoop; // whileLoop 블록을 빠져 나간다.
				System.exit(0);
			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.\n[1~4,0]을 입력하셔야 합니다.");
			} // end of switch
		} // end of while
	} // end of main()
} // end of Main class
