package ch06class;

public class ComputerExample {

	public static void main(String[] args) {
		
		// 가변길이 메서드의 사용.
		// 두개의 정수 10과 20을 전달하여 합을 출력
		System.out.println(sum(10,20));
		
		// 다섯 개의 정수 100, 90, 85, 100, 50을 전달하여 합을 출력
		System.out.println(sum(100,90,85,100,50));
		
	} // end of main()
	
	// 타입이 같은 가변길이 메서드 작성 -> 배열을 대신 사용할 수 있다.(보편)
	// main()가 static이므로 바로 사용하려면 static을 붙여야 한다.
	public static int sum(int ... nums) {

		// 정수형 변수 0 초기화
		int result = 0;

		// 향상된 for문을 사용하여 nums 배열의 모든 요소를 순차적으로 순회
		for(int num : nums) result += num;
		
		return result;
	} // end of sum
	
} // end of class
