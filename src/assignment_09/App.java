package assignment_09;

import ignore.TestUtils_09;

public class App {

    /**
     * Given 2 positive int arguments (a, b), return whichever argument is
     * nearest to the number 21 without going over.
     * Return 0 if they both go over 21.
     * <br>
     * <br>
     * <p>
     * <b>EXPECTATIONS:</b><br>
     * nearestTwentyOne(19, 21)   <b>---></b> 21 <br>
     * nearestTwentyOne(21, 19)    <b>---></b> 21 <br>
     * nearestTwentyOne(19, 22) <b>---></b> 19 <br>
     * nearestTwentyOne(32, 22) <b>---></b> 0 <br>
     * <p>
     * <p>
     * return a if a is greater than b and less than 22.
     * return b if b is greater than a and less than 22.
     * return zero if a and b are greater than 21.
     * <p>
     * return 19 if b(20) is greater than a(19) and
     */

    public static int nearestTwentyOne(int a, int b) {

        if (a > 21 && b > 21) return 0;
        if (a > b && (a <= 21)) return a;
        if (a > b && !(a <= 21)) return b;
        if (b > a && (b <= 21)) return b;
        if (b > a && !(b <= 21)) return a;

        System.out.println(" 'a' and 'b' must both equal 21.");
        return 21;
    }

      // teacher's solution
/*    public static int nearestTwentyOne(int a, int b) {

        if (a > 21 && b > 21) return 0;
        if (a > 21 && b <= 21) return b;
        if (a <= 21 && b > 21) return a;

        if (a > b) return a;
        else return b;
    }*/


    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestUtils_09.runTests();
    }


}