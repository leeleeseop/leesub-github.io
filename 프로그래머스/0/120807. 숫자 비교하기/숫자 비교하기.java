class Solution {
  // num1과 num2 매개변수로 입력을 받고 
  public int solution(int num1, int num2){
    // 조건문의 결과를 저장하기 위해 0으로 초기화
    int answer = 0;
    // num1과 num2를 비교해서 같으면 1 틀리면 -1로 반
    if(num1 == num2){
      answer = 1;
    }else{
      answer = -1;
    }
    return answer;
  }
}