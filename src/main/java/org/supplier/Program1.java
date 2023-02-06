package org.supplier;

import java.util.Date;
import java.util.function.Supplier;

//program to print date
public class Program1 {
    public static void main(String[] args) {
        Supplier<Date> s1 = () -> new Date();
        System.out.println("current date is "+s1.get());
    }

}
