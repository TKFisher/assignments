package review.review_02;


public class Modulus {

    public static void main(String[] args) {

        int ten = 10;
        int three = 3;

        System.out.println(ten % three);

        System.out.println(" ************** " + "\n");

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(i);
            numbers[i] = i;
        }

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }

        }
    }
}
