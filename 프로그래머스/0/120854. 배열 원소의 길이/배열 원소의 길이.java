class Solution {
    public int[] solution(String[] strlist) {
        return java.util.Arrays.stream(strlist)
                                .mapToInt(s -> s.length())
                                .toArray();
    }
}