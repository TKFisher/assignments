package assignment_11;

import ignore.TestUtils_11;

public class App {

    /**
     * Given a string, return a string where for every char in the original, append another.
     * <br>
     * <br>
     * <p>
     * <b>EXPECTATIONS:</b><br>
     * repeatChar("The")  <b>---></b>"TThhee"<br>
     * repeatChar("AAbb")    <b>---></b> "AAAAbbbb" <br>
     * repeatChar("Hi-There") <b>---></b> "HHii--TThheerree" <br>
     */

/*    public static String repeatChar(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i = i + 1) {
            result = result + str.charAt(i) + str.charAt(i);
        }

        //System.out.println(result);
        return result;
    }*/


    public static String repeatChar(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char aChar = str.charAt(i);
            result = result + aChar + aChar;
            // A shortcut:
            //result += "" + aChar + aChar;

        }
        return result;
    }


    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestUtils_11.runTests();

        //repeatChar("the");
    }


}