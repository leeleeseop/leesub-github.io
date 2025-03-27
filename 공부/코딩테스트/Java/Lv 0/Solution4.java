// 머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요.
// 입출력 예1: 2022년 기준 40살이므로 1983년생입니다.
// 입출력 예2: 2022년 기준 23살이므로 2000년생입니다.

class Solution{
  // solution 메서는 매개변수 age를 입력받고
  public int solution(int age){
    // 2022에서 age를 뺸 다음 1를 더한 값을 answer에 저장
    int answer = 2022-age+1;
    // answer를 반환
    return answer;
  }
}

// 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
