package advancedjava._8;


import java.util.ArrayList;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog dog1 = new Dog("Carlino",35.0d,6d);
        Dog dog2 = new Dog("Pitbull",50.8d, 27d);
        dog1.printDog();
        dog2.printDog();

    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Bird bird1 = new Bird(2.3d,88d,6400d );
        Fish fish1 = new Fish("Dentice", 93d,12d);
        bird1.printBird();
        fish1.printFish();
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        Dog dog2 = new Dog("Pitbull",50.8d, 27d);
        Fish fish1 = new Fish("Dentice", 93d,12d);
        Bird bird1 = new Bird(2.3d,88d,6400d );


        ArrayList<Object> animals = new ArrayList<Object>();
        animals.add(dog2);
        animals.add(fish1);
        animals.add(bird1);

        double theFaster = Double.MIN_VALUE;
            double dogSpeed = (double) Dog.runSpeedMetersPerSecond(dog2);
            double fishSpeed = (double) Fish.swimSpeedMetersPerSecond(fish1);
            double birdSpeed = (double) Bird.flySpeedMetersPerSecond(bird1);

            for (int i = 0; i< animals.size(); i++){
                if (theFaster<dogSpeed){
                    theFaster = dogSpeed;
                }
                if (theFaster<fishSpeed){
                    theFaster = fishSpeed;
                }
                if (theFaster<birdSpeed){
                    theFaster = birdSpeed;
                }
            }
        System.out.println("the faster animal reach the speed: "+theFaster);
    }
}
