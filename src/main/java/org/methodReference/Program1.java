package org.methodReference;

interface Interf {
    public void m1();
}
public class Program1 {

        public static void m2(){
            System.out.println( "m2 method from class Program1");
        }

    public static void main(String[] args) {
        Interf interf = Program1::m2; //method reference from interf Interface to class Program1
        interf.m1();

    }
}
//method reference is use for code reusability.
//compulsory have same argument type in class and in interface both.
//in above program both m1 and m2 method are no argument type method.
