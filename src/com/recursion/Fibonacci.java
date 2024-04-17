package com.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printNthFibonacciNumber(n));
    }

    private static int printNthFibonacciNumber(int n) {
        // when start with zero th then condition is
//        if(n<2){
//            return n;
//        }

        //when start with 1st
        if(n==1||n==0) return 0;
        if(n==2) return 1;
        return printNthFibonacciNumber(n-1)+printNthFibonacciNumber(n-2);
    }
}
