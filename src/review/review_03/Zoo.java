package review.review_03;

public class Zoo {

    public static void main(String[] args) {

//        Animal lion = new Animal("lion", "mammal", "male", 300, 8, "carnivore");
//        Animal hummingbird = new Animal("hummingbird", "bird", "female", 1, 2, "herbivorous");
//
//        lion.speak();
//        lion.eat();
//
//        hummingbird.speak();
//        hummingbird.sleep();
//
//        Bird chicken = new Bird( "mamal",  "", "", 2, 5, "herbivoire");
//        chicken.move();

        Sparrow sparrow1 = new Sparrow("mamal", "bird", "F", 3, 2, "H");
        sparrow1.move();

        AnimalAbstract fish1 = new Fish(1, "F", 2);
        fish1.move();

        moveAnimal(fish1);

    }

    public static void moveAnimal(AnimalAbstract animal){
        animal.move();
    }

}
