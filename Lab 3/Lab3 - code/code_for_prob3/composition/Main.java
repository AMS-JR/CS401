package composition;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(5,5);
        System.out.println("Radius of circle: " + circle.getRadius());
        System.out.println("Area of circle: " + circle.computeArea());
        // unused
//        circle.setHeight(7); //cannot be called directly and output should still be same
        System.out.println("Radius of circle: " + circle.getRadius());
        System.out.println("Area of circle: " + circle.computeArea());

        System.out.println("Volume of Cylinder: " + cylinder.computeVolume());
        System.out.println("Height of Cylinder: " + cylinder.getHeight());

    }
}
