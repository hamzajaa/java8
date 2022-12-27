package com.company.InterfaceEnhancement._6doubleColonOperator;

public class Employee {

    public Employee() {
        System.out.println("Default Constructor");
    }

    public void details() {
        System.out.println("Showing employee details ");
    }

    public void details(int number) {
        System.out.println("employee details with 1 param = " + number);
    }

    public static void detailsStatic(int number) {
        System.out.println("employee detailsStatic with 1 param = " + number);
    }
}
