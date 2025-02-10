package ch03op;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// and - & / &&, or - | / ||, xor - ^ : true 홀수개, not - !
		String name = null; // 참조형 변수인데 주소가 없음
		// name.equals("lee") -> name이 null이면 찾을 곳이 없어서 오류
		// System.out.println(name != null & name.equals("lee"));
		System.out.println(name != null && name.equals("lee"));
		System.out.println(name != null);
	}

}
