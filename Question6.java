/*Implement a program that takes an integer input from the user and displays the
factorial of that number using a for loop*/

import java.util.*;
public class Question6{
    public static void main(String[] args){
        Scanner Integer = new Scanner(System.in);

    System.out.println("Enter an Integer:");
     int number =  Integer.nextInt();
     
     long factorial = 1;
  for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
System.out.println("Factorial of " + number + " is: " + factorial);  
      }
}