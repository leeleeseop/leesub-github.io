package ch03op;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		// 참조형 변수 name을 null로 초기화
		String name = null;

		// &&(논리 AND) 연산자를 사용하여 첫 번째 조건(name != null)이 false일 경우 두 번째 조건은 평가되지 않음
		System.out.println(name != null && name.equals("lee"));

		// name이 null인지 확인하여 결과를 출
		System.out.println(name != null);
	}

}
