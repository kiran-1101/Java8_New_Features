package org.stream;

import java.util.*;
import java.util.stream.Collectors;

class Employee
{
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getGender()
    {
        return gender;
    }
    public String getDepartment()
    {
        return department;
    }
    public int getYearOfJoining()
    {
        return yearOfJoining;
    }
    public double getSalary()
    {
        return salary;
    }
    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

}
class  EmployeeMain{
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList
                (new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
                 new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),
                 new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
                 new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),
                 new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0)    );

//        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
//        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
//        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
//        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
//        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

//        Optional<Employee> emp = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
//        System.out.println(emp.get());
        employeeList.stream().filter(employee -> employee.age > 25).forEach(System.out::println);
        //filter and map both same time
        employeeList.stream().filter(employee -> employee.age > 27).map(employee -> employee.getSalary()).forEach(System.out :: println);
    }
}

