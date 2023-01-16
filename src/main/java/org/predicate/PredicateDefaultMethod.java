package org.predicate;

import org.defaultandstaticmethodinInterface.InterfaceDefaultMethod;

import java.util.function.Predicate;

public class PredicateDefaultMethod {

    public static void main(String[] args) {
        int [] x = {2,3,4,6,12,13,15,16,23,34,45,66,67,46,77};
        Predicate<Integer> p1 = i -> i>10;
        Predicate<Integer> p2 = i -> i%2 ==0;
        System.out.println("values greater than 10 are ");
        m1(p1,x);
        System.out.println("even values");
        m1(p2,x);
        System.out.println("value both even and greater than 10");
        m1(p1.and(p2),x);
        System.out.println("value even or greater than 10 ");
        m1(p1.or(p2),x);
        System.out.println("value which are not greater than 10");
        m1(p1.negate(),x);
    }
    public static void m1(Predicate<Integer> p,int[] x) {
        for (int x1:x)
        {
            if(p.test(x1))
            {
                System.out.print(" "+x1);
            }
        }
    }
}
