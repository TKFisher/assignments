package review.review_03;

import java.util.LinkedList;

public class AppCounter {

    public static void main(String[] args) {

        Counter counter1 = new Counter("hello");

        for (int i = 0; i < 10; i++){
        counter1.increment();
        counter1.getCurrentValue();
        }
        System.out.println(counter1);

    }
}
