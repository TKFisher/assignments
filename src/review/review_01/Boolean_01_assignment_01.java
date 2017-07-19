package review.review_01;

/*
* We have a loud barking dog. The hour parameter is the current hour time in the range 0 ..23   .
* We are in trouble if the dog is barking and the hour is before 7 or after 20.
* Return true if we are in trouble.
* */


public class Boolean_01_assignment_01 {

    public static void main(String[] args) {

        // testing:
        dogTrouble(true, 6);
        dogTrouble(true, 7);
        dogTrouble(false, 6);


        // testing:
        dogTroubleSolution_1(true, 6);
        dogTroubleSolution_1(true, 7);
        dogTroubleSolution_1(false, 6);


        // testing:
        dogTroubleSolution_2(true, 6);
        dogTroubleSolution_2(true, 7);
        dogTroubleSolution_2(false, 6);

    }

    public static boolean dogTrouble(boolean barking, int hour) {

        if ((barking == true) && (((hour > 20) && (hour <= 24)) || ((hour >= 0) && (hour < 7)))) {
            System.out.println("Bad dog.");
            return true;
        } else if ((barking == true) && ((hour >= 7) && (hour <= 20))) {
            System.out.println("No problemo! Have a good bark. ");
            return true;
        } else if (barking == false) {
            System.out.println("Not barking. ");
        }
        return true;
    }

    public static boolean dogTroubleSolution_1(boolean barking, int hour) {

        if (barking) {
            if (hour < 7 || hour > 20) {
                System.out.println(barking);
                return true;
            } else {
                System.out.println(barking);
                return false;   // not in trouble
            }
        } else {
            System.out.println(barking);
            return false;     // not in trouble
        }
    }


    public static boolean dogTroubleSolution_2(boolean barking, int hour) {

        System.out.println(barking);
        return (barking && (hour < 7 || hour > 20));
    }


}





