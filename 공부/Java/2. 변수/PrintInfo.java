package ch02var;

public class PrintInfo {

	// 학번(studentID) - 202411001, : int
	// 이름(name) - 홍길동,:String, 생년(year) - 1999, :int
	// 연락처(phoneNumber) - 010-1234-1234 : String
	// 입학년월일(admissionDate) - 2024-04-11 : String, Date, Calendar
	// 위 데이터에 맞는 변수를 선언하고 데이터를 넣는다. 각각의 변수 값을 출력한다.
	// 추가로 나이(age)를 출력한다.(2024 - 생년)
	// 모든 데이터는 String - 4Gbyte
	
	public static void main(String[] args) {
		// 변수 선언 + 초기화
		int studentID = 202411001;
		String name = "홍길동";
		int year = 1999;
		String phoneNumber = "010-1234-1234";
		String admissionDate = "2024-04-11";
		int age = 2024 - year;
		
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("생년 : " + year);
		System.out.println("연락처 : " + phoneNumber);
		System.out.println("입학일 : " + admissionDate);
		System.out.println("나이 : " + age);
	}
}
