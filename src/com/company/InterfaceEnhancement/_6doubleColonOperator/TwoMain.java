package com.company.InterfaceEnhancement._6doubleColonOperator;

public class TwoMain {
    public static void main(String[] args) {

        ConsRefFuncInterface consRefFuncInterface = Employee::new; // () -> new Employee(); //:: double colon

        consRefFuncInterface.getEmployee();

    }
}
