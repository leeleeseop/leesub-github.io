package ch04condition;

// 앞에 숫자(x)가 뒤에 숫자(y)보다 크면 서로 바꾼다.

public class ChangeNumberExample {

	public static void main(String[] args) {
		
		int x = 10, y = 5;
		System.out.println("x = " + x + ", y = " + y);
		
		if(x>y) {
			// x = 10, y = 5, z = 10
			int z = x;
			// x = 5, y = 5, z = 10
			x= y;
			// x = 5, y = 10, z = 10
			y = z;
		}
		System.out.println("x = " + x + ", y = " + y);
		
		x = 10; y = 5;
		System.out.println("x = " + x + ", y = " + y);
		
		if(x>y) {
			// x = 15, y = 5
			x = x + y;
			// x = 15, y = 10
	        y = x - y;
	        // x = 5, y = 10
	        x = x - y;
		}
		System.out.println("x = " + x + ", y = " + y);
	}
	
}
