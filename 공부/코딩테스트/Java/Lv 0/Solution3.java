// 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
// 입출력 예1: num1이 2이고 num2가 3이므로 2 - 3 = -1을 return합니다.
// 입출력 예2: num1이 100이고 num2가 2이므로 100 - 2 = 98을 return합니다.

class Solution {
    // solution이라는 메서드를 선언  매개변수로 num1과 num2를 입력을 받음
    public int solution(int num1, int num2) {
        // num1과 num2 뺀 값을 answer에 저장
        int answer = num1 - num2;
        // answer을 반환
        return answer;
    }
}

// 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
