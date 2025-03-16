package ch08Interface;

public class AddAndMultiClass implements AddCal {

	@Override
	public int add(int a, int b) {

		// 두 정수를 더한 후 결과 100을 곱해서 반환
		return (a + b) * 100;
	}
}
