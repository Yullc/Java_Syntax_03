package org.example;

import java.awt.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        계산기.sum(10,20);
        계산기.sum(10,20);
        계산기.minus(50,20);
    }
}
class 계산기{
    public static void sum(int x, int y){
       System.out.println(x+y);
   }
    public static void minus(int x, int y){
        System.out.println(x-y);
    }
}