import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(long n) {
        List<Integer> answer = new ArrayList<Integer>((int)(Math.log10(n) + 1));
        String num = Long.toString(n);

        for (int i = num.length() ; i >= 1 ; i--) {
            answer.add(Character.getNumericValue(num.charAt(i - 1)));
        }

        int[] arr = new int[answer.size()];
        for (int j = 0 ; j < answer.size() ; j++) {
            arr[j] = answer.get(j);
        }
        return arr;
    }
}