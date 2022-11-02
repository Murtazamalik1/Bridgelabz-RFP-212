package com.bridgelabz_class;

public class student {
   /* int id = 2536;
    String name = "murtaza";

    public static void main(String[] args) {
        student obj = new student();//initialize object
        System.out.println("the id of student is :" +obj.id);
        System.out.println("the name of the student is :"+obj.name);

    }
    //three ways to initialize the object
    //1 using reference

    */

    int id;
    String name;

    public static void main(String[] args) {
        student s1 = new student();
        s1.id = 3333;//reference
        s1.name = "shahyeem";//reference
        System.out.println(s1.id+""+s1.name);

        //create multiple object
    }
}
