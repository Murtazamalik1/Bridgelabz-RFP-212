package com.bridgelabz_class;

import java.util.Scanner;

public class multi_class {
    int id;
    String name;

}

class student1 {
    public static void main(String[] args) {

        multi_class s1 = new multi_class();
        student s2 = new student();
        s1.id = 2233;
        s1.name = "tajamul";
        s2.id = 2234;
        s2.name = "shyeem";
        System.out.println("the id of student is :"+s1.id +" "+" "+s1.name);
        System.out.println("the id of student is :"+s2.id +" "+" "+s2.name);

    }
}
