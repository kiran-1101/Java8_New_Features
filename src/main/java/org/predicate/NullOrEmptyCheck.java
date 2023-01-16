package org.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class NullOrEmptyCheck {

    public static void main(String[] args) {
        String[] names = {"kiran","","vishal",null,"rahul",null,"ram",null,"arjun"};
        Predicate <String> p1 = s -> s!=null && s.length()!=0;
        ArrayList <String> al = new ArrayList<>();
        System.out.println("the names ");
        for(String s1:names)
        {
            if(p1.test(s1))
            {
                System.out.println(s1);
                al.add(s1);
            }
        }
        System.out.println(al);
    }
}
