package org.methodReference;


import java.lang.reflect.Method;

//creating and calling thread using method reference.
public class MethodReference {
    public static void m1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }
    }
    public void m2 () {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread 1");
        }
    }

    public static void main(String[] args) {
        Runnable runnable = MethodReference ::m1;   //static method reference or constructor reference
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i=0;i<10;i++){
            System.out.println("main thread");
        }

        MethodReference methodReference = new MethodReference();
        Runnable runnable1 = methodReference ::m2;  //instance method reference
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        for (int i=0;i<10;i++){
            System.out.println("main thread 1");
        }


    }

}
