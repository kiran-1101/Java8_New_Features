package org.lambdaExpression;

public class ThreadWithLambda {

    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("child thread");
            }
        };
        Thread t = new Thread(r);
        //or
        //Thread t = new Thread(() -> {
        //            for (int i = 0; i < 10; i++) {
        //                System.out.println("child thread");
        //            });
        t.start();
        for (int j = 0; j < 10; j++) {
            System.out.println("main thread");
        }
    }
}
