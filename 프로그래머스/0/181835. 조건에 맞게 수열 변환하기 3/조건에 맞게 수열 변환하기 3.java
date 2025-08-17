class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 1) { // k가 홀수
                result[i] = arr[i] * k;
            } else {          // k가 짝수
                result[i] = arr[i] + k;
            }
        }
        
        return result;
    }
}