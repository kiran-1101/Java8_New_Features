package org.Programs;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.nextLine();
        char [] reverstring = name.toCharArray();
        for (int i = name.length()-1;i >= 0 ; i--)
        {
            System.out.print(reverstring[i]);
        }
    }


}
