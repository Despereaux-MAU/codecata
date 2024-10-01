public class Solution {
    public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);

        for(int i = 0 ; i < str.length() ; i++) {
            answer += Integer.valueOf(str.charAt(i) - '0');
        }

        return answer;
    }
}