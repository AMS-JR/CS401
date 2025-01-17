package inheritance;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Cylinder otherCircle = new Circle(5);
        System.out.println("Radius of circle: " + circle.getRadius());
        System.out.println("Area of circle: " + circle.computeArea());
        // unused
        circle.setHeight(7);
        System.out.println("Radius of circle: " + circle.getRadius());
        System.out.println("Area of circle: " + circle.computeArea());

        System.out.println("Volume of Other circle: " + otherCircle.computeVolume());
        System.out.println("Height of Other circle: " + otherCircle.getHeight());

    }
}
