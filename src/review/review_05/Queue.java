package review.review_05;

// this class will demonstrate the First In First out concept.
public class Queue {

    private int maxSize;            // initializes the set number of slots.
    private long[] queueArray;      // slots to maintain the data.
    private int front;              // the index position for the element in the front.
    private int rear;               // the index position for the element in the rear.
    private int nItems;             // counter to maintain the number of items in the queue.

    public Queue(int size) {

        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {

        if(rear == maxSize -1){
            rear = -1;
        }

        rear++;
        queueArray[rear] = j;
        nItems++;
    }

    public long remove() {
        long temp = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;       // set 'front' back to zero so we can use the entire array again.
        }
        nItems--;
        return temp;
    }

    public long peakFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view() {
        System.out.print("[ ");
        for (int i = front; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println("]");
    }

}
