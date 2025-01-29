package problem5;

import java.util.*;

public class secondSmallest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 4, 3, 5, 2);
        System.out.println("Second smallest: " + findSecondSmallest(list));

        Integer[] arr = {1, 4, 3, 5, 7};
        System.out.println("Second smallest: " + findSecondSmallest(arr));

        List<Person> people = Arrays.asList(new Person("John", 22),
                new Person("Alice", 25),
                new Person("Bob", 20));
        System.out.println("Second smallest person: " + findSecondSmallest(people,
                        Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getName)
        ));
    }

    /**
     * @param <T> of Object Types
     */
    public static <T extends Comparable<T>> T findSecondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two elements");
        }

        T smallest = list.get(0);
        T secondSmallest = list.get(1);

        for (int i = 2; i < list.size(); i++) {
            T current = list.get(i);

            if (current.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = current;
            } else if (current.compareTo(smallest) > 0 && current.compareTo(secondSmallest) < 0) {
                secondSmallest = current;
            }
        }

        return secondSmallest;
    }
    /**
     * @param <T> of Array Object Types
     */
    public static <T extends Comparable<T>> T findSecondSmallest(T[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        T smallest = arr[0];
        T secondSmallest = arr[1];

        for (int i = 2; i < arr.length; i++) {
            T current = arr[i];

            if (current.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = current;
            } else if (current.compareTo(smallest) > 0 && current.compareTo(secondSmallest) < 0) {
                secondSmallest = current;
            }
        }

        return secondSmallest;
    }
    /**
     * @param <T> of Person Types
     */
    public static <T> T findSecondSmallest(List<T> list, Comparator<T> cmps) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two Persons");
        }

        T smallest = list.get(0);
        T secondSmallest = list.get(1);

        for (int i = 2; i < list.size(); i++) {
            T current = list.get(i);

            if (cmps.compare(current, smallest) < 0) {
                secondSmallest = smallest;
                smallest = current;
            } else if (cmps.compare(current, smallest) > 0 && cmps.compare(current, secondSmallest) < 0) {
                secondSmallest = current;
            }
        }

        return secondSmallest;
    }
}
