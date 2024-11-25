/*Create a Car class with properties like  model, year, and color. Add methods
to start the car, stop it, and display its details. Create multiple objects and demonstrate
calling these methods */

import java.util.*;
class Car{
    String CarName;
    String Model;
    int Year;
    String Color;

     public void StarCar(){ 
            System.out.println("Start Car:");
     }
     public void StopCar(){ 
        System.out.println("Stop Car:");
 }
}

public class Question10{
    public static void main(String[] args){
        Scanner customer = new Scanner(System.in);
        Car Ford = new Car();

        System.out.println("What is the Name of the Car:");
        Ford.CarName = customer.nextLine();

        System.out.println("What is the Model of the Car:");
        Ford.Model = customer.nextLine();

        System.out.println("What is the Color of the Car:");
        Ford.Color = customer.nextLine();

        System.out.println("Which year was the car made:");
        Ford.Year = customer.nextInt();

      

        System.out.println("THE CAR IS A"+" "+ Ford.CarName + " " + Ford.Model +" "+ "Made in"+" "+Ford.Year + " " + "AND ITS"+" "+ Ford.Color);

        Ford.StarCar();
        Ford.StopCar();

        System.out.println("HAVE A safe RIDE");
    }
}