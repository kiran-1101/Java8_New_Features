package org.supplier;

import java.util.function.Supplier;

//program to get otp through supplier
public class Program3 {
    public static void main(String[] args) {
        Supplier <Integer> s1 = ()-> {
            int x = (int)(Math.random()*1000000);
            return x;
        };
        System.out.println("otp is "+s1.get());
    }

}
