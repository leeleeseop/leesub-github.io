package ch04condition;
// 구구단 - 2단 ~ 9단 -> for문의 반복 변수 - i, j, k ... - 습관
// 2 * 1 = 2
// ...
// 2 * 9 = 18
// 3 * 1 = 3
// ... 
// 3 * 9 = 27
// ...
// 9 * 9 = 81
public class MultiplicationTableExample {

	public static void main(String[] args) {
		
		// 바깥쪽 for문: 단(구구단의 '단' 부분) - 2부터 9까지 반복
		// int i=2 : i는 현재 단 수, 2단부터 시작 초기값 2로 설정
		// i<=9 : i가 9보다 작거나 같으면 계속 반복 구구단은 9단까지 출력
		// i++ : 1씩 증가
		for(int i = 2; i <= 9; i ++) {
			
			// 안쪽 for문: 곱해지는 수 1부터 9까지 반복
			// int j=1 : j는 현재 곱해지는 수, 1부터 9까지 곱하므로 초기값 1로 설정
			// j<=9 : j가 9보다 작거나 같으면 계속 반복 
			// j++ : j값을 1씩 증가
			for(int j = 1; j <= 9; j++) {
				// 구구단 각 항목을 출력
				System.out.print(i + " * " + j + " = " + (i * j));

				// 3개씩 출력 후 줄바꿈 처리 한 줄에 3개의 구구단 항목 출력
				if(j % 3 == 0) {
					System.out.println();
				} else {
					System.out.print("    ");
				} // end of if() - 3개 줄바꿈
			} // end of for - 곱해지는 숫자 : j
			System.out.println();
		} // end of for - 단수 : i
		
	} // end of main()
	
} // end of class
