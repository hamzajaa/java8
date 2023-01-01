package _2stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class _6StreamFindMinMax {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(55, 22, 1, 48, 101, 77);

        // Min Value
        Integer minValue = numList.stream().min((e1, e2) -> e1.compareTo(e2)).get();
        System.out.println("minValue = " + minValue);

        // Max Value
        Integer MaxValue = numList.stream().min((e1, e2) -> e2.compareTo(e1)).get();
        System.out.println("MaxValue = " + MaxValue);

        // Min Value using function created by me
        Integer minValueBySortElements = numList.stream().min(_6StreamFindMinMax::sortElements).get(); // methods reference ::
        System.out.println("minValueBySortElements = " + minValueBySortElements);

        // Max Value using function created by me
        Integer MaxValueBySortElements = numList.stream().min((e1, e2) -> sortElements(e2, e1)).get();
        System.out.println("MaxValueBySortElements = " + MaxValueBySortElements);

        ////////-*************************************///////
        List<Integer> duplicateNumList = Arrays.asList(55, 22, 1, 48, 101, 77, 1, 48, 101, 77);

        List<Integer> dupSortedList = duplicateNumList.stream().sorted().toList();
        System.out.println("dupSortedList = " + dupSortedList); // [1, 1, 22, 48, 48, 55, 77, 77, 101, 101]

        List<Integer> distictSortedList = duplicateNumList.stream().sorted().distinct().toList();
        System.out.println("distictSortedList = " + distictSortedList); // [1, 22, 48, 55, 77, 101]

        List<Integer> distictNumList = duplicateNumList.stream().distinct().toList();
        System.out.println("distictNumList = " + distictNumList); // [55, 22, 1, 48, 101, 77]
    }

    public static Integer sortElements(Integer a, Integer b) {
        return a.compareTo(b);
    }
}
