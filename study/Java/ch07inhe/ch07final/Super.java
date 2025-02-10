package ch07final;

public class Super {

	// 변수
	public int a = 10; // 변수
	public final int FINAL_A = 20; // 상수 변수
	
	public void process() {
		a = 100;
		// FINAL_A = 200; // final 변수의 값은 변경 불가능
	}
	
	public final void print() {
		System.out.println(a);
		System.out.println(FINAL_A);
	}
	
}
