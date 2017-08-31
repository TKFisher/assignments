package review.review_03;


public class Earth1 {


    public static void main(String[] agrs) {

        Human1 tom;
        tom = new Human1();
        tom.name = "Tom";
        tom.age = 5;
        tom.heightInInches = 72;
        tom.eyeColor = "green";

        tom.speak();

        Human1 joy = new Human1();
        joy.name = "Joy";
        joy.age = 21;
        joy.heightInInches = 80;
        joy.eyeColor = "hazel";

        joy.speak();

    }


}
