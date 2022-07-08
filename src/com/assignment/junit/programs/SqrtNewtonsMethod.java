package com.assignment.junit.programs;

import java.util.Scanner;

public class SqrtNewtonsMethod {
    //initialize t =c
    //replace t with the average of c/t and t
    //repeat until desired accuracy reached using condition Math.abs(t-c/t)>epsilon*t
    //epsilon =1e-15
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        double c=s.nextInt();
        double epsilon = 1e-15;
        double t = c;

        while (Math.abs(t - c/t) > epsilon*t)
        {
            t = (c/t + t) / 2.0;
        }

        System.out.println("Square root of number is: " +t);
    }
}


