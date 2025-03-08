package ch04;

public class BreakExample {
	public static void main(String[] args) throws Exception {

		// 무한 루프를 시작
		while(true) {
			// 정수 타입변수 num을 선언하고 1부터 6사이의 임의의 정수로 초기화 
			// 주사위 눈금(1~6)을 생성
			// Math.random()을 사용하여 0.0이상 1.0미만의 난수를 생성
			int num = (int)(Math.random()*6) + 1;
			
			// 생성된 난수를 콘솔에 출력
			System.out.println(num);

			// 난수 num이 6이면 break를 실행하여 루프를 종료
			if(num == 6) {
				break;
			}//if end
		}// while end
		System.out.println("프로그램 종료");
	}//main end
}//class end
