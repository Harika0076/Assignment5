package com.Assignment5;
import java.util.Scanner;

public class LeapYearDemo {
    public static void main(String[] args){
        int leap;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the leap year");
        leap=sc.nextInt();
        if(leap>=1582) {
            int a = leap % 4;
            if (a == 0) {
                System.out.println(leap + "is a leap year");
            } else {
                System.out.println(leap + "is not a leap year");
            }
        }else{
            System.out.println(leap+"is not a valid year according to Gregorian calendar");
        }
    }
}
