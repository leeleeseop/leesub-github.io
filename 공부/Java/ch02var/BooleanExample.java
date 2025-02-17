package ch02var;

public class BooleanExample {

	public static void main(String[] args) {

		// 처리를 세울 때 사용되는 변수 선언. 초기값을 true로 넣었다.
		boolean stop = true;
		System.out.println(stop);
		if(stop) { // 만약에 stop(=true)이면 다음 한개 처리
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		if(stop) // 만약에 stop(=true)이면 다음 한개 처리
			System.out.println("중지합니다.");
		else
			System.out.println("시작합니다."); // if 문 끝
		
		int x = 10;
		boolean result1 = (x == 20);
		boolean result2 = (x == 10);
		System.out.println(result1);
		// 값을 딱 한번만 사용하는 경우는 변수에 넣지 않는다.
		System.out.println((x == 20));
		System.out.println(result2);
		
	}

}
