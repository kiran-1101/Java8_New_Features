package org.predicate;


import javax.swing.*;
import java.util.Scanner;
import java.util.function.Predicate;
//program to authenticate username=kiran and password= kiran1101
class user{
        String username;
        String password;
        user(String username, String password)
        {
                this.username = username;
                this.password = password;
        }
}
public class Authentication {
        public static void main(String[] args) {

                Predicate <user> p1 = user -> user.username.equals("kiran") && user.password.equals("kiran1101");
                Scanner sc = new Scanner(System.in);
                System.out.println("enter username");
                String username = sc.next();
                System.out.println("enter password");
                String password = sc.next();
                user user1 = new user(username,password);
                if(p1.test(user1))
                {
                        System.out.println("valid user");
                }
                else {
                        System.out.println("invalid user");
                }
        }
}
