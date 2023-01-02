package org.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class ListWithLambda {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println("before sorting:-"+arr);
        Collections.sort(arr,(I1, I2)->(I1>I2)?-1:(I1<I2)?1:0);
        System.out.println("after soring:-"+arr);
    }
}