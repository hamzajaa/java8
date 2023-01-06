package _2stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class _10StreamReduce {

    public static void main(String[] args) {

        // Calculate sum of 10 numbers
        OptionalInt optinalIntSum = IntStream.rangeClosed(1, 10).reduce((a, b) -> a + b);// (a, b) -> a + b = Integer::sum
        System.out.println("optinalIntSum = " + optinalIntSum.getAsInt());
        // Calculate mul of 10 numbers
        OptionalInt optinalIntMul = IntStream.rangeClosed(1, 10).reduce((a, b) -> a * b);// (a, b) -> a + b = Integer::sum
        System.out.println("optinalIntMul = " + optinalIntMul.getAsInt());
        //find max of 10 numbers
        OptionalInt optinalIntMax = IntStream.rangeClosed(1, 10).reduce(Integer::max);
        System.out.println("optinalIntMax = " + optinalIntMax.getAsInt());
        // find min of 10 numbers
        OptionalInt optinalIntMin = IntStream.rangeClosed(1, 10).reduce(Integer::min);
        System.out.println("optinalIntMin = " + optinalIntMin.getAsInt());
    }
}
