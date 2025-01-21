package prob1;

public class Condo extends Property {
    private int numFloors;
    Condo(int numFloors) {
//        super();
        this.numFloors = numFloors;
    }
    @Override
    public double computeRent() {
        return 500 * numFloors;
    }
}
