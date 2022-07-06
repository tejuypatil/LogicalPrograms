package com.assignment.logical.programs;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Enter the Fibonacci Series:" + n + "terms:");
        for (int i = 1; i <=n ;++i) {
            System.out.print(firstTerm +",");
            int sum = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = sum;
        }
    }
}