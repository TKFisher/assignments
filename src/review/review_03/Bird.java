package review.review_03;

public class Bird {


    String birdType;
    int birdWeight;
    int birdAge;
    String birdEatingStyle;
    String birdHabitat;


    public Bird(String birdType, String birdEatingStyle, String birdHabitat) {
        this.birdType = birdType;
        this.birdEatingStyle = birdEatingStyle;
        this.birdHabitat = birdHabitat;
    }

    public void move() {

    }

    public void eat() {

    }

    public void sleep() {

    }

    public void speak() {

        System.out.println("I am a " + birdType + ".");
        System.out.println("I weigh " + birdWeight + " lb(s)");
        System.out.println("I am " + birdAge + " years old.");
        System.out.println("I love to eat " + birdEatingStyle + ".");
        System.out.println("I live in a " + birdHabitat + ".");
    }


}
