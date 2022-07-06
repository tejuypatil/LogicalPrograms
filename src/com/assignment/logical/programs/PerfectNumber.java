package com.assignment.logical.programs;

import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        int n, i, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = s.nextInt();
        for (i = 1; i < n ; i++)
        {
            if (n%i==0)
            {
                sum = sum + i;
            }
        }
        if (sum == n)
            System.out.print("Given number is a Perfect Number");
        else
            System.out.print("Given number is not a Perfect Number");
    }
}




