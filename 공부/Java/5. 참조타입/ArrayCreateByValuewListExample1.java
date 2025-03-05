package ch05ref;

public class ArrayCreateByValuewListExample1 {

	public static void main(String[] args) {
		
		// 문자열 배열 선언 및 초기화
		// "season" 배열을 선언하고 동시에 "Spring", "Summer", "Fall", "winter" 값으로 초기화
		String[] season = { "Spring", "Summer", "Fall", "winter" };
		
		// 배열의 각 요소 출력
		// 각 인덱스에 저장된 문자열 값을 출력합니다.
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
		
		// 배열의 특정 인덱스 값 변경
		//인덱스 1번 항목의 값인 "Summer"를 "여름"으로 변경.
		season[1] = "여름";
		System.out.println("season[1] :" + season[1]);
		System.out.println();
		
		//정수형 배열 선언 및 초기화
		int[] scores = {83, 90, 87};
		
		//배열의 총합과 평균 계산
		int sum = 0;// 총합을 저장할 변수 sum을 0으로 초기화.
		
		//for문을 사용하여 총합을 계산합니다.
		// 배열의 scores의 길이는 3이므로 i는 0부터  2까지 반복.
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		// 계산된 총합을 출력합니다.
		System.out.println("총합 : " + sum);
		
		// 평균 계산
		// 총합을 배열의 길이(3)로 나누어 평균을 구함.
		// (double)로 형변환하여 소수점까지 계산.
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg); // 계산된 평균을 출력
	}
}
