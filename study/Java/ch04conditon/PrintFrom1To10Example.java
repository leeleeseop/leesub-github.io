package ch04condition;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		// 1 부터 10까지 출력하세요.
		// 규칙은 + 1 ; 1 - 초기값, 10- 크면 멈춘다.
		// for(초기 값; 반복 조건; 증감) 한개 처리;
		// for( 1 ; 2 ; 4) 3
		// i = 1, 2, 3, ... 9, 10, 11
		// i++; -> i = i + 1, i += 1
		for(int i = 1; i <= 10; i++) System.out.println(i);
		// 홀수 출력 : 1 ~ 10 사이의 데이터 : 1 3 5 7 9 -> 초기값 :1, 증감 : +2
		// 홀수 계산 if (i % 2 != 0)
		for(int i = 1; i <= 10; i = i + 2) System.out.println(i);
		// 짝수 출력 : 2 ~ 10 사이의 데이터 : 2 4 6 8 10 -> 초기값 : 2, 증감 : +2
		for(int i = 2; i <= 10; i = i + 2) System.out.println(i);
		
		// i++, ++i - 단독으로 사용되면 i = i + 1
		
		int num = 1;
		
		System.out.println(num++); // 1
		System.out.println(num); // num = 2
		
		// 선 증가 후 출력
		num = num + 1; // 3
		System.out.println(num); // 3
		
		// 선 증가 후 출력
		System.out.println(++num); //4
		
		// 후 증가 선 출력
		System.out.println(num); // 4
		num = num + 1; // 5
		
		System.out.println(num); //5
		
		// 후 증가 선 출력
		System.out.println(num++); //5
		
		System.out.println(num); //6
		
		// num = 6
		System.out.println("" + (num++) + "," + (++num) + "," + (++num)); // 6, 8, 9
		
		// for문의 여러가지 형태
		// 초기화
		int i = 1; // 1. 초기화 - 한번만 해야하므로 for 앞에 처리하게 한다.
		for(; i <= 10 ; i++) System.out.println(i);
		
		System.out.println("for문 밖의 i : " + i);
		
		i = 1; // 1. 초기값
		for(;;) { // 무한반복
			// 2. 반복 처리 결정 조건문 - 조건에 만족하면 for 문을 빠져 나간다.
			if(i > 10) break;
			// 3. 처리
			System.out.println(i);
			// 4. 증감
			i++;
		}
		
		for(int j = 1, k = 2; j <= 10; j=j+2, k=k+2) {
			System.out.println("j=" + j + ", k=" + k);
		}
		
		// 같은 타입의 변수 선언과 데이터 세팅을 ","를 이용해서 같이 할 수 있다.
		int id = 10, age = 40;
		String name, address;
	}
}
