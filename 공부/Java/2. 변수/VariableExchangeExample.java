package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ",y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ",y:" + y);
		
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println("a:" + a + ",b:" + b + ",c" + c);
		
		int temp1 = a;
		int temp2 = c;
		a = b;
		b = temp2;
		c = temp1;
		System.out.println("a:" + a + ",b:" + b + ",c:" + c);
	} 
}
