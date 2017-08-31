package review.review_03;

public class Fish {

    String fishType;
    int fishWeight;
    int age;
    String eatingStyle;
    String habitat;


    public Fish(String fishType, String eatingStyle, String habitat) {
        this.fishType = fishType;
        this.eatingStyle = eatingStyle;
        this.habitat = habitat;
    }

    public void move() {

    }

    public void eat() {

    }

    public void sleep() {

    }

    public void speak() {

        System.out.println("I am a " + fishType + ".");
        System.out.println("I weigh " + fishWeight + " lb(s)");
        System.out.println("I am " + age + " years old.");
        System.out.println("I love to eat " + eatingStyle + ".");
        System.out.println("I live in the " + habitat + ".");
    }
}
