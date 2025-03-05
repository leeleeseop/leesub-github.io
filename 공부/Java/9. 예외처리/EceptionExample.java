package ch09exception;

public class EceptionExample {

	public static void main(String[] args) {
		//1. 데이터 세팅 2. 연산 /0 3.출력
		
		System.out.println("프로그램 시작");
		int a = 10;
		int result = 0;
		
		//예외처리
//		try {
//			result = a/ 0; //예외발생
//		} catch(ArithmeticException e) {
//			e.printStackTrace(); // 개발자 코드
//			System.out.println("연산 오류 발생 - 다시 한번 시도해 주세요.");
//		} finally {
//			System.out.println("반드시 실행되는 부분");
//		}
		
		// 메서드 호출로 예외처리
		try {
			result = divide(a);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		System.out.println(result);
		
		System.out.println("프로그램 끝");
	}// end of main()
	
	public static int divide(int a) throws Exception {
		int result = 0;
		
		result = a / 0;
		System.out.println("연산완료");
		
		return result;
	}
	
} // end of class
