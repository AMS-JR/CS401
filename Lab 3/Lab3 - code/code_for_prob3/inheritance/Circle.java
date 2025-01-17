package inheritance;

public class Circle extends Cylinder {
    public Circle(double radius) {
        super(radius, radius);
    }
    public double getRadius() {
        return super.getHeight();
    }
    public double computeArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
