package ch05ref;

import java.util.*; // 패키지 안에 모든 클래스 import
//import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// 원본 데이터를 배열로 정의
		int[] nums = {5, 7, 2, 1, 6};
		// 원본 데이터를 출력
		System.out.println(Arrays.toString(nums));
		// 중첩 for select  소트 시작
		// 맨 앞에 부터 차례로 작은 데이터로 정렬 시키기위해 선택한다. -> 마지막은 자동 정렬
		for(int i = 0; i < nums.length - 1; i++) {
			// 선택한 다음 데이터부터 마지막 데이터까지
			for(int j = i + 1; j < nums.length; j++) {
				// 선택된 데이터가 비교 데이터 보다 더 크면 바꾼다.
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			} // end of for j
			// System.out.println(Arrays.toString(nums));
		} // end of for i
		// 중첩 for select  소트 끝
		// 정렬된 데이터 출력
		System.out.println(Arrays.toString(nums));
		
	} // end of main()
}// end of class
