package ch04condition;
// 데이터 - 70 , 100, 50, 80 : 규칙이 없다. : 처리하기 위해서 배열 데이터로 작성 - 인덱스 0~3
public class ArrayForExample {

	public static void main(String[] args) {
		// 배열 변수[](참조형) 선언 + 초기화
		// -> new int[4]; 데이터를 저장; -> 배열을 선언하면 데이터 지정 {}사용
		int[] scores = {70, 100, 50, 80, 90}; // index : 0 ~ 3
		for(int i = 0; i <= 3; i++) System.out.println(scores[i]);
		
		// 배열에는 length = 4와 index 0 ~ 3; -> index는 length 보다 작은 경우 처리
		for(int i = 0; i < scores.length; i++) System.out.println(scores[i]);
		
		// 배열인 경우 모든 데이터를 처리하려고 하면 "향상된 for" = "foreach"
		for (int score : scores) {
			System.out.println(score);
		}
		
	}
}
