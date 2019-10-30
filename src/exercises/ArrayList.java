package exercises;

/*Write a static method to find the sum of all the even numbers in a list.
Within main, create a list with at least 10 integers and call your method on the list.
 */

        import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers =
                {1,2,3,4,5,6,7,8,9,10};

        for(int number : numbers ) {

            if(number % 2 == 0) {
                sum = sum + number;
            }
        }
        System.out.println("The sum of  the even numbers is: " + sum);
    }
}
