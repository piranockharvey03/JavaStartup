/*Write a Java program that takes two numbers from the user, performs basic
arithmetic operations (addition, subtraction, multiplication, and division), and displays
the results*/


import java.util.*;
public class Question1{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);

//Extracting values from the user
        System.out.println("PLEASE ENTER THE TWO NUMBERS");
        System.out.println("NUMBER 1:");
        int Num1 = Input.nextInt();

        System.out.println("NUMBER 2:");
        int Num2 = Input.nextInt();

//Performing the calculations
        double sum=Num1 + Num2;
        
        double Difference=Num1 - Num2;
        
        double division= sum/2;
        
       double product= Num1 * Num2;
        
//Outputting the Outcomes
        System.out.println("The total is:"+ sum);
        System.out.println("The product is:"+ product);
        System.out.println("The Difference is:"+ Difference);
        System.out.println("After Division the Value is:"+ division);

    }
}