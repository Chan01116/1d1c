import java.util.Locale;

class Solution {
    public String solution(String myString) {
        return myString.toLowerCase(Locale.ROOT).replace('a', 'A');
    }
}