package org.supplier;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.function.Supplier;

//program to print random name from the defined list
public class Program2 {
    public static void main(String[] args) {
        Supplier<String> s1 = ()->{
            String[] stringArray = {"kiran","rahul","ashok","ramesh","akash"};
            int x = (int) (Math.random()*4);
            return stringArray[x];
        };
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());
    }



}
