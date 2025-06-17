class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        // 덮어쓰기 전 앞부분 인덱스 0부터 s까지
        String front = my_string.substring(0, s);
        
        // 덮어쓰기 끝 이후의 문자열 자르기 
        String back = my_string.substring(s + overwrite_string.length());

        // 이어붙이기
        String answer = front + overwrite_string + back;
        return answer;
    }
}