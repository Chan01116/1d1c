class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 'l') {   // 알파벳 순서에서 'l'보다 앞선 경우
                arr[i] = 'l';
            }
        }
        
        return new String(arr);
    }
}