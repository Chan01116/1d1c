class Solution {
    public int[] solution(String my_string) {
        
        int count = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= '0' && c <= '9') count++;
        }
        
        
        int[] answer = new int[count];
        int idx = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= '0' && c <= '9') {
                answer[idx++] = c - '0';
            }
        }
        
        for (int i = 0; i < answer.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < answer.length; j++) {
                if (answer[j] < answer[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = answer[i];
            answer[i] = answer[minIdx];
            answer[minIdx] = tmp;
        }
        
        return answer;
    }
}
