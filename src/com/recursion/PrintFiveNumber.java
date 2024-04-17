package com.recursion;

public class PrintFiveNumber {
    public static void main(String[] args) {
        printNumber(1);
    }

    private static void printNumber(int n) {
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
}
