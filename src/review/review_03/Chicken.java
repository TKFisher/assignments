package review.review_03;


public class Chicken extends Bird {


    public Chicken(String animalType, String animalClassification, String gender, int weight, int age, String eatingStyle) {
        super(animalType, animalClassification, gender, weight, age, eatingStyle);

    }

    // overwrite move() method from Bird class.
    public void move(){
        System.out.println("I only move with my legs.");
    }



}
