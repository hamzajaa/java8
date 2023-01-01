package _2stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _4StreamSorted {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(22);
        numbers.add(3);
        numbers.add(41);
        numbers.add(5);
        numbers.add(63);
        numbers.add(7);

        // normal insertion order
        System.out.println("numbers = " + numbers); // [1, 22, 3, 41, 5, 63, 7]

        //ascending sort
        List<Integer> numbersSorted = numbers.stream().sorted().toList(); // from less to greater
        System.out.println("numbersSortedAscending = " + numbersSorted); // // [1, 3, 5, 7, 22, 41, 63]

        // custom descending sort sorting
        List<Integer> numbersSortingCompareLessToGr = numbers.stream().sorted((e1, e2) -> e1.compareTo(e2)).toList();
        System.out.println("numbersSortingCompareLessToGr = " + numbersSortingCompareLessToGr); // [1, 3, 5, 7, 22, 41, 63]
        List<Integer> numbersSortingCompareGrToLess = numbers.stream().sorted((e1, e2) -> e2.compareTo(e1)).toList();
        System.out.println("numbersSortingCompareGrToLess = " + numbersSortingCompareGrToLess); // [63, 41, 22, 7, 5, 3, 1]
    }
}
