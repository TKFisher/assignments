package assignment_13;


import ignore.TestUtils_13;

public class App {

    /**
     * Given an array of strings, return the count of the number of strings with the given length	<br>
     * <br>
     * <p>
     * <b>EXPECTATIONS:</b><br>
     * wordsCount({"a", "bb", "b", "ccc"}, 1) <b>---></b> 2<br>
     * wordsCount({"a", "bb", "b", "ccc"}, 3) <b>---></b> 1 <br>
     * wordsCount({"a", "bb", "b", "ccc"}, 4) <b>---></b> 0 <br>
     */

    public static int wordsCount(String[] words, int len) {

        int count = 0;
        // iterate through all of the words
        for (int i = 0; i < words.length; i++) {

            // match the length of each string to the param that is  being passed.
            if (words[i].length() == len) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }


    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestUtils_13.runTests();

        wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1);

    }

}