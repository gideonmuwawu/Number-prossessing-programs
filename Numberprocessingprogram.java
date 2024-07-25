/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.processingprogram;
import java.util.Scanner;

/**
 *
 * @author GIDEON MUWAWU
 */
public class Numberprocessingprogram {
    public static void main(String[] args){
        Scanner save = new Scanner(System.in);
       System.out.println("Enter the first number:");
       double number1 = save.nextDouble();
       System.out.println("Enter the second number:");
       double number2 = save.nextDouble();
       System.out.println("Enter the third number:");
       double number3 = save.nextDouble();
       // calculate product,sum and maximum
       double Product = number1 * number2 * number3;
       double Sum = number1 + number2 + number3;
       double Max = Math.max(Math.max(number1,number2), number3);
       System.out.println("\nProduct" + (number1*number2 * number3));
       System.out.println("\nSum" + (number1 + number2 + number3));
       System.out.println("\nmax" + (Math.max(Math.max(number1,number2), number3)));
    }
}
