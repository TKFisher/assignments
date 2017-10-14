package review.review_05;

public class App {

    public static void main(String[] args) {

        Queue myQueue = new Queue(5);

        myQueue.insert(100);
        myQueue.view();
        myQueue.insert(1000);
        myQueue.view();
        myQueue.insert(14);
        myQueue.view();
        myQueue.insert(12);
        myQueue.view();
        myQueue.insert(44);
        myQueue.view();
        myQueue.remove();
        myQueue.view();
        myQueue.remove();
        myQueue.view();
        myQueue.remove();
        myQueue.view();

    }
}

