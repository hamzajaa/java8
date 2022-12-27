package com.company.InterfaceEnhancement._5predicates;

public class PredicateMain {

    public static void main(String[] args) {
        PredicateInterfaceImpl predicate = new PredicateInterfaceImpl();
        boolean result = predicate.testFunction(20);
        System.out.println(result);
    }
}
