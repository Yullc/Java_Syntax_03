package org.example;

public class  test {
    public static void main(String[] args) {

        Solution s = new Solution();

        System.out.println(s.solution(1,2,3,4));
    }


}
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int arr[] = new int[] {numer1,denom1,numer2,denom2};
        int a =arr[0]+arr[2];
        int b =arr[1]+arr[3];
        int num[] = new int[] {a,b};
        System.out.println(num[0]+num[1]);

        return num;
    }
}
