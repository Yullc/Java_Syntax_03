package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("");

        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[0]);
        long c = Long.parseLong(input[0]);

        System.out.println(a+b+c);
    }
}


//Scanner sc = new Scanner(System.in);
//        int time = sc.nextInt();
//        int minute = sc.nextInt();
//        int plus = sc.nextInt();
//
//        int time1;
//        int minute1;
//
//        if (minute+plus < 60) {
//            minute1= minute+plus;
//
//            System.out.println(minute1+"minute1");
//        }
//        else if (minute+plus>=60){
//
//            time1= (minute+plus)/60;
//            minute1=(minute+plus)%60;
//
//            time+=time1;
//            minute+=minute1;
//
//            System.out.println(time+"time");
//            System.out.println(minute+"minute");
//            if(minute==60){
//                minute=0;
//                time++;
//            }
//        }
//
//        System.out.println(time+" "+minute);