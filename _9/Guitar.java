package advancedjava._9;

public class Guitar extends Instrument{

    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println(name + " utilizza una: " + brand +"\n Suona November Rain");
    }
}
