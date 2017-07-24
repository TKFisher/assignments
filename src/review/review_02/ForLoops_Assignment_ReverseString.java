package review.review_02;



public class ForLoops_Assignment_ReverseString {

    public static void main(String[] args) {

        String myString = "very";
        //int count = myString.length();

        for (int i = 0; i < myString.length();  i=i+1) {
            System.out.println("char: " + myString.charAt(i));
        }

       // System.out.println(count);
       // String extractedString = myString.substring(1,3);

        //char[] lettersOfString = myString.toCharArray();

        for(int i = myString.length() -1;   i >= 0; i = i - 1)
        {
            //System.out.println(lettersOfString[i]);
            //OR:

            System.out.println(myString.charAt(i));
        }
    }

}
