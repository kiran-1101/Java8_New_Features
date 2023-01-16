package org.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateFeature {

    public static void main(String[] args) {

        Predicate<Integer> p1 = i->i>10;
        Predicate<Collection> c1 = c->c.isEmpty();
        ArrayList al = new ArrayList<>();
       // al.add(100);
        System.out.println("collection is empty or not "+ c1.test(al));
        Predicate<String> s1 = i->i.length()>10;
        System.out.println("value is greater than 10 or not :- "+ p1.test(100));
        System.out.println("value is greater than 10 or not :- "+ p1.test(8));
        System.out.println("length of string is greater than 10 alphabets or not:- "+ s1.test("kiran"));
    }
}
