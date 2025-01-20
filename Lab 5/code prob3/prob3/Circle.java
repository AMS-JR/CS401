package prob3;

public final class Circle implements GeometricFigure{
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getRadius() {
        return radius;
    }
}
