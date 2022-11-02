package com.bridgelabz_oops;


 class student {
    String name;
    int age, roll_no;

    public void print(String name) {
        System.out.println(name);
    }

    public void print(int age) {
        System.out.println(age);
    }

    public void print() {
        System.out.println(roll_no);

    }

    public class main {
        public static void main(String[] args){
            student s1 = new student();
            s1.name  = "murtaza";
            s1.roll_no = 29;
            s1.age = 30;


        }
    }
}

