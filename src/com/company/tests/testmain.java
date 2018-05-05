package com.company.tests;

public class testmain {
    public static void main(String[] args){


    }

    static int sum(int ...num){
        int sum = 0;
        for (int n:num ) {
            sum += n;
        }
        return sum;
    }

    static int factorial(int x){

        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }


}
