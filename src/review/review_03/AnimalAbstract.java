package review.review_03;

public abstract class AnimalAbstract {

    int age;
    String gender;
    int weightInPounds;

    public AnimalAbstract(int age, String gender, int weightInPounds) {
        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
    }

    public void eat() {

        System.out.println("Eating ... ");
    }

    public void sleep() {
        System.out.println("Sleeping ... ");

    }

    public abstract void move();

}
