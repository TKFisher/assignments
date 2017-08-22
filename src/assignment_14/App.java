package assignment_14;


import ignore.TestUtils_14;

public class App {

    /**
     * Given 2 arrays that are the same length containing strings, compare the 1st string in one array
     * to the 1st string in the other array, the 2nd to the 2nd and so on.
     * Count the number of times that the 2 strings are non-empty and start with the same char.
     * The strings may be any length, including 0.
     * <br>
     * <br>
     * <p>
     * <b>EXPECTATIONS:</b><br>
     * matchingChar({"aa", "bb", "cc"}, {"aaa", "xx", "bb"})  <b>---></b> 1<br>
     * matchingChar({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) <b>---></b> 2 <br>
     * matchingChar({"aa", "bb", "cc"}, {"", "", "ccc"}) <b>---></b> 1 <br>
     */

    // Tracy's solution
    public static int matchingChar(String[] a, String[] b) {

        int count = 0;

        // iterate through either of the arrays to kick off interation
        for (int i = 0; i < a.length; i = i + 1) {
            if ((a[i].equals("") || b[i].equals(""))) {
                // do nothing in this case
            }  else if
                (a[i].charAt(0) == b[i].charAt(0))
            {
                // add to the count in this case
                count++;
            }}

        return count;
    }

    // Teacher's solution
/*    public static int matchingChar(String[] a, String[] b) {

        int count = 0;

        for (int i = 0; i < a.length; i = i + 1) {
            String str1 = a[i];
            String str2 = b[i];

            if (!str1.equals("") && !str2.equals("")) {
                if (str1.charAt(0) == str2.charAt(0))
                    count++;
            }
        }
        return count;
    }*/


    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestUtils_14.runTests();

    }

}