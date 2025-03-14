package ch07final;

public class Super {

	// 변수
	public int a = 10; // 변수
	public final int FINAL_A = 20; // 상수 변수

	// process() 메서드
	public void process() {
		a = 100;
		// FINAL_A = 200; // final 변수의 값은 변경 불가능
	}

	// print() 메서드
	// final로 선언되어 있어 하위 클래스에서 override할 수 없음
	public final void print() {
		System.out.println(a);
		System.out.println(FINAL_A);
	}
	
}
