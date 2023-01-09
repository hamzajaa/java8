package _2stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _15SreamFlatMap {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(11, 22, 33, 44, 55, 66, 77);
        System.out.println("numList = " + numList);

        List<Integer> numListNew = numList.stream().map(x -> x).toList();
        System.out.println("numListNew = " + numListNew);

        List<List<Integer>> numListNew2 = numList.stream().map(x -> Arrays.asList(x, x + 1)).toList();
        System.out.println("numListNew2 = " + numListNew2);

        List<Integer> numFlatListNew3 = numList.stream().flatMap(x -> Stream.of(x, x + 1)).toList();
        System.out.println("numFlatListNew3 = " + numFlatListNew3);

    }
}
