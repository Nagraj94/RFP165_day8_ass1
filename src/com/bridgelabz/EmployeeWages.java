package com.bridgelabz;

public class EmployeeWages {
    final static int EMP_PRESENT = 1;
    final static int WAGES_PER_HRS = 20;
    public static void main(String[] args) {
        int empHrs = 0;
        int totalWages = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (EMP_PRESENT == empCheck )
        {
            System.out.println("employee is present");
            empHrs = 8;
        }
        else
        {
            System.out.println("employee is absent");
            empHrs = 0;
        }
        totalWages = WAGES_PER_HRS * empHrs;
        System.out.println("employee total wages is: "+ totalWages);
    }
}
