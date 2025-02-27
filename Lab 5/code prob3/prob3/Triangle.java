package prob3;

public final class Triangle implements GeometricFigure{
    private final double base;
    private final double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
}
