package review.review_01;


public class MyFirstClass {

        public static void main(String[] args) {

            printHello();

            printString("Hello");

            sumThese(5,6);

            int mySum = sumTheseAndReturnValue(4, 10);
            System.out.println(mySum);
        }

        static void printHello() {
            System.out.println("Hello There");
        }

        static void printString(String myString) {

            System.out.println(myString);
        }

        static void sumThese(int firstNum, int secondNum) {

            System.out.println(firstNum + secondNum);
            System.out.println(firstNum - secondNum);
            System.out.println(firstNum / secondNum);
        }

        static int sumTheseAndReturnValue(int firstNum, int secondNum){

            return firstNum + secondNum;
        }
    }
