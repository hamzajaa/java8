package com.company.InterfaceEnhancement._5predicates;

import java.util.function.Predicate;

public class PredicateExampleIsEqual {

    public static void main(String[] args) {

        String name = "hamza";

        Predicate<String> nameEqualityPredicateInterface = Predicate.isEqual("hamza");
        System.out.println("nameEqualityPredicateInterface = " + nameEqualityPredicateInterface.test(name));

    }
}
