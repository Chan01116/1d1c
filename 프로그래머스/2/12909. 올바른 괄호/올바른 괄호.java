class Solution {
    boolean solution(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }

            // 닫는 괄호가 더 많아지는 순간, 잘못된 괄호
            if (count < 0) {
                return false;
            }
        }

        // 모두 짝이 맞았는지 확인
        return count == 0;
    }
}
