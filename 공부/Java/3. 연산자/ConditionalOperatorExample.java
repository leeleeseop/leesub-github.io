package ch03op;

public class ConditionalOperatorExample {

	public static void main(String[] args) {

		// 점수를 85로 초기화
		int score = 85;
		// 등급 계산 -> 문자 'A'
		// score가 90 이상 - A
		// score가 80 이상 - B
		// 외는 - C
		// 3항 연산자를 사용하여 점수에 따른 등급을 계산
		char grade = (score >= 90) ? 'A' : ((score >= 80)? 'B' : 'C');
		System.out.println(grade);

		// 등급을 저장할 변수 grade를 공백 문자로 초기화
		grade = ' ';

		// if-else 구문을 사용하여 위와 동일한 조건으로 등급을 계산
		if(score >= 90) grade = 'A'; 
		else if(score >= 80) grade = 'B';
		else grade = 'C';
		System.out.println(grade);
	} //end main
} // end class
