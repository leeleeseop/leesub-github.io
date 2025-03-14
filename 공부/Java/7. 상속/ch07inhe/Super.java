package ch07inhe;

// 부모 클래스 - 해당 클래스에서는 상속을 주는지 모른다.

// Super 클래스는 부모 클래스 역할
// 다른 클래스에서 상속받아 기본 기능을 재사용 할 수 있음
public class Super {

	// 변수 x선과 10초기화
	int x = 10;

	// print() 메서드 "x= 10" 라는 형식으로 출력
	public void print() {
		System.out.println("x = " + x);
	}
	
}
