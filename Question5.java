/*Q2: Write a program to check if a given number is prime. The program should take an
integer as input and output whether it’s a prime number.*/

import java.util.*;
public class Question5{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE INPUT A NUMBER:");
        int Num = input.nextInt();

        double modulus = Num%2;
        
        if(Num==12 || Num<2){
            System.out.println("THE NUMBER IS NOT PRIME");
        }
       else if(Num>1 || Num==2 && modulus == 1) {
            System.out.println("THE NUMBER IS PRIME");

        }
input.close();
    }
}