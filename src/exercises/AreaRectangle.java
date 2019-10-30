package exercises;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is the rectangle length?");
        length = in.nextDouble();

        System.out.println("What is the rectangle width?");
        width = in.nextDouble();

        area = (length * 2) + (width * 2);
        System.out.println("The area of the rectangle is: "+ area);
    }
}
