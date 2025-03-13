package org.example;

import java.util.Arrays;

public class  test {
    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.solution("abcdef","f"));
    }


}
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String arr[] = new String[my_string.length()];
        String arr1[] = new String[letter.length()];

        for(int i = 0; i < my_string.length(); i++) {
            if (arr[i] == arr1[0]) {
                answer = arr[i];
                System.out.println(answer);
            }
            return answer;
        }
        return answer;
    }
}