package org.lambdaExpression;
import java.util.Collections;
import java.util.TreeSet;

public class SetWithLambda {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>((I1, I2)->(I1>I2)?-1:(I1<I2)?1:0);
        ts.add(11);
        ts.add(22);
        ts.add(33);
        ts.add(44);
        ts.add(55);
        ts.add(66);
        System.out.println("before sorting:- "+ ts);


    }
}
