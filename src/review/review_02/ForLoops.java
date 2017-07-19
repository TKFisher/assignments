package review.review_02;


public class ForLoops {

    public static void main(String[] args) {

        String myString = "very";
        int count = 0;

        for (int i = 0; i <= myString.length(); i = i + 1) {
            count = myString.length();
            System.out.println(count);
        }

        for (int i = 0; i < myString.length(); i = i + 1) {
            System.out.println("char: " + myString.charAt(i));
            //System.out.println("last char: " + myString.lastIndexOf(i));

        }


    }
}
