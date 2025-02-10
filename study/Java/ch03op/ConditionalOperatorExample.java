package ch03op;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		int score = 85;
		// 등급 계산 -> 문자 'A'
		// score가 90 이상 - A
		// score가 80 이상 - B
		// 외는 - C
		// 3항 연산자 - 조건?T값:F값
		char grade = (score >= 90) ? 'A' : ((score >= 80)? 'B' : 'C');
		System.out.println(grade);
		
		grade = ' ';
		if(score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else grade = 'C';
		System.out.println(grade);
	}
	
}

}
