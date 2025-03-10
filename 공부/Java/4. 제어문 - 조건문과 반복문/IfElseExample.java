package ch04;

public class IfElseExample {

	public static void main(String[] args) {

		//변수 score를 85로 초기화
		int score = 85;

		// if else문을 사용하여 score의 값에 따라 다른 문자열을 출력
		// score가 90 이상이면 "점수가 90보다 큽니다" 와 "등급은 A입니다"를 출력
		// 그렇지 않으면 "점수가 90보다 작습니다" 와 "등급은 B입니다." 출력
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다");
		}else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다.");
		}
	}
}
