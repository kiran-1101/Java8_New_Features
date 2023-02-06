package org.Function;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;
    public  Student(String name, int marks){
        this.marks = marks;
        this.name = name;
    }
}
public class StudentGrade {
    public static void main(String[] args) {
        Student[] students = {new Student("kiran", 70),
                new Student("raj", 60),
                new Student("akash", 50),
                new Student("rahul", 30),};

        Function<Student, String> f1 = student -> {
            String grade = null;
            int marks = student.marks;
            if (marks > 70) grade = "A GRADE";
            else if (marks >= 60) grade = "B GRADE";
            else if (marks >= 50) grade = "C GRADE ";
            else grade = "fail";
            return grade;
        };

        Consumer<Student>  consumer = student -> {
            System.out.println("student name is "+student.name);
            System.out.println("studnet marks is "+student.marks);
            System.out.println("student grade is "+ f1.apply(student));
            System.out.println();
        };
        Predicate<Student> p1 = student -> student.marks>=60;

        for (Student s1 : students)
        if (p1.test(s1))
        {
            consumer.accept(s1);
        }
    }
}
