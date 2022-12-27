package com.company.InterfaceEnhancement._4lambdaExpression;

public class VehicleLambdaMain {

    public static void main(String[] args) {

        Vehicle vehicle = () -> {
            System.out.println("Vehicle details from lambda");
        };
        vehicle.details();
        vehicle.getMileage();


        Calculator calculator1 = (Integer a, Integer b) -> {
            return a + b;
        };
        Calculator calculator2 = Integer::sum;

        Integer res1 = calculator1.add(4, 6);
        Integer res2 = calculator2.add(7, 6);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);


        //1. Remove modifier => public
        //2. Remove return type => void
        //3. Remove name of method => multiply
        //4. Add -> (arrow) sign =>

        MultiplyInterface multiplyInterface = () -> System.out.println("I am a converted lambda function");
        multiplyInterface.multiply();

    }


}
