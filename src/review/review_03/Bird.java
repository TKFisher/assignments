package review.review_03;

public class Bird extends Animal {

    public Bird(String animalType, String animalClassification, String gender, int weight, int age, String eatingStyle) {
        super(animalType, animalClassification, gender, weight, age, eatingStyle);
    }

    public void move() {
        System.out.println("Birds use their wings to move. ");
    }

    public void eat() {

    }

    public void sleep() {

    }


}
