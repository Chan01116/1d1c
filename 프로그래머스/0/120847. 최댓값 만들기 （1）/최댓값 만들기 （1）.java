class Solution {
    public int solution(int[] numbers) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        for(int n : numbers){
            if(n > max1){
                max2 = max1;
                max1 = n;
            } else if (n > max2){
                max2 = n;
            }
            
            if(n < min1){
                min2 = min1;
                min1 = n;
            } else if(n < min2){
                min2 = n;
            }
        }
        return Math.max(max1 * max2, min1 * min2);
    }
}