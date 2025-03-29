class Solution {
    // solution이라는 메서드를 선언 매개변수로 slice와 n를 입력을 받음
    public int solution(int slice, int n) {
        // answer를 값을 받기 위해 0으로 초기화
        int answer = 0;
        // n과 slice를 나눠 나머지가 0이랑 같은지 비교
        if(n%slice == 0){
            // n과 slice를 나눈 몫을 반환
            answer = n/slice;
        }else{
            // n과 slice 나눈 몫에 1를 더하여 반환
            answer = n/slice + 1;
        }
        return answer;
    }
}