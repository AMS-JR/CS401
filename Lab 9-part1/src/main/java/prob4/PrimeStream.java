package prob4;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {
    private static final Stream<Integer> primes = Stream.iterate(1, PrimeStream::nextPrime);
    private static final Supplier<Stream<Integer>> primesVariant =
            () -> Stream.iterate(2, PrimeStream::nextPrime);

    // Function to find the next prime number
    private static int nextPrime(int num) {
        int next = num + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    static void printFirstNPrimes(long n){
        primesVariant.get().limit(n)
            .forEach(System.out::println);
    }
    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}
