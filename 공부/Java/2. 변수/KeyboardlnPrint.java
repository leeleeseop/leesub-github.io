package ch02var;

import java.util.Scanner;

/**
 *  키보드로 데이터를 입력 받아서 출력하는 프로그램 작성
 *  Scanner 사용 - System.in 연결
 *  PrintInfo, ScannerExample 참조
 *  1. 변수 선언
 *  2. 데이터를 항목 별로 입력 받는다. - 여러개 데이터 한꺼번에
 *  3. 입력 받는 모든 항목과 나이를 출력한다.
 */

public class KeyboardInAndPrint {

	public static void main(String[] args) {
		
		// 키보드로 입력 받는 System.in을 이용한 Scanner 생성
		// Scanner scanner: Scanner 타입의 변수 scanner를 선언. 이 변수를 통해 Scanner클래스를 기능을 사용
		// System.in: 키보드 입력을 나타냄 
		Scanner scanner = new Scanner(System.in);
		
		// 데이터 변수 선언
		int studentID;
		String name;
		int year;
		String phoneNumber;
		String admissionDate;
		int age;
		
		// 입력 받기
		// print("학번 -> ")이라는 프롬프트를 표시
		// scanner.nextLine(): 키보드로 입력하고 엔터 키를 누르면 문자열이 받음
		// Integer.parseInt(): 문자열을 정수(int)타입으로 변환하는 메소드
		String str;
		
		System.out.print("학번 -> ");
		studentID = Integer.parseInt(scanner.nextLine());
		
		System.out.print("이름 -> ");
		name = scanner.nextLine();
		
		System.out.print("출생년도 -> ");
		year = Integer.parseInt(scanner.nextLine());
		
		System.out.print("연락처 -> ");
		phoneNumber = scanner.nextLine();
		
		System.out.print("입학일 -> ");
		admissionDate = scanner.nextLine();
		age = 2024 - year;

		// 입력한 정보를 콘솔에 출력
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("생년 : " + year);
		System.out.println("연락처 : " + phoneNumber);
		System.out.println("입학일 : " + admissionDate);
		System.out.println("나이 : " + age);

		// Scanner 닫기
		scanner.close();
	}
	
}
