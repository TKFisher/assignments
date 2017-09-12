package review.review_03;

public class Fish extends AnimalAbstract {

    public Fish(int age, String gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }


    public void eat() {

    }

    public void sleep() {

    }


    @Override
    public void move() {

        System.out.println("Fish move with their fins.");

    }
}
