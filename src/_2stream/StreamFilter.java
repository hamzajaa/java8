package _2stream;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println("numbers = " + numbers); // [1, 2, 3, 4, 5, 6, 7]

        //Until Java 7 - Odd numbers
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        System.out.println("oddNumbers = " + oddNumbers); // [1, 3, 5, 7]

        // Java 8 Streams
        //Stream<Integer> stream = numbers.stream().;
        List<Integer> oddNumbersStreams = numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList()); // collect(Collectors.toList()) == toList()
        System.out.println("Odd numbers using Java-8 stream : " + oddNumbersStreams);  // [1, 3, 5, 7]

        Predicate<Integer> predicate = (num) -> num % 2 != 0;
        List<Integer> oddNumbersStreams2 = numbers.stream().filter(predicate).toList(); // collect(Collectors.toList()) == toList()
        System.out.println("Odd numbers using Java-8 stream and new Predicate : " + oddNumbersStreams2);  // [1, 3, 5, 7]
    }
}
