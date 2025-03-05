package ch07inhe;

public class Board {

	public static void main(String[] args) {
		// board 안에 사용할 수 있는 것. - 없다. 그러나 모든 클래스는 Object를
		// 상속 받는다.
		Board board1 = new Board();
		Board board2 = new Board();
		System.out.println(board1.toString());
		System.out.println(board1.equals(board2));
		String name1 = "이이섭";
		String name2 = "이이섭";
		System.out.println(name1.equals(name2));
	}
	
}
