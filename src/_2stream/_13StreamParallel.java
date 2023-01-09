package _2stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class _13StreamParallel {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // Sequential stream - It follows order and runs items in stream in a sequence, it is slow in processing
        // Parallel stream - Runs in multiple threads, do not follow order, it's faster in processing

        intList.stream().forEach(System.out::print);//12345678

        System.out.println("");
        System.out.println("*************************");

        intList.stream().parallel().forEach(System.out::print);//65873421

        System.out.println("");
        System.out.println("*************************");

        intList.parallelStream().forEach(System.out::print);//65873421

    }
}
