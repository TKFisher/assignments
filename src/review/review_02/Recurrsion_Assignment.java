package review.review_02;

/**
 * Return a String from a method that excepts a String parameter as a argument.
 * Also, the '$' must be included between each character of the String.
 * You will need the CharAt() method for this as well as doing it recursively even though
 * there are other ways in doing this.
 */

public class Recurrsion_Assignment {

    public static void main(String[] args) {

        System.out.println(addDollarTwo("hello"));   // h$e$l$l$o
        System.out.println(addDollarTwo("james"));   // j$a$m$e$s

        System.out.println(addDollarOne("hello"));
    }


    public static String addDollarOne(String str) {

        // setting result to $ starts the string out with an $.
        String result = "$";

        for (int i = 0; i < str.length(); i++) {

            result = result + str.charAt(i) + "$";
           // result +=  str.charAt(i) + "$";
        }

        return result;
    }

    public static String addDollarTwo(String str) {

        // loop through each character and add $ to it.
        // and then return the string.

        if (str.length() <= 1) {
            return str;
        }
        return str.charAt(0) + "$" + addDollarTwo(str.substring(1));
    }

}
