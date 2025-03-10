package ch04condition;

public class PrecticeSumAndAvg {

	public static void main(String[] args) {
		
		// 데이터 점수를 배열에 저장
		int[] scores = {85,70,95,100};
		// 합계와 평균 - 초기화
		int sum = 0;
		int avg = 0;
		
		// 합계 - 위에 숫자를 더해서 sum에 넣는다. 데이터 개수만큼 반복처리
		// 반복 인덱스 i를 0부터 scores.length - 1까지 증가시키며 점수를 더함
		for(int i = 0; i < scores.length; i++) sum += scores[i];

		// 평균 = 점수들의 합계 / 갯수
		avg = sum / scores.length;
		
		// 결과 출력
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		// 합계와 평균 - 초기화
		sum = 0;
		avg = 0;
		
		// 합계 - 위에 숫자를 더해서 sum에 넣는다. 데이터 개수만큼 반복처리.
		for(int score : scores) sum += score;

		// 평균 = 점수들의 합계 / 갯수
		avg = sum / scores.length; 
		
		// 결과 출력
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
	} // end of main()
} // end of class
