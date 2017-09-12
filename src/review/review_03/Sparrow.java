package review.review_03;

public class Sparrow extends Bird  implements Flyable{

    public Sparrow(String animalType, String animalClassification, String gender, int weight, int age, String eatingStyle) {
        super(animalType, animalClassification, gender, weight, age, eatingStyle);
    }


    public void fly() {

    }

    public void move (){
        System.out.println("Sparrows use their wings to move. ");
    }
}
