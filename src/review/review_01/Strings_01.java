package review.review_01;


public class Strings_01 {

    public static void main(String[] args) {

        String a = "Hello";
        System.out.println(a);

        // prints the lenght of the characters
        System.out.println(a.length());

        String str = "ABCDEFG";
        String extractedString = str.substring(1, 3);
        System.out.println(extractedString);

        if (str.length() == 7) {
            System.out.println("You've got it.");
        } else {
            System.out.println("The string is not equal.");
        }

    }


}
