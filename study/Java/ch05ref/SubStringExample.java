package ch05ref;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		System.out.println(ssn.length());
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		secondNum = ssn.substring(ssn.indexOf("-") + 1);
		System.out.println(secondNum);
		
	} // end of main()
} // end of class
