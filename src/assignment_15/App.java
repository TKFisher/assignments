package assignment_15;

import ignore.TestUtils_15;

public class App {

    /**
     * Given a string, return the length of the longest streak of the same chars in the string.
     *
     * Hint: For every character compare it to all of the other characters.
     * If there is a match then you increment the counter by 1.
     * Review For Loops and Nested Loops.
     *
     * <p>
     * <br>
     * <br>
     * <p>
     * <b>EXPECTATIONS:</b><br>
     * longestStreak("hayyeu") <b>---></b> 2<br>
     * longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
     * longestStreak("")  <b>---></b> 0 <br>
     */

    public static int longestStreak(String str) {

        int maxResult = 0;

        // loop through the i index.
        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            //compare i with all of the other characters in j index
            for (int j = i; j < str.length() ; j++) {

                // if there is a match add it to 'count'
                if (str.charAt(i) == str.charAt(j))
                    count++;
                else
                    break;
            }
            if (count > maxResult)
                maxResult = count;
        }

        System.out.println(maxResult);
        return maxResult;
    }


    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestUtils_15.runTests();

        //longestStreak("lsscaaassfffff");

    }

}