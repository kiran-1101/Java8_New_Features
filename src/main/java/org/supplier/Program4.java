package org.supplier;

import java.util.function.Supplier;

//Program to 8 digit password
public class Program4 {
    public static void main(String[] args) {
        Supplier<String> s1 = ()->{
            String password = "";
            Supplier <Integer> integerSupplier = ()-> (int)(Math.random()*10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@%&";
            Supplier <Character> stringSupplier = ()-> symbols.charAt((int)(Math.random()*29));
            for(int i=0; i<8 ;i++){
                if (i%2 == 0)
                {
                    password = password + integerSupplier.get();
                }
                else {
                    password = password + stringSupplier.get();
                }
            }
            return password;
        };
        System.out.println("The random password generated is :- "+s1.get());
    }
}
