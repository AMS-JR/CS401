package problem1.partB;

import java.util.function.Supplier;

public class RandomNumbers {
    public static void main(String[] args) {
        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());
    }
}
