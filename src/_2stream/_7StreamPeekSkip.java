package _2stream;

import java.util.Arrays;
import java.util.List;

public class _7StreamPeekSkip {

    public static void main(String[] args) {

        List<String> flats = Arrays.asList("B01", "B08", "B11", "T01", "B01", "B05", "B01", "B05", "T07");

        // flats started with B and lessToGr and remove the duplicate flats
        List<String> flatsWithB = flats.stream().filter(flat -> flat.startsWith("B")).sorted().distinct().toList();
        System.out.println("flatsWithB = " + flatsWithB); // [B01, B05, B08, B11]

        // flats started with B and lessToGr and remove the duplicate flats and skip B01, B05
        List<String> flatsWithBWithSkip = flats.stream().filter(flat -> flat.startsWith("B")).sorted().distinct().skip(2).toList();
        System.out.println("flatsWithBWithSkip = " + flatsWithBWithSkip); // [B08, B11]

        // flats started with B and lessToGr and remove the duplicate flats and skip B01, B05 and peek (see what is happening after sorted() and before distinct() )
        List<String> flatsWithBWithSkipAndPeek = flats.stream().filter(flat -> flat.startsWith("B")).sorted().peek(System.out::println).distinct().skip(2).toList();
        System.out.println("flatsWithBWithSkipAndPeek = " + flatsWithBWithSkipAndPeek); //


    }
}
