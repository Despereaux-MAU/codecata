class Solution {
    public String solution(int num) {
        if (num % 2 == 0) {
            String answer = "Even";
            return answer;
        } else if (num % 2 != 0) {
            String answer = "Odd";
            return answer;
        } else {
            throw new IllegalArgumentException("잘못된 숫자를 입력하셨습니다.");
        }
    }
}