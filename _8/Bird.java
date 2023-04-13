package advancedjava._8;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(double wingSpan, double height, double weight) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public void printBird() {
        System.out.println("L'apertura alare è: " + wingSpan + " Altezza: " + height + " Peso: " + weight);
    }
    public static Object flySpeedMetersPerSecond(Bird bird){
        double result = bird.wingSpan * 2;
        System.out.println("La velocità dell'uccello equivale a: " + result + " km/h");
        return result;
    }
}
