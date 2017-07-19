package review.review_02;


public class Scratch {


    public static void main(String[] args) {

        System.out.println( sumTwoInts(7, 4));

        changeIntToString(5);
    }

    public static int sumTwoInts(int a, int b){

        // int result;
        int c = 3;
       // result = a + b - c;
        return a + b - c;
    }


    public static void changeIntToString(int number){

        String myString;

        // One way to convert a int to a String.
        myString = String.valueOf(number + 1);
        System.out.println(myString + " text");

        // Another way but more hacky. the number ten is automatically converted to a String in this case.
        String mySecondString = 10 + " another test";
        System.out.println(mySecondString);
    }

}
