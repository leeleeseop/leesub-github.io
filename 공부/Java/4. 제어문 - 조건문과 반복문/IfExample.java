package ch04;

public class IfExample {

	public static void main(String[] args) {

		// score변수를 93으로 초기화
		int score = 93;

		// 첫 번째 if문 score가 90이상이면 실행
		// 93은 90이상이므로 출력
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다");
		}

		// 두 번째 if 문: score가 90미만이면 실행
		// score가 93이므로 출력되지가 않음
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다");
		}
		
	}
}
