package org.predicate;
import    java.util.function.*;

public class BiPredicateFunction {
    public static void main(String[] args) {
     BiPredicate<Integer,Integer> b1 = (a, b)->(a+b) %2 == 0;
        System.out.println(b1.test(10,20));

        int[] intarray = {2,3,5,6,7,11,13,14,15,16,17,20,21,22,24};
        Predicate <Integer> p1 = s->s%2==0;
        for(int x:intarray)
        {
            if(p1.test(x))
            {
                System.out.println(x);
            }
        }

    }


}
