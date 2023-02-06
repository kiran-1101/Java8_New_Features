package org.Function;

import java.util.Scanner;
import java.util.function.Function;

//program to remove space from the input string
public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string with spaces");
        String sc = scanner.nextLine();
        Function<String,String> f1 = s -> s.replaceAll(" ","");
        System.out.println("The string with no space is :-"+f1.apply(sc));
    }
}
