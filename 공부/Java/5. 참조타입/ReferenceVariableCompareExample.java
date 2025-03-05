package ch05ref;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		
		// 배열 변수 선언
		// int타입 배열을 참조할 수 있는 변수 arr1 arr2 arr3를 선언
		int[] arr1; 
		int[] arr2; 
		int[] arr3; 
		
		// 배열 생성 및 초기화
		// new 연산자를 사용하여 새로운 int 배열을 만들고 {1, 2, 3}의 초기값으로 대입
		arr1 = new int[] {1, 2, 3}; //배열 {1, 2, 3}을 생성하여 arr1 변수에 대입
		arr2 = new int[] {1, 2, 3}; //배열 {1, 2, 3}을 생성하여 arr2 변수에 대입
		arr3 = arr2; //배열 변수 arr2의 값을 배열 변수 arr3에 대입
		
		// 대입 후 출력
		System.out.println(arr1 = arr2);

		System.out.println(arr2 = arr3);
	}
}
