package review.review_02;



public class Strings_Additional_Methods {

    public static void main(String[] args) {

        // example of startsWith and endsWith
        String sentence1 = "There is a small boat by the doc";
        String sentence2 = "There were several people at the party";

        System.out.println(sentence1.startsWith("There"));
        System.out.println(sentence2.endsWith("doc"));


        // example of casting an int to a String
        int age = 29;
        String ageAsString = String.valueOf(age);
        System.out.println(ageAsString + 27);


        // example of casting a boolean to a String
        String booleanAsString = String.valueOf(sentence2.endsWith("doc"));
        System.out.println(booleanAsString);


        // another way to convert an int to a String is by adding a space after the int value.
        String ageAsString2 = 29 + "";
        System.out.println(ageAsString2);


    }
}
