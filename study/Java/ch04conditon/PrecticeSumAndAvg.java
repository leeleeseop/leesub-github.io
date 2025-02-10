package ch04condition;

public class PrecticeSumAndAvg {

	public static void main(String[] args) {
		
		// 데이터
		int[] scores = {85,70,95,100};
		// 합계와 평균 - 초기화
		int sum = 0;
		int avg = 0;
		
		// 합계 - 위에 숫자를 더해서 sum에 넣는다. 데이터 개수만큼 반복처리.
		for(int i = 0; i < scores.length; i++) sum += scores[i];
		
		avg = sum / scores.length; // 평균 = 점수들의 합계 / 갯수
		
		// 결과 출력
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		// 합계와 평균 - 초기화
		sum = 0;
		avg = 0;
		
		// 합계 - 위에 숫자를 더해서 sum에 넣는다. 데이터 개수만큼 반복처리.
		for(int score : scores) sum += score;
		
		avg = sum / scores.length; // 평균 = 점수들의 합계 / 갯수
		
		// 결과 출력
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
	} // end of main()
} // end of class
