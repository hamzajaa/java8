package com.company.InterfaceEnhancement._4lambdaExpression.thread;

public class ThreadMain {

    public static void main(String[] args) {

        Runnable runnable = new CodeToRunAsSeparateThread();
        Thread thread = new Thread(runnable);
        thread.start();

        // lambda expression
        Runnable runnable1 = ()->{
            for (int count = 1; count <= 5; count++) {
                System.out.println("Lambda Main thread Counter value is: " + count);
            }

        };
        Thread thread1= new Thread(runnable1);
        thread1.start();


        for (int count = 1; count <= 5; count++) {
            System.out.println("Main thread Counter value is: " + count);
        }
    }
}
