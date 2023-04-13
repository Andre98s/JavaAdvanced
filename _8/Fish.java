package advancedjava._8;

public class Fish extends Animal {
    private String species;

    public Fish(String species, double height, double weight) {
        super(height, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void printFish() {
        System.out.println("La specie è: " + species + " Altezza: " + height + " Peso: " + weight);
    }
    public static Object swimSpeedMetersPerSecond(Fish fish){
        double result = fish.weight * 2;
        System.out.println("La velocità del pesce equivale a: " + result + " km/h");
        return result;
    }
}
