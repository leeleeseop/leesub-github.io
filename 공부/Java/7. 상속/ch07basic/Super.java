package ch07basic;

public class Super {

	// 접근 제한자 별 변수
	public int publicVar = 10; // 같은 패키지 다른 클래스에서 사용 가능
	protected int protectedVar = 20; //같은 패키지 다른 클래스에서 사용 가능
	int defaultVar = 30; // 같은 패키지 다른 클래스에서 사용 가능
	private int privateVar = 40; //같은 패키지 다른 클래스에서 사용 불가능 - 안보임
	
}
