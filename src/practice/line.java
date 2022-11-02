package practice;

import java.util.Scanner;
import java.util.*;

public class line {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double length ;

        System.out.println("eneter x1 coordinates :");
        x1 = scan.nextInt();
        System.out.println("eneter y1 coordinates :");
        y1 = scan.nextInt();
        System.out.println("enter x2 coordinates : ");
        x2 = scan.nextInt();
        System.out.println("enter ur y2 coordinates ");
        y2 = scan.nextInt();
        scan.close();

        length = Math.sqrt(Math.pow(x2 -x1 , 2) + (Math.pow(y2-y1 , 2)));
        System.out.println(length);

    }
}
