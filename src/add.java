import java.util.Scanner;

public class add {

    public static void main(String[] args) {
    /*    int num1 = 10;
        int num2 = 7;
        int num3 = 98;
        int sum;

        sum = num1+num2+num3;
        System.out.println("the sum of three number is" + sum);
*/


        int num1, num2, num3;
        int large;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        num1 = scanner.nextInt();
        System.out.println("enter second number");
        num2 = scanner.nextInt();
        System.out.println("enter third number");
        num3 = scanner.nextInt();

        if (num1 > num2 || num1 > num3){
            large = num1;
        }

        else if (num2>num3 ){
           large = num2;
        }

        else
        {
                large = num3;

        }
        System.out.println("the largest number among three is :" + large);

        }

    }

