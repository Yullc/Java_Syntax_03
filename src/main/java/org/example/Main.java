package org.example;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
       계산기.합(); //출력 =30
//        계산기.합(); // 출력 =70
        계산기.합(10,20); // 소괄호 요청사항->인자
        계산기.합(30,40);

    }
}

class 계산기{
   //여기서 부터
    static void 합(){ //합()까지가 함수이름 메서드 시그니처
        int a= 10;
        int b = 20;
        System.out.println(a+b);
    }
    static void 합(int a, int b){// int a, int b =외부와 내부를 이어주는 매개변수

        System.out.println(a+b);
    }
    //여기까지가 메소드 오버로딩 -> 다형성

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






