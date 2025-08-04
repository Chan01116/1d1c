public class Solution {
    public static String solution(String my_string, int[] index_list) {
        StringBuilder result = new StringBuilder();

        for (int index : index_list) {
            result.append(my_string.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String my_string = "abcdefg";
        int[] index_list = {1, 3, 4, 6};

        String result = solution(my_string, index_list);
        System.out.println(result); 
    }
}