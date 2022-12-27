package com.company.InterfaceEnhancement._4lambdaExpression;

@FunctionalInterface
public interface Vehicle {

    void details();
    default void getMileage(){
        System.out.println("Showing mileage details");
    }
}
