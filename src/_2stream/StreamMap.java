package _2stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMap {
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
        // output should be                            [3, 6, 9, 12, 15, 18, 21]

        List<Integer> output = numbers.stream().map(num-> num * 3).toList();
        System.out.println("integers map is : " + output);
    }
}
