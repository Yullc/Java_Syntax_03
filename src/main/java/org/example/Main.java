package org.example;

import java.util.Scanner;


class Main {
    static int a = 20; // 전역변수

    public static void main(String[] args) {
        System.out.println(a);
        int a = 30; // 지역변수
        System.out.println(a);
        계산기.합(10, 20);
    }
}

class 계산기 {

    static void 합() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    static void 합(int a, int b) {

        System.out.println(a + b);
    } // void는 return을 안 할 의무가 있고 void를 빼고 나머지는 return을 해야된다

}

//class Main {
//    public static void main(String[] args) {
//        계산기.합();
//        계산기.합();
//
//
//    }
//}
//
//class 계산기{
//    static void 합(){
//
//        int a=10; // 지역변수
//        int b=20;
//
//        System.out.println(a+b);
//    }
//
//}






