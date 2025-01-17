package prob1;

public class House extends Property{
    private double lotSize;
    public House(double lotSize) {
        super(0.1 * lotSize);
        this.lotSize = lotSize;
    }
    @Override
    public double getRent() {
        return super.getRent();
    }
}
