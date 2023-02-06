package org.consumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;


class Office{
    String name;
    Double salary;
    Office(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }
}
public class Biconsumer {
    public static void main(String[] args) {
        BiFunction <String, Double, Office> biFunction = (name, salary) -> new Office(name,salary);
        ArrayList <Office> arrayList = new ArrayList<>();
        arrayList.add(biFunction.apply("kiran",1000.0));
        arrayList.add(biFunction.apply("rahul",2000.0));
        arrayList.add(biFunction.apply("kartik",3000.0));
        System.out.println("before increament");
        for (Office o : arrayList){
            System.out.println("Employee name : "+o.name + "Employee salary : "+o.salary);
        }
        BiConsumer <Office, Double> biConsumer = (office, increment) -> office.salary = office.salary + increment;
        System.out.println("after increment");
        for (Office o : arrayList){
            biConsumer.accept(o,500.0);
        }
        for (Office o : arrayList){
            System.out.println("Employee name : "+o.name + "Employee salary : "+o.salary);
        }
    }
}
