package org.example;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        System.out.println(c);
        for(int i='a'; i<=c; i++){
            System.out.println(c);
        }
    }
}
