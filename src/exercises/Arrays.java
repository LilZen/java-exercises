package exercises;
/* Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
Then loop through the array and print out each value.
 */

public class Arrays {
    public static void main(String[] args){
        int[] list =
                {1,1,2,3,5,8};

        for (int i : list ){
            System.out.println(i);
        }
    }
}
