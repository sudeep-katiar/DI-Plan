package com.di.basicprograms;

import java.util.Scanner;
/*
 * Java Program to check Armstrong number.
 *
 * @author  :  Sudeep Kumar Katiar
 *  @version :  1.0
 *  @since   :  27-03-2020
 */
public class Armstrong {

    public static void main(String[] args)  {
        int c=0,a,temp;
        Scanner number = new Scanner(System.in);
        System.out.println("enter a number");
        int n=number.nextInt();//It is the number to check armstrong
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }

}
