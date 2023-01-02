package org.lambdaExpression;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;

class Employee{

     int id;
     String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;

    }
    public String toString(){
        return  id+":"+name;
    }
}

public class ClassObject {

    public static void main(String[] args) {
        ArrayList<Employee> emp = new  ArrayList<Employee>();
        emp.add(new Employee(1,"kiran"));
        emp.add(new Employee(2,"sharvi"));
        emp.add(new Employee(3,"pratik"));
        emp.add(new Employee(4,"rahul"));
        emp.add(new Employee(6,"pavan"));
        emp.add(new Employee(5,"ganesh"));
        System.out.println("before sorting-----");
        System.out.println("Emp list is : "+emp);
        Collections.sort(emp,(e1,e2)->(e1.id>e2.id)?-1:(e1.id<e2.id)?1:0);
        System.out.println("after sorting----");
        System.out.println("Emp list is : "+emp);

    }
}

