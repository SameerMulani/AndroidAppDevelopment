package com.myjava;
import java.util.Scanner;
import java.lang.Math;

public class Assignment1 {
    public static void main(String[] args){
        //QUESTION 1:

//        Scanner inp = new Scanner(System.in);
//        System.out.println("Please enter a number:");
//        int num = inp.nextInt();
//        if(num==0){
//            System.out.println("Not a neon number.");
//        }
//        int multi = num * num;
//        int neon = 0;
//        while(multi>0){
//            int n = multi %10;
//            neon = neon + n;
//            multi=multi/10;
//        }
//        if (neon == num){
//            System.out.println("It is a neon number.");
//        }else{
//            System.out.println("It is not a neon number.");
//        }


        // QUESTION 2:
//        Scanner arm = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int num = arm.nextInt();
//        int count = 0;
//        double armstrong=0;
//        if(num==0){
//            System.out.println("It is not an Armstrong Number.");
//        }else if(num<0){
//            System.out.println("It is not an Armstrong Number.");
//        }
//        int a = num;
//        while(a>0){
//            a=a/10;
//            count++;
//        }
//        while(num>0){
//            double n = num % 10;
//            armstrong= armstrong + Math.pow(n,count);
//            num=num/10;
//        }
//      //  System.out.println((int)armstrong);
//        if((int)armstrong==num){
//            System.out.println("It is an Armstrong Number");
//        }else {
//            System.out.println("It is not an Armstrong Number");
//        }

        //QUESTION 3:

//        Scanner inp = new Scanner(System.in);
//        long n,p,x,c=0,i,rev;
//        long sum=0;
//        System.out.println("Please Enter a Number: ");
//        n= inp.nextLong();
//        p=n;
//        x=n;
//        while(p>0)
//        {
//            p=p/10;
//            c++;
//        }
//        if(c!=10)
//        {
//            System.out.println("Not an ISBN Number: "+n);
//        }
//        else
//        {
//            while(x>0)
//            {
//                rev=x%10;
//                sum=sum+(rev*c);
//                x=x/10;
//                c--;
//            }
//            if(sum%11==0)
//            {
//                System.out.println("It is an ISBN Number: "+n);
//            }
//            else
//            {
//                System.out.println("It is not an ISBN Number: "+n);
//            }

    }


}
