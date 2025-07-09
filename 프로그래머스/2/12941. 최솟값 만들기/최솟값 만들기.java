import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A); // 오름차순
        Arrays.sort(B); // 오름차순 정렬 후 인덱스를 거꾸로 사용

        int answer = 0;
        int N = A.length;
        for(int i = 0; i < N; i++) {
            answer += A[i] * B[N - i - 1];
        }
        return answer;
    }
}
