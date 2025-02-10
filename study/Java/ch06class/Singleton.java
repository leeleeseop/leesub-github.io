package ch06class;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	//private 생성자
	private Singleton() {}
	
	// static 아닌 요소들은 5번 째 줄에서 생성되어 올라간다.
	
	// Singleton를 사용하려면 변수 선언하고 getInstance()호출해서 사용하세요.
	public static Singleton getInstance() {return singleton;}
	
	public void print() {System.out.println("Singleton");}
	
}
