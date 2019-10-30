package exercises;
import java.util.Scanner;

public class DrivenMiles {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double milesPerGallon;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        miles = in.nextDouble();

        System.out.println("How many gallons of gas did your vehicle consume?");
        gallons = in.nextDouble();

        milesPerGallon = miles / gallons;
        System.out.println("Your vehicle used "+ milesPerGallon + " miles-per-gallon.");
    }
}
