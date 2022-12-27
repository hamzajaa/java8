package com.company.InterfaceEnhancement._4lambdaExpression.thread;

public class CodeToRunAsSeparateThread implements Runnable {


    @Override
    public void run() {
        for (int count = 1; count <= 5; count++) {
            System.out.println("Child thread Counter value is: " + count);
        }
    }
}
