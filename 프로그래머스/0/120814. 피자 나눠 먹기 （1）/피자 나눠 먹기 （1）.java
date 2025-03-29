class Solution {
    // solution이라는 메서드를 선언  매개변수로 num1과 num2를 입력을 받음
    public int solution(int n) {
        // answer를 값을 받기 위해 0으로 초기화
        int answer = 0;
        
        // 사람 수와 7로 나눈 나머지가 0이랑 같은지 비교
        if(n%7 == 0){
            // 0이랑 같으면 사람 수와 7 나눈 나머지를 반환
            answer = n/7;
        }else{
            // 0이랑 틀리면 사람 수와 7을 나눈 나머지를 1을 더해 반환
            answer = n/7 + 1;
        }
        return answer;
    }
}