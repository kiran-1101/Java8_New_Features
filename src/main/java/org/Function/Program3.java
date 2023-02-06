package org.Function;

import java.net.Inet4Address;
import java.util.function.Function;

//compose() and andThen() methods in Function Functional interface.
public class Program3 {
    public static void main(String[] args) {
        Function < Integer,Integer> f1 = s -> s+s;
        Function < Integer,Integer> f2 = s -> s*s*s;
        System.out.println("and then "+f1.andThen(f2).apply(2));
        System.out.println("compose "+f1.compose(f2).apply(2));
    }
}
