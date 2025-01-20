package prob3;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] figures = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4)
        };

        double sumArea = 0;
        for (GeometricFigure figure : figures) {
            sumArea += figure.calculateArea();
        }

        System.out.printf("Sum of Areas: %.2f%n", sumArea);

    }
}
