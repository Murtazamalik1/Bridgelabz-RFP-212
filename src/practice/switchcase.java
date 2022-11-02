package practice;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        int age;
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter ur age");
        age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("you are going to becomes adult");
                break;
            case 24:
                System.out.println("you are going to join a job");
                break;
            case 30:
                System.out.println("do a marriage now");
                break;
            case 60:
                System.out.println("enjoy your life now");
                break;
            default:
                System.out.println("thank you ");
        }
    }
}
