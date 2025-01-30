package prob9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Squares {
    public static void main(String[] args) {
        printSquares(4);
    }
    public static void printSquares(int num){
        String result = Stream.iterate(num, n -> n > 0, n -> n - 1) // Iterate downwards
                        .map(n -> n * n) // Square each number
                        .sorted()
                        .map(n -> n.toString()) //You can use Object::toString
                        .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
