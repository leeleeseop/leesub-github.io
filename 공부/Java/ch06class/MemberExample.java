package ch06class;

public class MemberExample {

	public static void main(String[] args) {
		
		// Member를 불러와서 사용해 보자.
		Member m1 = new Member(); // static을 자동으로 클래서 이름이 불려지면 올라간다.
		System.out.println(m1.name);
		Member m2 = new Member(); // static을 자동으로 클래서 이름이 불려지면 올라간다.
		System.out.println(m2.name);
		System.out.println(Member.className);
		// System.out.println(m1.className);
		
		// 생성자를 사용 데이터 초기화
		Member m3 = new Member("admin", "이영환", 40);
		System.out.println(m3.name);
		m3.name = "손흥민";
		System.out.println(m3.name);
	} // end of main()
} // end of class
