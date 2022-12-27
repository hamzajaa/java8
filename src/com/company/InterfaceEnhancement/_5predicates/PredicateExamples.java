package com.company.InterfaceEnhancement._5predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExamples {

    public static void main(String[] args) {

        Predicate<Integer> isOdd = num -> num % 2 != 0;
        System.out.println("isOdd = " + isOdd.test(5));

        Integer[] numbers = {2, 6, 9, 4, 8, 13, 22, 19};
        for (Integer num : numbers) {
            if (isOdd.test(num)) { // isOssEven == true
                System.out.println(num + " is odd ");
            }
            if (isOdd.negate().test(num)) {
                System.out.println(num + " is even ");
            }
        }

//        for (Integer num : numbers) {
//            boolean isOddEven = isOdd.test(num);
//            if (isOddEven) { // isOssEven == true
//                System.out.println(num + " is odd ");
//            } else {
//                System.out.println(num + " is even ");
//            }
//        }
        System.out.println(" ***************** ");

        // find all the odd numbers which are greater than 10
        for (Integer num : numbers) {
            if (num > 10) {
                if (isOdd.test(num)) { // isOssEven == true
                    System.out.println(num + " is odd and greater than 10 ");
                }
            }
        }

        Predicate<Integer> gt10 = num -> num > 10;
        for (Integer num : numbers) {
            if (gt10.and(isOdd).test(num)) {
                System.out.println(num + " is odd and greater than 10 ");
            }
        }

        //Array of names will some empty string also in the array, remove all empty string
        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("hamza");
        listNames.add("");
        listNames.add("salah");
        listNames.add("");
        listNames.add("omar");
        System.out.println(" list of names is: " + listNames);
        Predicate<String> isEmpty = names -> names.isEmpty();

        namesFor:
        for (String name : listNames) {
            int indexName = listNames.indexOf(name);
            if (isEmpty.negate().test(name)) {
                listNames.remove(indexName);
//                break namesFor;
            }
        }
        System.out.println(" list of names is: " + listNames);

    }
}
