/*Create a program that converts temperatures between Celsius and Fahrenheit. The
user should input the temperature and the scale they want to convert to.*/
import  java.util.*;
public class  Question2{
    public static void main(String[] args) {
        Scanner Temp = new Scanner(System.in);

        System.out.println("PLEASE INPUT TEMPRATURE");
        double Temprature = Temp.nextDouble();

        System.out.println("Enter the scale");
        double scale = Temp.nextDouble();

        double Celcius = (scale -Temprature) *5/9;
        
        System.out.println("The the Temprature in degrees CELCIUS IS:" + Celcius);
       
    }
}