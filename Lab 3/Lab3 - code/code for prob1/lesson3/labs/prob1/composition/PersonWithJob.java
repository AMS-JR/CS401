package lesson3.labs.prob1.composition;

public class PersonWithJob {

    private double salary;
    private Person person;
    public double getSalary() {
        return salary;
    }
    PersonWithJob(String n, double s) {
        salary = s;
        person = new Person(n);
    }

    @Override
    public boolean equals(Object aPerson) {
        if(aPerson == null) return false;
        if(!(aPerson instanceof PersonWithJob)) return false;
        PersonWithJob p = (PersonWithJob)aPerson;
        boolean isEqual = this.person.equals(p.person) &&
                this.getSalary()==p.getSalary();
        return isEqual;
    }
    public static void main(String[] args) {
        PersonWithJob p1 = new PersonWithJob("Joe", 30000);
        Person p2 = new Person("Joe");
        PersonWithJob p3 = new PersonWithJob("Joe", 30000);
        //Consistent comparisons
		System.out.println("p1.equals(p2)? " + p1.equals(p2)); // false
        System.out.println("p2.equals(p1)? " + p2.equals(p1)); // false
        System.out.println("p1.equals(p3)? " + p1.equals(p3)); // true
    }


}
