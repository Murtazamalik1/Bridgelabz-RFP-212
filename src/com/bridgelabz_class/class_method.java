package com.bridgelabz_class;

import java.util.Scanner;

/*public class class_method {
    static  void  mymethod(){
        System.out.println("hello malik");

    }

    public static void main(String[] args) {
       mymethod();

    }


static void add(){
    int a=10,b=30;
    int c = a+b;
    System.out.println("the add of two number is "+c);
}

    public static void main(String[] args) {
    add();

    }

    */

/*public class class_method {
    String name = "malik";
    int Roll_no = 29;
    void insert(){
        System.out.println(name+""+Roll_no);
    }

    public static void main(String[] args) {
        class_method s1 = new class_method();
        s1.insert();
    }

}
*/
 class calculation {
    int z;
    public void add(int x, int y){
        z = x+y;
        System.out.println("the addition of two number s :");
    }
    public void sub( int x, int y){
        z = x-y;
        System.out.println("the subtraction of two number is :"+z);

    }
    class my_calculation extends com.bridgelabz_oops.calculation {
        public void mul(int x, int y){
            z = x*y;
            System.out.println("the multiplication of two number is :"+z);
        }

        public void main(String[] args) {
            int a = 10;
            int b =30;
           my_calculation c1 = new my_calculation();
            c1.add(a,b);
            c1.sub(a,b);
            c1.mul(a,b);
        }
    }
}


