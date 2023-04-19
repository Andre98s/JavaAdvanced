package advancedjava._9;

public class Circle extends Shape{
    public Circle(double height, double witdh) {
        super(height, witdh);
    }
    public void areaCircle(){
        double area = Math.PI * Math.pow((height / 2), 2);
        System.out.println("l'area del cerchio è :" + area);
    }
}
