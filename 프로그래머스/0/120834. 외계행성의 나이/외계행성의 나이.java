class Solution {
    public String solution(int age) {
       StringBuilder sb = new StringBuilder();
        String str = String.valueOf(age);
        for (int i = 0; i < str.length(); i++) {
            sb.append((char)('a' + (str.charAt(i) - '0')));
        }
        return sb.toString();
     }
    }