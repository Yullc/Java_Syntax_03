package org.example;

import java.util.Arrays;

public class  test {
    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(9, 2, 1, 3)));
    }


}
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] arr = new int[] {numer1,denom1,numer2,denom2};
        int a =arr[0]+arr[2];
        int b =arr[1]+arr[3];
        int[] num = new int[] {a,b};

        return num;
    }
}
