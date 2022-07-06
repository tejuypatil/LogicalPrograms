package com.assignment.logical.programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int a,n;
        int result=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=s.nextInt();
        while(n!=0)
        {
            a=n%10;
            result=(result*10)+a;
            n=n/10;
        }
        System.out.println("Reverse number is :" +result);
    }

}
