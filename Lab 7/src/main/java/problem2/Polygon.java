package problem2;

public interface Polygon extends ClosedCurve {
    // return the length of each side of the polygon in an array
    double[] getSides();
    default double computePerimeter(){
        double[] sides = getSides();
        double perimeter = 0;
        for(double side : sides){
            perimeter += side;
        }
        return perimeter;
    }
}
