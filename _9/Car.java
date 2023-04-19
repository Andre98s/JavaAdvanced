package advancedjava._9;

public class Car implements Movable{
    @Override
    public void moveForward() {
        System.out.println("la macchina va avanti");

    }

    @Override
    public void moveBackward() {
        System.out.println("la macchina va indietro");

    }
}
