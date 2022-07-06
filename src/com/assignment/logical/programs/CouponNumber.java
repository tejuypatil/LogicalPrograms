package com.assignment.logical.programs;

import java.util.Scanner;
import java.util.Vector;

public class CouponNumber {
    // public static int[] allCoupons=new int[10];
    // vector is a array of unlimited size
    public static Vector<Integer> allCouponsVec=new Vector<Integer>();
    public static int getNewCouponNumber(){
        // Math.random() : 0.0 to 1.0
        // couponNum will be between 0 and 1000
        int couponNum = (int)Math.round(Math.random()*1000);  //generate random coupon number
        while(isCouponNumAlreadyExist(couponNum))
        {
            couponNum = (int)Math.round(Math.random()*1000); //generate another random coupon number
        }

        allCouponsVec.add(couponNum);  //add new coupon number
        return couponNum;
    }

    public static boolean isCouponNumAlreadyExist(int couponNum)
    {
        for (int previousCouponNum:allCouponsVec)
        {
            if(previousCouponNum==couponNum)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Number of Coupons:");
        int numOfCoupons=s.nextInt();

        for (int index = 0; index < numOfCoupons ; index++) {
            System.out.println(getNewCouponNumber());

        }

    }
}
