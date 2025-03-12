package ch06class;

/**
 * 회원을 관리해주는 데이터 객체로 사용.
 * 아이디, 이름, 나이, 클래스이름
 */

public class Member {

	// 데이터를 저장하는 변수들을 가지고 있다.
	// 클래스의 구성원으로 가지고 있다. member 변수 == 전역 변수 - 기본 값 세팅을 해준다.
	// sataic 변수 - 자동으로 올라간다. Member.className 로 사용
	static String className;
	// non-static 변수 - new 해서 올리다. Member m1 = new Member(); m1.id;
	String id; // 회원 아이디 (기본 값 - null)
	String name; // 회원 이름 (기본 값 - null)
	int age; // 회원 나이 (기본 값 - null)
	
	// new Member();
	// - 모든 클래스는 생성자를 만들지 않으면 컴파일할 때 자동으로 기본 생성자 - 클래스이름()를 만든다.
	// 생성자를 작성하는 목적은 변수의 초기 데이터를 세팅할 때 사용된다.
	
	// 초기화 블록 - Member 클래스 이름이 불려지면 자동으로 실행되는 처리문
	// static 초기화 블록 - 클래스 이름이 불려지만 자동으로 실행
	// - 딱 한번만 실행 : static 변수 초기값 세팅
	static {
		System.out.println("static 초기화 블록 처리 : 딱 한번 ------------");
		className = "Member";
	}
	// 초기화 블록 - new 할때마다 자동으로 실행
	//  - non-static & static 변수 초기값 세팅
	{
		System.out.println("non-static 초기화 블록 처리 : new 할때 마다 ------------");
	}
	
	// 생성자 - 값을 전달 받아서 non - static 변수의 값을 세팅하기 위해서 사용 - new 할때 한번만 실행
	
	// 기본 생성자 - 기본 값으로 데이터를 세팅해 주는 생성자 - 1. 리턴타입 없음. 2. 클래스이름과 같다.
	//  :: 기본 값 세팅을 하지 않으면 생략 가능 -> Compiler가 자동으로 만들어 주다.
	public Member() {
		this("test", "홍길동", 30); // 생성자가 생성자를 호출할 때는 맨 위에 작성해야 한다.
		System.out.println("기본 생성자 실행 - new 기본생성자() ----------------------");
//		id = "test";
//		name = "홍길동";
//		age = 30;
	}
	// 생성자 - non-static 변수 초기화에 사용
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// this - 자기 자신 객체, this.id -> 자기가 가지고 있는 id
	// super - 부모의 객체
}
