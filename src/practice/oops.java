package practice;

class Parent {
    public void m1() {
        System.out.println("PARENT");
    }
}

class Child extends Parent {
    public void m1() {
        System.out.println("CHILD");
    }
}

public class oops {
    public static void main(String[] args) {

        Parent p = new Child();
        p.m1();
        //((Parent)p).m1(); ----> I tried this but of no use
    }
}

