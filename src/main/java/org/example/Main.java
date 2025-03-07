package org.example;


import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] time = str.split("");
        if(str.length()==8){
            System.out.println(time.length);
            if (time[3]=="0"&&time[4]=="0"){
                System.out.println("0");
            }
            else{
                System.out.println(time[3]+time[4]);
            }
        }
        else{
            System.out.println(time.length);
            System.out.println(time[0]+time[6]);
            if (time[2]=="0"&&time[3]=="0"){

                System.out.println("0");
            }
            else {
                System.out.println(time[2]+time[3]);
                System.out.println(time[2]+time[3]);
            }
        }

    }
}
