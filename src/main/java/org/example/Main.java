package org.example;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("\\.");
        System.out.println(s[0]);
        System.out.println(s[1]);
    }
}
