public class Solution {
    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            result.append(my_strings[i].substring(start, end + 1));
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 10}};

        String result = solution(my_strings, parts);
        System.out.println(result);
    }
}