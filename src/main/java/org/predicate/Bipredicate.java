package org.predicate;

import java.util.function.BiPredicate;
//Program to check multiplication of two number is even or odd using bipredicate
public class Bipredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate = (a,b) -> (a*b)%2==0;
        System.out.println("bipredicate is : "+biPredicate.test(10,30));
    }
}
