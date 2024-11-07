/*Create a Java program that prompts the user to enter a grade (A, B, C, D, F). Using a
switch statement, print out a message based on the grade (e.g., "Excellent" for A, "Good"
for B, etc.)*/

import java.util.*;
public class Question4{
    public static void main(String[] args){
        Scanner grade = new Scanner(System.in);

        System.out.println("Please Enter The Grade(A,B,C,D,F)");
        char Letter = grade.next().charAt(0);

        switch (Letter){
            case 'A':
            System.out.println("Excellent");

            break;
            case 'B':
            System.out.println("Very Good");
             break;

             case 'C':
             System.out.println("Good");
             break;

             case 'D':
             System.out.println("Fair");
             break;

             case 'F':
             System.out.println("Fail");
             break;

             default:
             System.out.println("You have chosen the Wrong grade");
             break;
        }
        grade.close();
    }
}
