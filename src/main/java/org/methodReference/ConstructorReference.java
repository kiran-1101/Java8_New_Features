package org.methodReference;

class  Sample {
    Sample(){
        System.out.println("Sample class Constructor");
    }
}
interface Interf1{
    public Sample get();
}
public class ConstructorReference {
    public static void main(String[] args) {
        Interf1 interf = Sample ::new;
        interf.get();

    }
}
