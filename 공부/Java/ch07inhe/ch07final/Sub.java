package ch07final;

public class Sub extends Super{

	@Override // 상속 받은 메서드를 재정의해서 변경 시켰다.
	public void process() {
		a = 1000;
	}
	
	// 상속 받은 final 메서드는 똑같은 형태로 정의(재정-override)할 수 없다.
//	public void print() {
//		
//	}
	
}
