package org.Function;

import java.util.function.BiFunction;
//program to print multiplication using bifunction
public class Bifunction {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> (a*b);
        System.out.println("multiplication using bipredicate is : "+ biFunction.apply(10,20));
    }
}
