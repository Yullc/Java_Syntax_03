package org.example;

class Main {
    public static void main(String[] args) {
        boolean result = Math.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(3);
        System.out.println("3은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(9);
        System.out.println("9은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(13);
        System.out.println("13은(는) 소수인가? : " + result);

        int rs = one_to_n_prime_numbers_count(10);
        System.out.println("rs 10: " + rs);
        // rs : 4
        rs = one_to_n_prime_numbers_count(13);
        System.out.println("rs 13: " + rs);
        // rs :  6

    }
    private static int one_to_n_prime_numbers_count(int i) {
        int count = 0;
            for(int k=2; k<i; k++){
                if(i%k==0){
                    count++;
                }

        }
        return count;
    }
}

class Math {
    public static boolean isPrimeNumber(int num) {

        if (num == 1) {
            return false;
        }


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}