package org.lambdaExpression;

import java.util.TreeMap;

public class TreeMapWithLambda {
    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<Integer,String>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        tm.put(1,"kiran");
        tm.put(2,"amol");
        tm.put(3,"rahul");
        tm.put(4,"kishan");
        tm.put(7,"sushil");
        tm.put(5,"pratik");
        tm.put(6,"rohan");
        System.out.println("values are :"+tm);
    }

}
