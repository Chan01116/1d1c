import java.util.Arrays;

public class Solution {
    public static int[] solution(int start_num, int end_num) {
        int size = start_num - end_num + 1;
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = start_num - i;
        }

        return result;
    }

    // 예시 실행
    public static void main(String[] args) {
        int start_num = 10;
        int end_num = 3;
        int[] result = solution(start_num, end_num);
        System.out.println(Arrays.toString(result)); // 출력: [10, 9, 8, 7, 6, 5, 4, 3]
    }
}