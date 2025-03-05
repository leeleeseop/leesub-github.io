package ch08Interface;

public class InterfaceEaxmple {

	public static void main(String[] args) {
		
		AddCal cal = new AddClass();
		System.out.println(cal.add(10, 5));
		cal = new AddAndMultiClass();
		System.out.println(cal.add(10, 5));
		
	}
	
}
