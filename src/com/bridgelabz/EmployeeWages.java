package com.bridgelabz;

public class EmployeeWages {
    final static int EMP_FULL_TIME = 1;
    final static int EMP_PART_TIME = 2;
    final static int WAGES_PER_HRS = 20;
    public static void main(String[] args) {
        int empHrs = 0;
        int dailyWages = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (EMP_FULL_TIME == empCheck )
        {
            System.out.println("employee is present full time ");
            empHrs = 8;
        } else if (EMP_PART_TIME == empCheck)
        {
            System.out.println("employee is present for part time ");
            empHrs = 4;
        } else
        {
            System.out.println("employee is absent");
            empHrs = 0;
        }
        dailyWages = WAGES_PER_HRS * empHrs;
        System.out.println("employee daily wages is: "+ dailyWages);
    }
}
