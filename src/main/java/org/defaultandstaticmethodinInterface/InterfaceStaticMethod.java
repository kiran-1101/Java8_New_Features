package org.defaultandstaticmethodinInterface;


interface  interf {
    public static void m1(){
        System.out.println("interface static method");
    }
}
public class InterfaceStaticMethod implements  interf {

    public static void main(String[] args) {
//        InterfaceStaticMethod interfaceStaticMethod = new InterfaceStaticMethod();
//        interfaceStaticMethod.m1();  not possible
        interf.m1(); // interface static method only call by using interface name

    }

}
