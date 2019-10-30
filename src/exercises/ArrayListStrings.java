package exercises;
/* Write a static method to print out each word in a list that has exactly 5 letters. */

public class ArrayListStrings {
    public static void main(String[] args) {
        String word = "";
        String[] wordList =
                {"Hello", "Welcome", "happy", "wonderful", "spark", "loves", "magic", "bye"};

        for (String words : wordList) {
            char[] tempChar = words.toCharArray();
            int len = words.length();

            if (len == 5) {
                word =
                        word + " " +new String (tempChar);
            }
        }
        System.out.println("The words with 5 letters are: " + word);


    }
}