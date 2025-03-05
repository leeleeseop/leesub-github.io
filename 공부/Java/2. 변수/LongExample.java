package ch02var;

public class LongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 -> int 리터럴로 선언 -> long 타입 변수에 저장
		//  : 타입이 서로 틀린 곳에 데이터는 전달하는 것을 캐스팅이라고 한다.
		//  : 작(int) -> 큰(long) - 데이터 손실이 일어나지 않음. 자동캐스팅
		long var1 = 10;
		//  : 타입이 서로 틀린 곳에 데이터는 전달하는 것을 캐스팅이라고 한다.
		//  : 큰(long) -> 작(int) - 데이터 손실이 일어날 수 있다. 강제캐스팅
		// int varInt = (int) var1; // 전달 데이터 앞에 변환할 타입을 선언
		long var2 = 20L;
		// 1000000000000 -> int로 리터럴 선언 : 범위 초과가 되어 오류
		// long var3 = 1000000000000;
		// int 초과되는 숫자는 뒤에 L을 붙여서 long 타입으로 변환시킨다.
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
