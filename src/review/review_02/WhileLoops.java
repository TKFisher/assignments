package review.review_02;


public class WhileLoops {

    public static void main(String[] args) {

        int count = 0;

        while (!(count >= 10)) {
            System.out.println("Tracy " + count);
            count = count + 1;

            if (count == 5) {
                break;
            }
        }

    }


}
