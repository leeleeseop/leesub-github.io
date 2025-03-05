package test;
//배열 scores={90, 75, 100, 80} - 합계.
public class Sum {

	public static void main(String[] args) {
		int [] scores = {90, 75, 100, 80};
		
		int sum = 0;
		int avg = 0;
		
		for(int score : scores) sum += score;
		
		avg = sum / scores.length;
		
		System.out.println(sum);
		System.out.println(avg);
	}
	
}
