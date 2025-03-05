package ch04;

public class BreakExample {

	public static void main(String[] args) throws Exception {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}//if end
		}// while end
		System.out.println("프로그램 종료");
	}//main end
}//class end
