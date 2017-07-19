package review.review_01;



public class Boolean_01 {


    public static void main(String[] args) {

        boolean hungry = (true);
        boolean check = (3 < 0);   // note: this is false

        // try out the different variables above here as well as the method object below in the
        // conditional brackets:
        //    hungry, check, getValue_01(), getValue_02() == true/false

        if (hungry) {
            System.out.println("Let's pig out.");
        } else if (check) {
            System.out.println("you triggered 'check'.");

        } else if (getValue_01()) {
            System.out.println("you triggered getValue01 method. ");

        } else if (getValue_02() == false) {
            System.out.println("you triggered getValue02 method. ");

        } else {
            System.out.println("I'm sleepy and don't care about food. ");
        }
    }

    public static boolean getValue_01() {
        return true;
    }

    public static boolean getValue_02() {

        // return 7<3;                    // returns false
        // return 7<3 || 5>3;             // returns true
        // return 7<3 &&  5>3;            // returns false
        return (7<9) && ((5<3) || (5>3)); // returns true
    }
}
