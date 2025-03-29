class Solution{
  // solution이라는 메서드를 선언  매개변수로 num1과 num2를 입력을 받음
  public int solution(int num1, int num2){
    // double타입으로 변환 후 num1과 num2 나누로 실수 값에 1000을 곱하기
    double answer = (double) num1/ num2 * 1000;
    // answer값을 int형으로 캐스팅하여 반환
    return (int) answer;
  }
}