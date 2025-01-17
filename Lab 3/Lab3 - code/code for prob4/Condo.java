package prob1;

public class Condo extends Property {
    private int numFloors;
    Condo(int numFloors) {
        super(400 * numFloors);
        this.numFloors = numFloors;
    }
    @Override
    public double getRent() {
        return super.getRent();
    }
}
