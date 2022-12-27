package com.company.InterfaceEnhancement._1defaultMethod;

public interface VehicleJava8 {

    default void details() { // by default gets available to all implementing classes
        System.out.println("I am Java 8 default method");
    }

    default void mileage(){};
}
