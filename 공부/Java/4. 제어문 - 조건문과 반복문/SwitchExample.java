package ch04condition;

public class SwitchExample {

	public static void main(String[] args) {
		
		// 주사위를 던졌다. 1~6 중에 하나의 숫자가 랜덤으로 나타나게 된다.
		// 0.0 * 6 - 0, 0.9 * 6 - 5.4 : 5 : 0~5 + 1 -> 1~6
		System.out.println(((int)(Math.random()*6)) + 1);
                // 위와 동일한 방식으로 생성된 숫자를 변수 num에 저장
		int num = ((int)(Math.random()*6)) + 1;
		
		// 조건 문에 의해서 처리해 보자. == 비교 : if / switch
		// switch(변수나 변수를 포함한 수식) { case 값: 처리문; ... }
		// 변수나 변수를 포함한 수식 = 값 조건에 맞는 case 로 이동해서 계속 아래로 실행
		switch (num) {
		// 라벨 : -> 이동 처리하는 표시
		case 1:
			System.out.println("1번이 나왔습니다.");
			// break - switch, for, while문을 빠져 나간다. if 문은 아님
			break;

		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
			
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
			
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
			
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
			
		default: // 6인 경우.
			System.out.println("6번이 나왔습니다.");
			break;
		} // end of switch
		
	} // end of main()
	
} // end of class
