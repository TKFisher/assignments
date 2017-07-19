package assignment_02;

import ignore.TestUtils_02;

public class App {

    /**
     * You are driving a little too fast, and a police officer stops you.
     * Write code to compute the fine you would have to pay.
     * If your speed is 60 or less, the result is 0 since there is no fine.
     * If speed is between 61 and 80 inclusive, the fine is 100 dollars.
     * If speed is 81 or more, the result is 200.
     * Unless it is a holiday -- on that day, your speed can be 5 higher in all cases. <br>
     * <br>
     * <p>
     * <b>EXPECTATIONS:</b><br>
     * speedingFine(60, false)  <b>---></b> 0 <br>
     * speedingFine (65, false)   <b>---></b> 100 <br>
     * speedingFine (65, true) <b>---></b> 0 <br>
     */



    //Tracy's
/*    public static int speedingFine(int speed, boolean isHoliday) {

        int fine = 0;
        int holidaySpeedIncrease = 5;

        if (isHoliday == false) {
            if (speed <= 60) {
                fine = 0;
            }
            if (speed >= 61 && speed <= 80){
                fine = 100;
            }
            if (speed >= 81){
                fine = 200;
            }
        }

        if (isHoliday) {
            if(speed >= 60 + holidaySpeedIncrease){
                fine = 0;
            }
            if((speed >= 61 + holidaySpeedIncrease) && (speed <= 80 + holidaySpeedIncrease )){
                fine = 100;
            }
            if(speed >= 81 + holidaySpeedIncrease){
                fine = 200;
            }
        }

        System.out.println(fine);
        return fine;

    }*/

    // Another more susinct way from teacher and his favorite way
    public static int speedingFine(int speed, boolean isHoliday){

        int minSpeed = 60;
        int maxSpeed = 80;
        int fine = 0;

        if(isHoliday){
            minSpeed+= 5;
            maxSpeed+=5;
        }
        if (speed >= maxSpeed){
            fine = 200;
        }
        if (speed <= minSpeed){
            fine = 0;
        }
        if (speed > minSpeed && speed <= maxSpeed){
            fine = 100;
        }

        return  fine;

    }


   // the most susinct but confusing and may not be the best way because of that.
/*
    public static int speedingFine(int speed, boolean isHoliday) {

        if (isHoliday) {
            speed -= 5;
        }
        if (speed <= 60)
            return 0;
        if (speed > 60 && speed <= 80)
            return 100;
        else
            return 200;
    }
*/


    //----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
    public static void main(String args[]) {
        TestUtils_02.runTests();

        //speedingFine(60, true);
    }

}

