package org.Function;

import java.util.function.Function;

public class FunctionMethod {

    public static void main(String[] args) {

        Function<String,Integer> f1 = s->s.length();
        System.out.println(f1.apply("kiran lendwe"));
        Function<String,String> f2 = s -> s.toUpperCase();
        System.out.println(f2.apply("kiran lendwe"));
    }
}
