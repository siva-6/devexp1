package com.mycompany.mavenproject4;

import java.util.Scanner;

public class Mavenproject4 {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
       
        System.out.println("Enter the first number:");
        int a = add.nextInt();
       
        System.out.println("Enter the second number:");
        int b = add.nextInt();
       
        System.out.println("Addition of two numbers = " + (a + b));
       
        add.close();
    }
}
