package review.review_02;


public class Recursion {

    public static void main(String[] args) {

        //printHello(10);

        printNumber(4);

    }

    public static void printHello(int num) {

        System.out.println("Hello Tracy");
        num++;
        int count = 0;
        if (num < 20) {
            System.out.println("'num' = " + (count = num));
            printHello(num);
        }else
            System.out.println("The final value for 'num' is: " + num);
    }


    public static int printNumber(int num) {
        if (num == 0) {
            return 0;
        } else {
            System.out.println(num);
            return printNumber(num -1);
        }
    }

}
