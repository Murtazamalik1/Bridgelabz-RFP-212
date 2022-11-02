package practice;

public class demo {
    public static void main(String[] args) {
        int i = 12;
        int[] ia = {12, 12, 3, 4};
        print("abc"); // String
        print(ia); // array
        print(i);// Integer -> Number -> Object
        print(12.0); // Double -> Number -> Object
        print('@'); // Character -> Object

//
    }

    public static <T> void print(T i) { // Object
        System.out.println(i);
    }

    public static <T> void print(T[] i) { // Object
        System.out.println(i);
    }


/*
public static void print (String i) {
System.out.println(i);
}

public static void print (Double i) {
System.out.println(i);
}

public static void print (char i) {
System.out.println(i);
}*/
}


class A {

}

class B extends A {

}

class M {
    public static void main(String[] args) {
        A a = new B();
        Object object = a;
        Object object2 = new B();
    }
}

