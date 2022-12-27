package _1interfaceEnhancement._6doubleColonOperator;

public class OneMain {

    public static void main(String[] args) {

        LambdaOne lambdaOne = () -> System.out.println("From lambda one ");
        lambdaOne.show();

        Employee employee = new Employee();

        LambdaOne lambdaOne1 = employee::details; // == ()-> employee.details();
        lambdaOne1.show();

        Employee employee2 = new Employee();

        LambdaTwo lambdaTwo = employee2::details; // :: double colon
        lambdaTwo.show2(77);

        LambdaTwo lambdaTwo1 = Employee :: detailsStatic;
        lambdaTwo1.show2(88);
    }
}
