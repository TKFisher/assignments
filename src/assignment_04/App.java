package assignment_04;

import ignore.TestUtils_04;

public class App {


    /**
     * The birds in Florida like to sing during favorable temperatures.
     * In particular, they sing if the temperature is between 60 and 90 (inclusive).
     * Unless it is summer, then the upper limit is 100 instead of 90.
     * Given an int temperature and a boolean isSummer,
     * return true if the birds are singing and false otherwise. <br>
     * <br>
     * <p>
     * <b>EXPECTATIONS:</b><br>
     * birdsSinging(70, false)   <b>---></b> true <br>
     * birdsSinging(95, false)    <b>---></b> false <br>
     * birdsSinging(95, true) <b>---></b> true <br>
     */


    public static boolean birdsSinging(int temp, boolean isSummer) {

        boolean midRangeTemp = (temp >= 60) &&  temp <= 90;
        boolean higherRangeTemp = (temp >= 60) && (temp <= 100);
        //boolean outOfRange = false;

        if(!isSummer){
            if(midRangeTemp)
            return true;
        }
        else if(isSummer){
            if(higherRangeTemp)
                return true;
        }
        return false;

    }
    // another way; note: you don't need the "else" either here
/*    public static boolean birdsSinging(int temp, boolean isSummer) {

        if (isSummer) {
            return temp >= 60 && temp <= 100;
        } else
        return temp >= 60 && temp <= 90;
    }*/

    // Using a ternary operator
/*    public static boolean birdsSinging(int temp, boolean isSummer) {

        // IF isSummer    DO this                       ELSE DO this
        return (isSummer) ? (temp >= 60 && temp <= 100) : (temp >= 60 && temp <= 90);
    }*/

    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestUtils_04.runTests();


    }
}
