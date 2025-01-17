package composition;

public class Cylinder{
    private Double height;
    private Double radius;
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public Double getHeight() {
        return height;
    }
    // unused
    public void setHeight(double height) {
        this.height = height;
    }
    public double computeVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
