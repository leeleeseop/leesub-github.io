package test;
//배열 scores={90, 75, 100, 80} - 합계.
public class Sum {

	public static void main(String[] args) {

		// 정수형 배열 scores를 선언하고 90, 75, 100, 80 네 개의 값으로 초기화
		int [] scores = {90, 75, 100, 80};

		int sum = 0; // 합계를 저장할 용도로 sum이라는 정수형 변수를 선언하고 0으로 초기화
		int avg = 0; // 평균값을 저장할 용도로 avg이라는 정수형 변수를 선언하고 0으로 초기화

		// for-each루프를 사용하여 scores 배열의 각 요소를 순서대로 score 변수에 담아서 반복
		// sum += score;: 각 반복마다 score값을 sum변수에 더하고 sum변수에는 배열의 모든 요소의 합계가 저장
		for(int score : scores) sum += score;

		// sum과 scores.length를 나누어 평균값을 계산
		// 배열의 길이: 90, 75, 100, 80 = 1, 2, 3, 4
		avg = sum / scores.length;

		// 각각 합계와 평균값을 출
		System.out.println(sum);
		System.out.println(avg);
	}
	
}
