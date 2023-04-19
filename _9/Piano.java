package advancedjava._9;

public class Piano extends Instrument{
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println(name + " utilizza un: " + brand +"\n Suona Experience");
    }
}
