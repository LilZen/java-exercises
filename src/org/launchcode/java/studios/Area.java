package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double area;
        double radius;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = in.nextDouble();

        if (radius >= 0) {
            area = 3.14 * radius * radius;
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }else {
            System.out.println("Invaild entry.");
        }
    }
}
