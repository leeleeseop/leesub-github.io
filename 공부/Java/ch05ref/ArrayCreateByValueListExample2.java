package ch05ref;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		
		//배열 변수 선언
		int[] scores;
		
		//배열 변수에 배열 대입
		scores = new int[] { 83, 90, 87 };
		
		// 배열 항목의 총합을 구하고 출력
		// 배열의 모든 값을 더해서 총합을 구함
		int sum1 = 0;
		
		//for문을 이용해서 scores배열의 값을 하나씩 더하기
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}// end for
		
		// 계산된 총합을 콘솔에 출력
		System.out.println("총합 : " + sum1);
		
		//배열을 매개변수로 전달하며, printItem() 메소드 호출
		printItem( new int[] {83, 90, 87});
		
	}//end main
	
	// printItem메소드
	// 이 메소드는 전달받은 int형 배열의 각 항목을 출력
	private static void printItem(int[] scores) {
		
		//for문을 사용하여 배열의 각 값을 순서대로 출력
		for(int i=0; i<3; i++) {
			
			//각 인덱스와 해당 값이 콘솔에 출력
			System.out.println("scores[" + i + "]:" + scores[i]);
		}//end for
	}//end printItem
}// end class
