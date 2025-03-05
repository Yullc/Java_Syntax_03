package org.example;

// 문제 : 아래와 같이 출력해주세요.

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.

class Main {
    public static void main(String[] args) {
       int i=1;


       while(i<=10){
           int j=1;
               while(j<=3){
                   System.out.println("j="+j);
                   j++;
               }
               i++;
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

