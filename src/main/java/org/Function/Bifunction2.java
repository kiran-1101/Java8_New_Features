package org.Function;


import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

class Employee{
    int rollnumber;
    String name;
    Employee (int rollnumber,String name){
        this.name = name;
        this.rollnumber = rollnumber;
    }
}
public class Bifunction2 {
    public static void main(String[] args) {
        BiFunction<Integer,String,Employee> Bifunction = (rollnumber,name) -> new Employee(rollnumber,name);
        ArrayList <Employee> arrayList = new ArrayList<>();
        arrayList.add(Bifunction.apply(1,"kiran"));
        arrayList.add(Bifunction.apply(2,"Shyam"));
    for (Employee employee : arrayList){
        System.out.println("employee name is :"+employee.name);
        System.out.println("employee roll number is :"+employee.rollnumber);
    }
    }
}
