package org.Function;

import java.util.Scanner;
import java.util.function.Function;

//program to count number of space in the input string
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string with space");
        String sc = scanner.nextLine();
        Function<String,Integer> f1 = s -> s.length() - s.replaceAll(" ","").length();
        System.out.println("Number of spaces in the string are :- "+f1.apply(sc));

    }

}
