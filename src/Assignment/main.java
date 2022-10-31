package Assignment;
import java.util.Scanner;

//Java Program to Compute Quotient and Remainder

public class main {
    public static void main(String[] args) {

        int num1, num2, quotient, remainder;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend: ");
        num1 = sc.nextInt();
        System.out.println("Enter the divisor: ");
        num2 = sc.nextInt();

        quotient = num1 / num2;
        remainder = num1 % num2;

        // Displaying output
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        //Java Program to Check Whether a Number is Even or Odd

        Scanner i = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("the number is even :" + num);

        else {
            System.out.println("the number is odd :" + num);
        }


        //Java Program to Swap Two Numbers

        int temp;
        int val1 = 30;
        int val2 = 10;

        temp = val1;
        val1 = val2;
        val2 = temp;

        System.out.println("val1 =" + val1 + "val2" + val2);

//Java Program to Check Whether an Alphabet is Vowel or Consonant
        char ch;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        ch = scanner.next().charAt(0);
        if (ch == 'a' || ch== 'i' || ch == 'e' || ch == 'o' || ch == 'u')
            System.out.println("it is vowel" + ch);
        else {
            System.out.println("it is  Consonant");

        }

        //Java Program to Find the Largest Among Three Numbers

       /* int num1, num2, num3;
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

*/

    }
}


