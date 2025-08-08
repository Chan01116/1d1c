import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> seq = new ArrayList<>();
        long x = n;                 // 3*x + 1 연산을 안전하게 처리하기 위해 long 사용

        while (true) {
            seq.add((int) x);       // 현재 값 기록
            if (x == 1) break;      // 1이면 종료

            if ((x & 1) == 0) {     // 짝수
                x /= 2;
            } else {                // 홀수
                x = 3 * x + 1;
            }
        }

        // List<Integer> -> int[] 변환
        return seq.stream().mapToInt(Integer::intValue).toArray();
    }
}