package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int m=1; m<=b; m++){
            for(int n=1; n<=a-1; n++){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}



//1.
//int i=1;
//        while (i<6){
//        System.out.println(i);
//i++;
//        }

//2.int i=100;
//        while (i>=25){
//            System.out.println(i);
//            i--;
//
//        }

//3. int dan =8;
//        int i=1000;
//
//        while(i>=1){
//            System.out.println(dan+"x"+i+"="+dan*i);
//            i--;
//
//        }

//4. int dan =8;
//        int i=1000;
//
//        while(i>=-500){
//            System.out.println(dan+"x"+i+"="+dan*i);
//            i--;
//
//        }

//5. int i=1;
//       int sum=0;
//       while(i<=5){
//           sum=sum+i;
//           i++;
//       }
//
//        System.out.println(sum);
//

//6. int i=100;
//        int sum=0;
//        while(i>=25){
//            sum=sum+i;
//            i--;
//        }
//
//        System.out.println(sum);

//7.    int i=1;
//
//       while(i<=10){
//        int j=1;
//        while(j<=3){
//            System.out.println("j="+j);
//            j++;
//        }
//        i++;
//    }
//

//for1.  for(int i=1; i<=5; i++){
//        System.out.println(i);
//
//    }

//for2. for(int i=-100; i<=25; i++){
//            System.out.println(i);
//
//        }
//    }

//for3.  for(int i=1000; i>=1; i--){
//            System.out.println("8x"+i+"= "+i*8);
//
//        }
//    }

//for4.for(int i=1000; i>=-500; i--){
//            System.out.println("8x"+i+"= "+i*8);
//
//        }

//for5. int sum=0;
//        for(int i=1; i<=5; i++){
//            sum=sum+i;
//        }
//        System.out.println("sum = " + sum);

//for6.   int sum=0;
//        for(int i=-100; i<=25; i++){
//            sum=sum+i;
//        }
//        System.out.println("sum = " + sum);

//for7.   int i=10;
//        for( i=1; i<=10; i++){
//            int j=3;
//            for(j=1; j<=3; j++){
//                System.out.println(j);
//            }
//        }


