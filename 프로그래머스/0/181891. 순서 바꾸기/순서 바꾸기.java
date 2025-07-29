import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] num_list, int n) {
        // n번째 이후 부분 추출
        int[] after = Arrays.copyOfRange(num_list, n, num_list.length);
        // n번째까지 부분 추출
        int[] before = Arrays.copyOfRange(num_list, 0, n);
        
        // 새로운 배열에 합치기
        int[] result = new int[num_list.length];
        System.arraycopy(after, 0, result, 0, after.length);
        System.arraycopy(before, 0, result, after.length, before.length);
        
        return result;
    }

    // 예시 실행
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 2;
        int[] result = solution(num_list, n);
        System.out.println(Arrays.toString(result)); // 출력: [3, 4, 5, 1, 2]
    }
}