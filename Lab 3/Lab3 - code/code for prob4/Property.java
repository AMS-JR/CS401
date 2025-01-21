package prob1;

public abstract class Property {
    private Address address;

    /*
    * constructor with only rent
    * Only for this case, not to be used in a project
    * */
    public Property() {
        this(new Address("123 Default St", "Sample City", "CA", 12345));
    }
    public Property( Address address) {
        this.address = address;
    }
    public abstract double computeRent();
}
