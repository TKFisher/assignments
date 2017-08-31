package review.review_03;

public class Human2 {

    String name;
    int age;
    int heightInInches;
    String eyeColor;


    public Human2(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }


    public void speak() {

        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + heightInInches + " inches tall.");
        System.out.println("I am " + age + " years old.");
        System.out.println("My eyes are " + eyeColor + ".");

    }

    public void eat() {

    }

    public void walk() {

    }


}
