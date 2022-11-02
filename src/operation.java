import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        int x, y, sum, sub, mul;
        float d;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        x = sc.nextInt();
        System.out.println("enter second number :");
        y = sc.nextInt();

        sum = x+y;
        sub = x-y;
        mul = x*y;
        d = x%y;
        {

            System.out.println("the sum of two number x and y is " + sum);
            System.out.println("the sub of two number is " + sub);
            System.out.println("the mul of two number is" + mul);
            System.out.println("the divide of two number is" +d);

        }
    }

}




