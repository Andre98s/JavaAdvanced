package advancedjava._9;

public abstract class Shape {
   public double height;
   public double witdh;

    public Shape(double height, double witdh) {
        this.height = height;
        this.witdh = witdh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWitdh() {
        return witdh;
    }

    public void setWitdh(double witdh) {
        this.witdh = witdh;
    }
}
