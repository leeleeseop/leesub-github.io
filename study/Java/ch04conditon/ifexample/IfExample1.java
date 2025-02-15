package ch04condition;

public class IfExample1 {

	public static void main (String[] args) {
		
		// 경계선 테스트 - 7, 8, 9
		int age = 7;
		
		// 조건의 결과 출력
		System.out.println(age >= 8);
		if (age >= 8) {
			//true일 때 실행
			System.out.println("학교에 다닙니다.");
		} else {
			//false 일 떄 실행
			System.out.println("학교에 다니지 않습니다.");
		}
	}
}
