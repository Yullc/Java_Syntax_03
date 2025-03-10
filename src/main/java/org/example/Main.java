package org.example;


import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //        int[] aa = new int[3];
        //        aa[0] = "김철수";
        //        aa[1] = 23;
        //        aa[2] 165.3;

        //        (만들어진)객체 == 인스턴스
        //객체안에 있는 변수처럼 동작하는 공간 == 인스턴스변수
        //다양한 타입을 저장할 수 있는 사용자 정의 객체를 만들고 싶어
        chulsoo a = new chulsoo();
        a.name = "김철수";
        a.age = 23;
        a.tall = 165.3;
    }
}
class chulsoo {
    String name;
    int age;
    double tall;
}

