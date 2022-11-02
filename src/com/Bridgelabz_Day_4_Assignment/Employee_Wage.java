package com.Bridgelabz_Day_4_Assignment;

public class Employee_Wage {
    public static void main(String[] args) {
        int full_time_emp = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == full_time_emp)
            System.out.println("employee is present");
        else
            System.out.println("employee is not present");


        //empwage_uc2 Calculate Daily
        //Employee Wage - Assume Wage per Hour is 20 - Assume Full Day Hour is 8

            int is_full_time_emp = 1;
            int EMP_RATE_PER_HOUR  = 20;

            //variable
            int empHrs = 0;
            int empwage = 0;
            double empcheck1 = Math.floor(Math.random() * 10) % 2;
        if (empcheck==is_full_time_emp)
            empHrs=8;


            empwage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("empwage:" + empwage);

        //empwage uc3 Add Part time
        //Employee & Wage
        //- Assume Part time Hour is 8

        int is_part_time = 1;
        int is_full_time_emp1 = 2;
        int EMP_RATE_PER_HOUR2  = 20;

        //variable
        int empHrs1 = 0;
        int empwage1 = 0;
        double empcheck2 = Math.floor(Math.random() * 10) % 3;
        if (empcheck == is_full_time_emp)
            empHrs = 8;
        else if (empcheck == is_part_time)

            empHrs = 4;
        empwage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("empwage:" + empwage);

        }
    }

