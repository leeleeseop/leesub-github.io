package ch06class;

public class MemberExample {

	public static void main(String[] args) {
		
		// Member를 불러와서 사용해 보자.
		// 기본 생성자는 내부에서 기본 값을 설정
		Member m1 = new Member(); // static을 자동으로 클래서 이름이 불려지면 올라간다.
		System.out.println(m1.name);
		Member m2 = new Member(); // static을 자동으로 클래서 이름이 불려지면 올라간다.
		System.out.println(m2.name);
		System.out.println(Member.className);
		
		// 생성자를 사용 데이터 초기화
		Member m3 = new Member("admin", "이이섭", 26);
		System.out.println(m3.name);
		// 이섭이로 변경
		m3.name = "이섭이";
		System.out.println(m3.name);
	} // end of main()
} // end of class
