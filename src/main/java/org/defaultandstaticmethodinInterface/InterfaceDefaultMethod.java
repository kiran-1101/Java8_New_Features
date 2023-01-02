package org.defaultandstaticmethodinInterface;

interface Interf {
    default void m1()
    {
        System.out.println("implementation in interface 1");
    }
}
interface Interf2 {
    default void m1()
    {
        System.out.println("implementationn in interface 2");
    }
}
public class InterfaceDefaultMethod implements  Interf,Interf2{

    public void m1()
    {
        //System.out.println("implementation in class");
        Interf2.super.m1();
    }
    public static void main(String[] args)
    {
        InterfaceDefaultMethod dm = new InterfaceDefaultMethod();
        dm.m1();
    }
}

