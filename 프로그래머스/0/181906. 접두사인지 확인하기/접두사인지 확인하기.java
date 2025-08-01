public class Solution {
    public static int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) {
            return 1;
        } else {
            return 0;
        }
    }

    // 예시 실행
    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "ban";
        int result = solution(my_string, is_prefix);
        System.out.println(result); // 출력: 1
    }
}