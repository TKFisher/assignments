package assignment_08;


import ignore.TestUtils_08;

public class App {

    /**
     * Given 3 int arguments - a, b, c, return their sum. However, if one of the arguments
     * is the same as any of the other ones, that number should not count towards the sum.
     * So basically you only sum unique numbers, not duplicates
     * <br>
     * <br>
     * <p>
     * <b>EXPECTATIONS:</b><br>
     * sumUnique(1, 2, 3)   <b>---></b> 6 <br>
     * sumUnique(3, 2, 3)    <b>---></b> 2 <br>
     * sumUnique(3, 3, 3) <b>---></b> 0 <br>
     */

/*    public static int sumUnique(int a, int b, int c) {

        int sum = 0;

        if (a != b && a != c && b != c)
            return sum = a + b + c;
        if (a == b && a == c && b == c)
            return sum = 0;
        if (a == b)
            return sum = c;
        if (a == c)
            return sum = b;
        if (b == c)
            return sum = a;
        if (a != b)
            return sum = a + b;
        if (a != c)
            return sum = a + c;
        if (b != c)
            return sum = b + c;
        return sum;
    }*/


    // Teachers solution:
    public static int sumUnique(int a, int b, int c) {

        if (a == b && b == c) return 0;
        if (a == b) return c;
        if (a == c) return b;
        if (b == c) return a;
        return a + b + c;
    }


    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestUtils_08.runTests();

    }
}