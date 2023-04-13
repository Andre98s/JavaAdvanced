package advancedjava._8;

public class Dog extends Animal {
    private String breed;

    public Dog(String breed, double height, double weight) {
        super(height, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void printDog(){
        System.out.println("La razza è: " + breed + " Altezza: "+ height + " Peso: "+ weight);
    }
    public static Object runSpeedMetersPerSecond(Dog dog){
        double result = height *2;
        System.out.println("La velocità del cane equivale a: " + result + " km/h");
        return result;


    }

}