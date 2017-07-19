package review.review_02;

/* Print all of the even numbers between 0-100 inclusive of the zero and one hundred.   */

public class ForLoops_Assignments_PrintEvenNumbers {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 0; i <= 100; i = i + 2) {         // or:  i+=2
            System.out.println(i);

            // Adding a counter allows you to step through via the debugger and what how things are passed:
//            int temp = counter +1;
//            counter = temp;
            //or:
            counter = counter + 1;
        }

    }
}
