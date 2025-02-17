package ch05ref;

import java.util.Arrays;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		if(args.length != 2) {
			System.out.println("프로그램 입력 값이 부족");
			// 프로그램 종료
			System.exit(0);
		}
		
		// 전달 받은 데이터를 변수에 저장
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// 문자열 데이터를 int로 변환
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		// 2개의 숫자를 더한다.
		int result = num1 + num2;
		
		// 결과 출력
		System.out.println(result);
	} // end of main()
} // end of class
