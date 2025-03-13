package org.example;

import java.util.Arrays;

public class  test {
    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.solution(2,10));
    }


}
class Solution {
    public int solution(int n, int t) {
        int answer = 1;
        for (int i=1; i<=t+1; i++){

            answer=answer*n;

        }

        return answer;
    }
}