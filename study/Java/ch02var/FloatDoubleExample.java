package ch02var;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float var1 = 0.1234567890123456789f;
		// float var1 = 0.1234567850123456789f;
		// double var2 = 0.1234567890123456789;
		double var2 = 0.1234567890123456749;
		// float가 허용하는 자리수가 있다. 그것보다 넘치면 나머지는 자른다.
		System.out.println(var1);
		System.out.println(var2);
		
		double var3 = 3e6;
		System.out.println(var3);
		double var4 = 2e-3;
		System.out.println(var4);
	}

}
