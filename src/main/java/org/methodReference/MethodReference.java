package org.methodReference;

public class MethodReference {
    public static void m1(){
        for (int i=0; i<10; i++){
            System.out.println("child thread");
        }
    }

    public static void main(String[] args) {
        Runnable runnable = MethodReference ::m1;   //method reference or constructor reference
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i=0;i<10;i++){
            System.out.println("main thread");
        }
    }

}
