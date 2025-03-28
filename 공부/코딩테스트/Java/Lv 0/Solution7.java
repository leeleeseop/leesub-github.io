// 문제설명: 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.
// 입출력 예1: num1이 3, num2가 2이므로 3 / 2 = 1.5에 1,000을 곱하면 1500이 됩니다.
// 입출력 예2: num1이 7, num2가 3이므로 7 / 3 = 2.33333...에 1,000을 곱하면 2333.3333.... 이 되며, 정수 부분은 2333입니다.
// 입출력 예3: num1이 1, num2가 16이므로 1 / 16 = 0.0625에 1,000을 곱하면 62.5가 되며, 정수 부분은 62입니다.

class Solution{
  // solution이라는 메서드를 선언  매개변수로 num1과 num2를 입력을 받음
  public int solution(int num1, int num2){
    // double타입으로 변환 후 num1과 num2 나누로 실수 값에 1000을 곱하기
    double answer = (double) num1/ num2 * 1000;
    // answer값을 int형으로 캐스팅하여 반환
    return (int) answer;
  }
}
