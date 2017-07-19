package review.review_02;


public class ForLoopsNested {


    public static void main(String[] args) {

        int counter = 0;


        for (int i = 0; i < 2; i = i + 1) {
            //System.out.println(".I: " + i);


            for (int j = 0; j < 2; j++) {
                System.out.println("I: "  + i + " J: " + j);
                System.out.println("Count equals: " + counter ++);
            }
            }
        System.out.println("Total count equals: " + counter);
        }
    }
