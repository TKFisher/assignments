package review.review_01;


public class Strings_02 {

    public static void main(String[] args) {

        String a = "hello";
        String b = "goodbye";

        // Using If statements
       // if (a == b){
            // DON'T COMPARE STRINGS THIS WAY.
            // Use the equals() object below instead for String comparisons because
            // the String is an object data type where as the int and char are primitive
            // data type.
       // }

        if (a.equals("hello"))

        {
            System.out.println(a + " and " + b);
        }

        if (b.equalsIgnoreCase("GooDBye")){
            System.out.println("case is ignored here.");
        }
        //
        if(!a.equalsIgnoreCase("helloxxx")){
            System.out.println("'a' is not 'hello'");
        }

        // Using charAt plus index value
        System.out.println(a.charAt(3) + " is the character in position three. ");

        // Using the indexOf(String s)

        String str = "Hello there yogi there";

        int indexPosition1 = str.indexOf("there");
        System.out.println(indexPosition1 + " is the first index position where 'there' begins.");

        int indexPosition2 = str.indexOf("there", 7);
        System.out.println(indexPosition2 + " is the index postion where the second 'there' begins.");

        int indexPosition3 = str.lastIndexOf("yogi");
        System.out.println(indexPosition3 + " is the position where 'yogi' starts search from right to left. ");


    }


}
