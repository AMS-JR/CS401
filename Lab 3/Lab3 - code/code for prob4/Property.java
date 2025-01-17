package prob1;

public class Property {
    private double rent;
    private Address address;

    /*
    * constructor with only rent
    * Only for this case, not to be used in a project
    * */
    public Property(double rent) {
        this(rent, new Address("123 Default St", "Sample City", "CA", 12345));
    }
    public Property(double rent, Address address) {
        this.rent = rent;
        this.address = address;
    }
    public double getRent() {
        return rent;
    }
}
