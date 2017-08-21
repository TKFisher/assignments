package assignment_12;

import ignore.TestUtils_12;

public class App {


    /**
     * Return a version of the given string, where for every star (*)
     * in the string the star and the chars immediately to its left and right are gone.
     * So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 	<br>
     * <br>
     * <p>
     * <b>EXPECTATIONS:</b><br>
     * starKill("cd*zq")  <b>---></b>"cq"<br>
     * starKill("ab**cd")    <b>---></b> "ad" <br>
     * starKill("wacy*xko") <b>---></b> "wacko" <br>
     * <p>
     *
     */


    // My attempt but got stuck and need to review the solution.
    // TODO: complete this with another solution
    public static String starKill(String str) {

        String searchString = "*";
        int index = str.indexOf(searchString);
        String result = "";

        while (index >= 0) {
            System.out.println(index);

            result += str.substring(0, index);
            System.out.println(result);

            index = str.indexOf(searchString, index + 1);
        }

        return result;
    }



    /*
    public static String starKill(String str) {

        int length = str.length();
        String result = "";

        for (int i = 0; i < length; i++) {

            if (i == 0 && str.charAt(i) != '*')
                result += str.charAt(i);

            if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*')
                result += str.charAt(i);

            if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*')
                result = result.substring(0, result.length() - 1);
        }

        System.out.println(result);
        return result;
    }
*/

    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestUtils_12.runTests();

    }


}