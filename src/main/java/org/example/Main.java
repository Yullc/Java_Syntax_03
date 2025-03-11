package org.example;

import java.awt.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String msg = greet("Jin"); // 문자만 들어갈 수 있는 msg 변수에 greet이라는 메서드의 인자를 Jin으로 주겠다
        System.out.println(msg); // msg 출력

        Point point = createPoint(5, 10);  //Point객체와 연결된 point변수 createPoint 매개변수를 x=5,y=10이라고 준다.
        System.out.println("Point create at (" + point.x + ", " + point.y + ")");

        int[] evens = firstNEvenNumbers(5);//int[]모양의 객체와 연결된 evens변수 firstNEvenNumbers 메서드를 호출해 5라는 값을 넣어준다.
        System.out.println("first 5 even numbers : " + Arrays.toString(evens)); // String 형식으로 evens를 출력
    }

    public static String greet(String name) { // String 형태의 greet 메서드 매개변수값은 name 즉 Jin을 가져옴
        return "Hello, " + name + "!"; //Hello와 !를 반환
    }

    public static Point createPoint(int x, int y) { //매개변수 값을 int로 가진 createPoint 메서드 x,y에는 main메서드에서 가져온 5,10이 들어감
        return new Point(x, y); //객체Point에 x,y값을 담아서 반환
    }

    public static int[] firstNEvenNumbers(int n) { //int타입의 배열 firstNEvenNumbers메서드, Main클래스에서 인자로 받아온 5
        int[] evenNumbers = new int[n]; // 5개의 공간을 가지고 있는 evevNumbers 객체

        for (int i = 0, num = 2; i < n; i++, num += 2) { //i는 1 num=2 로 값을 넣고 i는 n 즉 5미만일때가지 반복 i는 1씩 증가 num은 2씩 증가
            evenNumbers[i] = num; //evenNumbers 객체에 num을 담는다 i=0일때 num=2 이렇게 i와 num의 차이는 2
        }
        return evenNumbers; //evenNumbers 반환
    }
}
