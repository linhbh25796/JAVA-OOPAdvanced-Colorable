public class Square extends Shape implements Colorable {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public Square(String color, boolean filled, double a) {
        super(color, filled);
        this.a = a;
    }

    public Square(){

    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String howToColor() {
        return "Color all four sides. ";
    }

    @Override
    public String toString() {
        return "A Square with side ="
                + getA()
                + ", which is a subclass of "
                + super.toString();
    }


}