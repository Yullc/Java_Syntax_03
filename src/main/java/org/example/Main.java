package org.example;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a =0;

        while (true){
            System.out.println("숫자 : ");
            try {
                a = sc.nextInt(); // 대기 숫자 입력 할 때까지
                sc.nextLine();// 버퍼를 비운다
                break;
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("숫자 똑바로 써");

            }
        }
        System.out.printf("입력된 숫자: %d\n", a);

        sc.close();
    }
}


