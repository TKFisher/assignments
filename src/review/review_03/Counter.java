package review.review_03;

public class Counter {

    private String name = null;
    private int valueCounter = 0;

    // Excepts a string to represent the name of the particular instance.
    public Counter(String str) {
        this.name = str;

    }

    // Advances to the next available number.
    public void increment() {
        valueCounter++;

    }

    // Returns and int.
    public int getCurrentValue() {
        return valueCounter;
    }

    // Returns the string that is passed via Counter object plus the counter value.
    public String toString() {
        return name + ": " + valueCounter;
    }

}
