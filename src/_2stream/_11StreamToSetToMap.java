package _2stream;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class _11StreamToSetToMap {
    public static void main(String[] args) {

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(3);
        numSet.add(4);
        numSet.add(7);
        numSet.add(9);

        Set<Integer> filtredSet = numSet.stream().filter(e -> e > 3).collect(Collectors.toSet());
        System.out.println("filtredSet = " + filtredSet);

        // {1, 100} , {3, 300} ..... 
        Map<Integer, Integer> newMap = numSet.stream().collect(Collectors.toMap(x -> x, y -> y * 100));
        System.out.println("newMap = " + newMap);
    }
}
