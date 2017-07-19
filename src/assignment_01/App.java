package assignment_01;

import ignore.TestingUtils;

public class App {

    /**
     * Given a string of odd length, return the middle 3 characters from the string,
     * so the string <b>"Monitor"</b> yields <b>"nit"</b>.
     * If the string length is less than 3, return the string as is. <br> <br>
     * <p>
     * <b>EXPECTATIONS:</b><br>
     * middleThree("bunny") <b>---></b> "unn" <br>
     * middleThree("peter") <b>---></b> "ete" <br>
     * middleThree("Jamaica") <b>---></b>"mai" <br>
     */

    public static String middleThree(String str) {
        String result = str;

        if (str.length() >= 3) {
            int midIndex = str.length()/2;
            result = str.substring(midIndex -1, midIndex +2);

            // 12345
            // 1234567
            // 123456789

        }

        return result;

//        String result = str;
//        String extractedString = null;
//
//        if (result.length() <= 3) {
//            System.out.println(result);
//            return result;
//        } else if (result.length() == 3) {
//            extractedString = result.substring(0, 2);
//        } else if (result.length() == 5) {
//            extractedString = result.substring(1, 4);
//        } else  (result.length() == 7) {
//            extractedString = result.substring(2, 5);
//        }
//        System.out.println(extractedString);
//        return result;
    }


    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestingUtils.runTests();

        //middleThree("can    ");
    }
}
