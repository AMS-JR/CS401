package problem1.partB;

import java.util.function.Supplier;

public class RandomWithInner {
    public static void main(String[] args) {
        RandomWithInner randomWithInner = new RandomWithInner();
        Supplier<Double> supplier = randomWithInner.new MyInnerSupplier();
        System.out.println(supplier.get());
    }
    class MyInnerSupplier implements Supplier<Double>{
        @Override
        public Double get() {
            return Math.random();
        }
    }
}
