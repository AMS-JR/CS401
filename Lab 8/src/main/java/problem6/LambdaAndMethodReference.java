package problem6;

import problem6.packages.Employee;
import problem6.packages.EmployeeNameComparator;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaAndMethodReference {
    Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
    Function<String, String> toUpper2 = String::toUpperCase;
    /**
     * A. (Employee e) -> e.getName()
     */
    Function<Employee, String> getName = (Employee e) -> e.getName();
    Function<Employee, String> getName2 = Employee::getName;
    /**
     * B. (Employee e,String s) -> e.setName(s)
     */
    BiConsumer<Employee, String> setName = (Employee e, String s) -> e.setName(s);
    BiConsumer<Employee, String> setName2 = Employee::setName;
    /**
     * C. (String s1,String s2) -> s1.compareTo(s2)
     */
    BiFunction<String, String, Integer> compare = (String s1, String s2) -> s1.compareTo(s2);
    BiFunction<String, String, Integer> compare2 = String::compareTo;
    /**
     * D. (Integer x,Integer y) -> Math.pow(x,y)
     */
    BiFunction<Integer, Integer, Double> power = (Integer x, Integer y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> power2 = Math::pow;
    /**
     * E. (Apple a) -> a.getWeight()
     */
    Function<Apple, Double> getWeight = (Apple a) -> a.getWeight();
    Function<Apple, Double> getWeight2 = Apple::getWeight;
    /**
     * F. (String x) -> Integer.parseInt(x);
     */
    Function<String, Integer> parse = (String x) -> Integer.parseInt(x);
    Function<String, Integer> parse2 = Integer::parseInt;
    /**
     * G. EmployeeNameComparator comp = new EmployeeNameComparator();
     * (Employee e1, Employee e2) -> comp.compare(e1,e2)
     */
    EmployeeNameComparator comp = new EmployeeNameComparator();
    Comparator<Employee> comparator = (Employee e1, Employee e2) -> comp.compare(e1,e2);
    Comparator<Employee> comparator2 = comp::compare;

    void evaluator() {
        System.out.println(toUpper2.apply("hello"));
        ///test your other method references
        System.out.println(getName2.apply(new Employee("John", 25)));
        setName2.accept(new Employee("John", 25), "Sally");
        System.out.println(compare2.apply("apple", "banana"));
        System.out.println(power2.apply(2, 3));
        System.out.println(getWeight2.apply(new Apple(0.25)));
        System.out.println(parse2.apply("123"));
        System.out.println(comparator2.compare(new Employee("John", 25), new Employee("Jane", 30)));

    }
    public static void main(String[] args) {
        new LambdaAndMethodReference().evaluator();

    }
    class Apple{
        private double weight;
        public Apple(double weight) {
            this.weight = weight;
        }
        public double getWeight() {
            return weight;
        }
    }
}

