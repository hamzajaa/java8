package _2stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5StreamColonOperator {

    public static void main(String[] args) {

        List<String> alphaNumerics = Arrays.asList("A11", "A44", "a22", "a49", "G66");

        List<String> strList = alphaNumerics.stream().filter(e -> e.startsWith("A")).toList();
        System.out.println("strList = " + strList); // [A11, A44]

        List<String> strLists = alphaNumerics.stream().map(e -> e.toUpperCase()).filter(e -> e.startsWith("A")).toList();
        System.out.println("strLists = " + strLists); // [A11, A44, A22, A49]

        // with methods reference
        List<String> strListsByRef = alphaNumerics.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).toList();
        System.out.println("strLists = " + strListsByRef); // [A11, A44, A22, A49]

        // filter is a Lazy operation on stream
        alphaNumerics.stream().filter(e -> { // in this case don't print
            System.out.println("e = " + e);
            return e.startsWith("A");
        }); // if you want print add in the end .count() . toList() .... => that is why filter is Lazy on stream


        // stream, map, filter returned a stream But forEach don't return a stream
        alphaNumerics.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).forEach(e->System.out.println(e));
        alphaNumerics.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).forEach(System.out::println);


    }

}
