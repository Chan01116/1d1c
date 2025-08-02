import java.util.Arrays;

public class Solution {
    public static String[] solution(String my_string) {
        int len = my_string.length();
        String[] suffixes = new String[len];

        // 접미사 생성
        for (int i = 0; i < len; i++) {
            suffixes[i] = my_string.substring(i);
        }

        // 사전순 정렬
        Arrays.sort(suffixes);

        return suffixes;
    }

    // 예시 실행
    public static void main(String[] args) {
        String my_string = "banana";
        String[] result = solution(my_string);
        System.out.println(Arrays.toString(result)); 
        // 출력: [a, ana, anana, banana, na, nana]
    }
}