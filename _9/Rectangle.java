package advancedjava._9;

public class Rectangle extends Shape{
    public Rectangle(double height, double witdh) {
        super(height, witdh);
    }

    public void areaRettangolo(){
        double area = height * witdh;
        System.out.println("l'area del rettangolo è : " + area);
    }

}
