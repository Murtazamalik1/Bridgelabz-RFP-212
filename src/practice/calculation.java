package practice;

public class calculation {
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
