package review.review_03;

public class Zoo {

    public static void main(String[] args) {

        Animal lion = new Animal("lion", "mammal", "male", 300, 8, "carnivore");
        Animal hummingbird = new Animal("hummingbird", "bird", "female", 1, 2, "herbivorous");

        lion.speak();

        System.out.println("\n");
        hummingbird.speak();

        System.out.println("\n");

        Fish shark = new Fish("shark", "other fish", "ocean");
        shark.speak();

        System.out.println("\n");

        Bird parakeet = new Bird("parakeet", "seeds", "nest");
        parakeet.speak();

    }

}
