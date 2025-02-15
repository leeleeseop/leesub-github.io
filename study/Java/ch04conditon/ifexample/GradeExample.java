package ch04condition;

public class GradeExample {

	public static void mian(String[] args) {
		
        int score = 88;

        // 점수에 따른 등급 처리 if ~ else if ~ else
        // 점수가 100 보다 높다. "입력 오류" 출력 - (score > 100)
        // 점수 90 ~ 100 ; A (score >= 90 && score <= 100), (score >= 90)
        // 점수 80 ~ 89 : B (score >= 80)
        // 점수 70 ~ 79 : C (score >= 70)
        // 점수 60 ~ 69 : D (score >= 60)
        // 점수 0 ~ 59 : F (score >= 0)
        // 점수 0보다 작다. "입력 오류" 출력 - else

        if(score > 100) System.out.println("입력 오류");
        else if (score >= 90) System.out.println("A");
        else if (score >= 80) System.out.println("B");
        else if (score >= 70) System.out.println("C");
        else if (score >= 60) System.out.println("D");
        else if (score >= 0) System.out.println("F");
        else System.out.println("입려 오류");
	}
}
