package ch02var;

public class ValiableUseExample {
	public static void main(String[] args) {
		// 3을 저장. 3(값 = 리터럴)의 타입? - byte / short / [int]
		// 변수 선언 + 초기화: horu에 3, minute에 5를 저장
		int hour = 3;
		int minute = 5;
		
		// String인 경우 어떤 타입의 변수와 "+"를 시키면 문자열 이어 붙이기가 된다.
		// 결국 타입은 문자열이 된다.
		// hour + "시간 " -> 문자열 + minute -> 문자열 + "분"
		System.out.println(hour + "시간 " + minute +"분");
	}
}
