class Solution {
    public int solution(int n) {
         int pieces = 6;
        while (pieces % n != 0) {
            pieces += 6;
        }
        return pieces / 6;
    }
}