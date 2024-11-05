import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner per = new Scanner(System.in);

        System.out.println("Enter the Length");
        double Length = per.nextDouble();

        System.out.println("Enter the Width");
        double Width= per.nextDouble();

        double Perimeter= (Length+Length)+(Width+Width);

        System.out.println("The Perimiter is:" + Perimeter);


    }

}
