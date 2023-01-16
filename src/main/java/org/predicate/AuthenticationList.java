package org.predicate;

//program to find the software engineer allow in pub
//who have gf and age above 25 years

import java.util.function.Predicate;

class SoftwareEngineer{
    String name;
    int age;
    boolean ishavingGf;
    SoftwareEngineer(String name, int age, boolean ishavingGf){
        this.age = age;
        this.name = name;
        this.ishavingGf= ishavingGf;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class AuthenticationList {
    public static void main(String[] args) {
        Predicate<SoftwareEngineer> allow = SoftwareEngineer-> SoftwareEngineer.age>23 && SoftwareEngineer.ishavingGf== true;
        SoftwareEngineer[] list = {new SoftwareEngineer("kiran",28,true ),
                                    new SoftwareEngineer("rahul",25,false),
                                    new SoftwareEngineer("akash",29,true),
                                    new SoftwareEngineer("trilok",24,true),
                                    new SoftwareEngineer("prasad",37,false)};
        System.out.println("allowed list into pub is :- ");
      for(SoftwareEngineer se : list){
          if(allow.test(se)){
              System.out.println(se);
          }
      }
    }


}
