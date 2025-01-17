package composition;

import inheritance.Cylinder;

public class Circle {
    private Cylinder cylinder;
    public Circle(double radius) {
        cylinder = new Cylinder(radius, radius);
    }
    public double getRadius() {
        return cylinder.getHeight();
    }
    public double computeArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
