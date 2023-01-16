package org.predicate;


import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{

    String name;
    String designation;
    Double salary;
    String city;
    Employee(String name, String designation,Double salary, String city)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        String s = String.format("[%s,%s,%.2f,%s]",name,designation,salary,city);
        return s;
    }
}
public class EmployeeManagementApp {
    public static void main(String[] args) {
        ArrayList<Employee> l1 = new ArrayList<Employee>();
        l1.add(new Employee("kiran","developer",12000.0,"pune"));
        l1.add(new Employee("rahul","developer",15000.0,"pune"));
        l1.add(new Employee("pratik","developer",20000.0,"banglore"));
        l1.add(new Employee("ajay","manager",22000.0,"pune"));
        l1.add(new Employee("ashok","tester",20000.0,"pune"));
        l1.add(new Employee("rushikesh","developer",18000.0,"banglore"));
        l1.add(new Employee("shubahm","manager",15000.0,"banglore"));

        Predicate<Employee> p1 = emp -> emp.designation.equals("manager");
        System.out.println("manager information");
        display(p1,l1);
        Predicate<Employee> p2 = emp -> emp.salary > 20000;
        System.out.println("Employee salary greater than 20k are");
        display(p2,l1);
        Predicate<Employee> p3 = emp -> emp.designation.equals("developer") & emp.city.equals("pune");
        System.out.println("employee who are developer and live in pune");
        display(p3,l1);
    }
    public static void display(Predicate<Employee>p1,ArrayList<Employee>l1){
        for(Employee e:l1){
            if(p1.test(e)){
                System.out.println(e);
            }
        }
    }

}
