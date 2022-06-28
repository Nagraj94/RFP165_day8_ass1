package com.bridgelabz;

public class EmployeeWages {
    final static int EMP_FULL_TIME = 1;
    final static int EMP_PART_TIME = 2;
    final static int WAGES_PER_HRS = 20;
    public static void main(String[] args) {
        int empHrs = 0;
        int dailyWages = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck){
            case EMP_FULL_TIME:
                System.out.println("employee is present for full time ");
                empHrs = 8;
                break;
            case EMP_PART_TIME:
                System.out.println("employee is present for part time ");
                empHrs = 4;
                break;
            default:
                System.out.println("employee is absent");
                empHrs = 0;
                break;
        }
        dailyWages = WAGES_PER_HRS * empHrs;
        System.out.println("employee daily wages is: "+ dailyWages);
    }
}
