package org.example;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d;
        int e;

        for (int i = 0; i < c; i++) {
            if (b < 60) {
                b++;

            }

            else if (b+c>=60){
              d= b/60;
              e=b%60;
              for(int j=0; j<=e; j++){
                  b++;
              }
              a+=d;
            }
        }
        System.out.println(a+" "+b);
        }
}
