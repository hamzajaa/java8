package _2stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMapFilter {

    //- Filter takes a predicate as an argument, so basically you are validating your input/collection against a condition,
//- whereas a Map allows you to define or use an existing function on the stream eg you can apply String.toUpperCase(...)
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Grapes");

        // print the length of all fruit in list
        System.out.println(fruits.stream().map(fr -> fr.length()).toList()); // fruits.stream().map(fr -> String::length).toList()

        // find only those fruits whose Length is greater than 5
        List<String> fruitsGrTh5 = fruits.stream().filter(fr -> fr.length() > 5).toList();
        System.out.println("fruitsGrTh5 = " + fruitsGrTh5); // [Banana, Papaya, Grapes]

        // find fruits whose Length greater than 5
        System.out.println(fruits.stream().map(f -> f.length()).filter(length -> length > 5).toList());

        // how many fruits exist that have length greater than 5
        Long numOfFruitsWithLengthGrTh5 = fruits.stream().filter(f -> f.length() > 5).count();
        System.out.println("numOfFruitsWithLengthGrTh5 = " + numOfFruitsWithLengthGrTh5);
    }
}
