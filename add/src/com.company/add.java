package com.company;
import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        System.out.println("Enter first no:");
        Scanner input=new Scanner(System.in);
        int a =input.nextInt();
        System.out.println("Enter second no:");
        Scanner show =new Scanner(System.in);
        int b=input.nextInt(),c;

        c=a+b;
        System.out.println("the sum is "+c);

    }
}
