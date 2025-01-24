package problem5;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		/**
		 * A. Use a lambda expression instead of directly defining a Consumer
		 */
        list.forEach(s -> System.out.println(s.toUpperCase()));

		System.out.println("---------------------------");

		/**
		 * B. Use a method reference in place of your lambda expression
		 */
		list.stream()
				.map(String::toUpperCase)
				.forEach(System.out::println);
	}
}