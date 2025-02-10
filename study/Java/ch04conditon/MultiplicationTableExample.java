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
		
		// 단에 해당되는 처리 : 2 ~ 9
		for(int i = 2; i <= 9; i ++) {
			// 곱해지는 수 : 1 ~ 9
			for(int j = 1; j <= 9; j++) {
				// i = 2, j = 1 ... i = 2, j = 9 / i = 3, j= 1 ... i = 3, j = 9
				System.out.print(i + " * " + j + " = " + (i * j));
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
