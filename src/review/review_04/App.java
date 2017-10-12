package review.review_04;

public class App {

    public static void main(String[] args) {

        Stack myStack = new Stack(4);

        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        // applies to the Stack class
//        while (!myStack.isEmpty()){
//            long value = myStack.pop();
//            System.out.println(value);
//        }

        // applies to the ReverseStringStackMethod
        System.out.println(reverseString("Mississippi"));
    }

    public static String reverseString(String str) {
        int stackSize = str.length();  // get the max stack size.
        ReverseStringStack theStack = new ReverseStringStack(stackSize);  // we make the stack.
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // getting a char from the input string.
            theStack.push(ch);
        }

        String result = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            result = result + ch; // appending to the output
        }
        return result;
    }

}
