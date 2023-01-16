package org.predicate;

import java.util.function.Predicate;

public class NameStartsWithK {
    public static void main(String[] args) {
        String[] names = {"kiran", "karina", "kajal", "akshay", "alim", "karan", "arjun", "sachin"};
        Predicate<String> p1 = s -> s.charAt(0) == 'k';
        for (String s1 : names) {
            if (p1.test(s1)) {
                System.out.println(s1);
            }
        }
    }
}
