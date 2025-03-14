package ch07inhe;

public class Board {

	public static void main(String[] args) {
		// board 안에 사용할 수 있는 것. - 없다. 그러나 모든 클래스는 Object를
		// 상속 받는다.
		// Board 클래스의 두 객체를 생성
		Board board1 = new Board();
		Board board2 = new Board();

		// board1의 toString() 메서드를 호출하여 객체의 문자열 표현을 출력
		System.out.println(board1.toString());

		// board1과 board2 객체가 동일한지 equals() 메서드를 통해 비교
		// equals(): 메서드는 참조 비교를 함
		System.out.println(board1.equals(board2));

		// 두 문자열 변수 name1과 name2에 동일한 값을 대입
		String name1 = "이이섭";
		String name2 = "이이섭";

		// equals()를 사용하여 두 문자열의 내용이 동일한지 비교
		System.out.println(name1.equals(name2));
	}
	
}
