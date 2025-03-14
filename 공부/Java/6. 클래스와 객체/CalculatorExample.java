package ch06class;

// static import - static을 붙인 메서드를 클래스 이름없이 사용할 수 있는 import
import static ch06class.CalculatorClass.multi;

public class CalculatorExample {

	public static void main(String[] args) {
		
		// 계산기 사용.
		// 두 정수 var1과 var2를 선언 10과 3선언
		int var1 = 10, var2 = 3;
		
		// static 메서드는 new하지 않고 사용 - 자주 사용되는 메서드에 static 선언
		// static import가 되어 있어야 사용가능
		multi(var1, var2);
		
		// CalculatorClass 가져다가 사용하자.
		CalculatorClass cal = new CalculatorClass();
		// 더하기 처리하고 출력
		cal.add(var1, var2);
	}
}
