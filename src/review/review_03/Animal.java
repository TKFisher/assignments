package review.review_03;


public class Animal {

    String animalType;
    String animalClassification;
    String gender;
    int weight;
    int age;
    String eatingStyle;

    public Animal(String animalType, String animalClassification, String gender, int weight, int age, String eatingStyle) {
        this.animalType = animalType;
        this.animalClassification = animalClassification;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
        this.eatingStyle = eatingStyle;
    }

    public void speak() {
        System.out.println("Hello, I am a " + animalType + " and I am a " + animalClassification);
        System.out.println("I am " + weight + " lb(s).");
        System.out.println("I am " + age + " years old.");
        System.out.println("I am a " + eatingStyle + ".");

    }

    public void eat() {
        System.out.println("Animals eat either meat or plants.");

    }

    public void sleep() {
        System.out.println("Animals sleep during the day a lot. ");

    }


}
