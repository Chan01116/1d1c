import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int last = num_list[len - 1];
        int prev = num_list[len - 2];

        int newValue;
        if (last > prev) {
            newValue = last - prev;
        } else {
            newValue = last * 2;
        }

        int[] result = Arrays.copyOf(num_list, len + 1);
        result[len] = newValue;
        return result;
    }
}