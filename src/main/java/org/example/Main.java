package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" 77");
        long sum =0;

        for(String inputData : input){
            sum+= Long.parseLong((inputData));
        }

        System.out.println(sum);
    }
}