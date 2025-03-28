// 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
// 입출력 예1: num1이 2이고 num2가 3이므로 다릅니다. 따라서 -1을 return합니다.
// 입출력 예2: num1이 11이고 num2가 11이므로 같습니다. 따라서 1을 return합니다.
// 입출력 예3: num1이 7이고 num2가 99이므로 다릅니다. 따라서 -1을 return합니다.

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

// 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
