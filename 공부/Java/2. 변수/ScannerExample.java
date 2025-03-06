// 클래스의 위치
package ch02var;

// 사용하고 있는 프로그램을 포함. 다른 위치에 있는 클래스 ...
// 단, java.lang의 패키지는 import하지 않아도 자동으로 되어진다. -> 기본 패키지
import java.util.Scanner;

public class ScannerExample {

	// JVM이 main()를 호출해서 시작
	public static void main(String[] args) {
		// 데이터를 입력 받을 때 사용하는 객체(참조형) 변수 선언 + 생성해서 초기화
		Scanner scanner = new Scanner(System.in);

		// int타입의 x값 입력 출력 후 입력받은 문자열을 strX에 저장
		System.out.print("int 타입의 x 값 입력 : ");
		String strX =  scanner.nextLine();

		// 입력받은 문자열을 정수로 변환하여 x에 저
		int x = Integer.parseInt(strX);

		// 변환된 정수를 콘솔에 출력
		System.out.println("입력한 int 숫자 : " + x);
		
		// ~( 조건을 만족하면 : true) 하는 동안 ( 실행해라 )
		// while(true) - 무한 반복
		while(true) { // while문 시작
			// 키보드로 데이터 입력
			System.out.print("입력 문자열 : ");
			String data = scanner.nextLine();
			// 빠져나가는 조건을 작성한다. - 입력 받은 데이터가 "q"이면 빠져나간다.
			// return - method를 빠져 나감. System.exit(0) - 프로그램 종료
			// break - 멈춘다. for, while, switch을 빠져나간다.
			if(data.equals("q")) break;
			
			// 입력한 문자열 출력
			System.out.println("출력 문자열 : " + data);
			// 한 줄 여백
			System.out.println();
			// 줄바꿈 문자열 - \n
		} // while문 끝
		
		scanner.close();
	} // main()의 끝
	
} // 클래스의 끝
