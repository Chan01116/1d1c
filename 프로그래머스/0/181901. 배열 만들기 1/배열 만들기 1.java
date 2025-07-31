import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }

        // List를 int[] 배열로 변환
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    // 예시 실행
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int[] result = solution(n, k);
        System.out.println(Arrays.toString(result)); // 출력: [3, 6, 9]
    }
}