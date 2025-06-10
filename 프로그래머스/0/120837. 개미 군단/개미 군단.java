class Solution {
    public int solution(int hp) {
    int[] dp = new int[hp + 1];
        for (int i = 1; i <= hp; i++) {
         dp[i] = Integer.MAX_VALUE;
    }
    dp[0] = 0;
    
    int[] attacks = {5, 3, 1};
    
    for (int i = 1; i <= hp; i++) {
        for (int attack : attacks) {
            if (i >= attack && dp[i - attack] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i - attack] + 1);
            }
        }
    }
    
    return dp[hp];
}
}