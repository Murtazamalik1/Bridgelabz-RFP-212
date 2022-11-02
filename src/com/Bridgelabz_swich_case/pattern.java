package com.Bridgelabz_swich_case;

public class pattern {
    public static void main(String[] args) {
        int i,j;
       for (i = 1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }


        for (i=1;i<=6;i++){
            for (j=6;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
